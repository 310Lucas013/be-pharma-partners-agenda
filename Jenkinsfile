pipeline {
  agent any
  tools {
    maven 'MAVEN_HOME'
  }
  stages {
      stage('Compile') {
        steps {
          echo 'This is a compile'
        }
      }
      stage('run test') {
        steps {
            echo 'This is a test'
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

