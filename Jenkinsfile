pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/agrawalvrushabh/otp-service.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t otp-service:latest .'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
