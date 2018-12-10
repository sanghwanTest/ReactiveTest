pipeline {
  agent any
  stages {
    stage('start shell') {
      steps {
        sh 'echo "blue ocean test"'
      }
    }
    stage('Gradle build') {
      steps {
        build 'Gradle'
      }
    }
  }
}