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
                bat 'mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push %IMAGE_NAME%'
            }
        }

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
            echo 'Fast CI/CD Pipeline Executed'
        }
        failure {
            echo 'Pipeline Failed'
        }
    }
}
