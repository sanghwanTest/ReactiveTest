pipeline {
  agent any
  stages {
    stage('initMessage') {
      steps {
        echo 'blue ocean pipeline init'
      }
    }
    stage('checkGradle') {
      steps {
        sh 'gradle -v'
      }
    }
  }
}