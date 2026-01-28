pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               echo "JOB NAME = ${env.JOB_NAME}"
               echo "BUILD NUMBER = ${env.BUILD_NUMBER}" 
            }
        }
    }
post{
    always{
        echo "This script will always run"
    }
    success{
        echo "This going to send success report to the email"
        emailext body: "The following ${env.JOB_NAME} and ${env.BUILD_NUMBER} is Success", 
        subject: "Notification for the ${env.JOB_NAME}", 
        to: "rmmahathir@gmail.com"
    }
    failure{
        echo "This going to send failure report to the email"
        emailext body: "The following ${env.JOB_NAME} and ${env.BUILD_NUMBER} is Failed", 
        subject: "Notification for the ${env.JOB_NAME}", 
        to: "rmmahathir@gmail.com"
    }
}
}