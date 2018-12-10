pipeline {
  agent any
  stages {
    stage('start shell') {
      steps {
        sh '''echo "blue ocean test"
echo "${server}"'''
      }
    }
  }
  environment {
    server = 'Artifactory.server "SERVER_ID"'
  }
}