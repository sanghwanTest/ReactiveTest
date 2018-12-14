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
        sh '/var/lib/jenkins/tools/hudson.plugins.gradle.GradleInstallation/Gradle/bin/gradle clean build -b /var/lib/jenkins/workspace/ReactiveTest_master/ReactiveRESTfulWebServiceV2/build.gradle'
      }
    }
  }
  environment {
    gradleName = 'Gradle'
  }
}