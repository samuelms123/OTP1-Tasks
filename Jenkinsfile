pipeline{
    agent any
    tools{
        maven 'MAVEN'
    }
    stages{
        stage('checking'){
            steps{
                git branch:'master', url:'https://github.com/samuelms123/OTP1-Tasks.git'
            }
        }
        stage('build'){
            steps{
                bat 'mvn clean install'
            }
        }
        stage('Test') {
             steps {
                 bat 'mvn test'
             }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}