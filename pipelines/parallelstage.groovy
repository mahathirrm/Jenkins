pipeline {
    agent any
    stages {
        stage('parallel stage') {
            parallel {
                stage('Branch A') {
                    steps {
                        script {
                            for (int i = 1; i <= 5; i++) {
                                echo "Executing Branch A - Iteration ${i}"
                            }
                        }
                    }
                }
                stage('Branch B') {
                    steps {
                        script {
                            for (int j = 1; j <= 5; j++) {
                                echo "Executing Branch B - Iteration ${j}"
                            }
                        }
                    }   
                }
            }
        }
    }
}

