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
        build 'clean'
      }
    }
  }
  environment {
    gradleName = 'Gradle'
  }
}