pipeline {
    agent any

    stages {
        stage('Running Build') {
            steps {
                echo 'Running Build....'
            }
        }
        
        stage('Deployed To DEV') {
            steps {
                echo 'Running Tests on DEV....'
            }
        }
        
        stage('Deployed To UAT') {
            steps {
                echo 'Running Tests UAT....'
            }
        }
        
    }
    post{
        
        always{
            emailext body: 'Your Build is Failed', subject: 'Jenkins Build Failure', to: 'rohitdshpnd8@gmail.com'
        }
    }
}
