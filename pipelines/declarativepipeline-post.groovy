pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                ## sh '/bin/false'--to execute failure block
            }
        }
    }
    post {
        always {
            echo 'This will always run after the stages.'
        }
        success {
            echo 'This will run only if the pipeline succeeds.'
        }
        failure {
            echo 'This will run only if the pipeline fails.'
        }
    }
}