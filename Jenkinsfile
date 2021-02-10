pipeline {
  agent any
  tools {
    maven 'Maven 3.6.3'
  }
  stages {
      stage('Compile') {
        steps {
          echo 'This is a compile'
        }
      }
      stage('SonarQube analysis') {
        steps {
            echo 'This is a SonarQube analysis'
        }
      }
      stage('Deployment') {
        steps {
            echo 'This is a deployment'
        }
      }
  }
}