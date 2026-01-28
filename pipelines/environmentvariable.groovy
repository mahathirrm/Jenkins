pipeline{
    agent any
       environment{
           Name ="Denvo"
           Age = 33
           City= "Yorkshire"
       }
    stages{
        stage('stage1'){
            steps{
                echo "Hello My Name is ${env.Name}"
            }
        }
        stage('stage2'){
            steps{
                echo "I am ${env.Age} years old and I live in ${env.City}"
            }
        }
        stage('stage3'){
            steps{
                echo "My name is ${Name}, I am ${Age} years old and I live in ${City}"
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