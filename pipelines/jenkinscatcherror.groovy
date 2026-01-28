pipeline{
    agent any
    stages{
        stage('stage1'){
            steps{
                echo "Hello World"
            }
        }
        stage('stage2'){
            steps{
                // Using catchError to handle errors and set the stage result to FAILURE
                catchError(message: 'failed', stageResult: 'FAILURE'){
                    sh '/bin/false'
                    echo "stage 2 executed"
                }
            }
        }
        stage('stage3'){
            steps{
                // Using catchError to handle errors eventhough stage fails we set the stage result to SUCCESS
                catchError(message: 'failed', stageResult: 'SUCCESS'){
                    sh '/bin/false'
                    echo "stage 3 executed"
                }
            }
        }
        stage('stage4'){
            steps{
                echo "stage 4 executed"
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
            echo "This script will run if it fails"
        }
    }
}