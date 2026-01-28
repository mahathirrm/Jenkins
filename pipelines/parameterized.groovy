pipeline{
    agent any
    parameters{
        string(name: 'Name', description: 'Enter your name')
        choice(name: 'Project Build', choices: ['Developement', 'Production', 'Testing'], description: 'Choose your Project Build')
    }
    environment{
        Name = "${params.Name}"
        ProjectBuild = "${params.'Project Build'}"
    }
    stages{
        stage('stage1'){
            steps{
                echo "Hello My Name is ${env.Name} and I am working in ${env.ProjectBuild} Environment"
            }
        }
        
    }
}    
