@Library("Jenkins")_
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                helloworld()
            }
        }
    }
}
