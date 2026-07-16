pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                bat 'start cmd /c "java -jar target\\inter-maven-0.0.1-SNAPSHOT.jar"'
            }
        }
    }

    post {
        success {
            echo 'Spring Boot Application Started Successfully!'
        }

        failure {
            echo 'Build Failed!'
        }
    }
}