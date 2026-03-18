pipeline {
    agent any

    tools {
        maven 'Maven3'   // Name configured in Jenkins
        jdk 'JDK25'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/SelaKaushik/VehicleRegistration_303554.git'
            }
        }

        stage('Clean') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build Successful ✅'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}


 
 