pipeline {
  agent any
  stages {
    stage('initmessage') {
      steps {
        sh 'echo "init test"'
        sh 'echo "init test2"'
      }
    }
    stage('gradleBuild') {
      steps {
        sh '/var/lib/jenkins/tools/hudson.plugins.gradle.GradleInstallation/Gradle/bin/gradle clean build -b /var/lib/jenkins/workspace/ReactiveTest_master/ReactiveRESTfulWebServiceV2/build.gradle'
      }
    }
  }
}