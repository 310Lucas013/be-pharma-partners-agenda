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
            mvn sonar:sonar -Dsonar.login=2d21b6ecb01a7f36703ca2eac4f04729c17f2b03
        }
      }
      stage('Deployment') {
        steps {
            echo 'This is a deployment'
        }
      }
  }
}

