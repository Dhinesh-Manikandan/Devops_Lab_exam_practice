pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                dir('student-grade-calculator') {
                    bat 'mvn compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir('student-grade-calculator') {
                    bat 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                dir('student-grade-calculator') {
                    bat 'mvn clean package'
                }
            }
        }

        stage('Run Application') {
            steps {
                dir('student-grade-calculator') {
                    bat 'java -jar target\\student-grade-calculator-1.0-SNAPSHOT.jar'
                }
            }
        }
    }
}
