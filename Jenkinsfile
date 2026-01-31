pipeline {
    agent any

    tools {
            maven 'M3'
        }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/agrawalvrushabh/otp-service.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t otp-service:latest .'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                 bat 'kubectl apply -f k8s/'
            }
        }
    }
}
