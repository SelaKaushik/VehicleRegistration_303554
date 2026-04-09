pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK25'
    }

    environment {
        IMAGE_NAME = 'kaushiksela/vehicle-system'
        CONTAINER_NAME = 'vehicle-container'
        EC2_HOST = 'ubuntu@13.48.190.76'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Login to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push %IMAGE_NAME%'
            }
        }

        stage('Run Container (Local)') {
            steps {
                bat 'docker rm -f %CONTAINER_NAME% || echo No container'
                bat 'docker run -d --name %CONTAINER_NAME% %IMAGE_NAME%'
            }
        }

        // OPTIONAL: AUTO DEPLOY TO EC2
        stage('Deploy to EC2') {
            steps {
                bat """
                ssh %EC2_HOST% "docker pull %IMAGE_NAME% && docker rm -f %CONTAINER_NAME% || true && docker run -d --name %CONTAINER_NAME% %IMAGE_NAME%"
                """
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline Executed Successfully'
        }
        failure {
            echo 'Pipeline Failed'
        }
    }
}
