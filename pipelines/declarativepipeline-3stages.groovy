pipeline {
    agent any

    stages {
        stage('stage1') {
            steps {
                echo 'Hello World'
            }
        }
        stage('stage2'){
            steps{
                echo "stage 2"
            }
        }
        stage('stage3'){
            steps{
                echo "stage 3"
            }
        }
    }
    post{
        always{
            echo "This script will always run"
        }
        success{
            echo "This script will run on success"
        }
        failure{
            echo "This script will run if its fail"
        }
    }
}