pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK25'
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
                bat 'docker build -t vehicle-system .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker rm -f vehicle-container || echo No container'
                bat 'docker run -d --name vehicle-container vehicle-system'
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
