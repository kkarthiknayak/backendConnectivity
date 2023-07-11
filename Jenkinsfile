pipeline {
    agent any
    tools {
        gradle 'gradle'
        // Use the configured Node.js installation specified by 'your-nodejs-tool-name'
    }
    
    stages {
        stage('Checkout') {
            steps {
                
                git credentialsId: 'demo-pipeline-project',
                url: 'https://github.com/kkarthiknayak/backendConnectivity.git',
                branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        
        
    

        
        // Add more stages for building, testing, etc.
    }
}
