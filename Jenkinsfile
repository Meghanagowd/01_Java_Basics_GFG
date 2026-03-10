pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Meghanagowd/01_Java_Basics_GFG.git'
            }
        }

        stage('Run Script') {
            steps {
                sh './script.sh'
            }
        }
    }
}
