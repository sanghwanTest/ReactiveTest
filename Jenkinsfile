pipeline {
  agent any
  stages {
    stage('initmessage') {
      parallel {
        stage('initmessage') {
          steps {
            sh 'echo "init test"'
            sh 'echo "init test2"'
          }
        }
        stage('DeleteDockerContainer') {
          steps {
            sh '''conName=`sudo docker ps -a | grep app02con | awk \'{print $NF}\' | wc -l`
conID=`sudo docker ps -a | grep app02con | awk \'{print $1}\'`
if [ ${conName} -gt 0 ] ; then
	echo "stop container app02con"
    sudo docker stop ${conID}
    echo "remove container app02con"
    sudo docker rm ${conID}
fi'''
          }
        }
      }
    }
    stage('gradleBuild') {
      parallel {
        stage('gradleBuild') {
          steps {
            sh '/var/lib/jenkins/tools/hudson.plugins.gradle.GradleInstallation/Gradle/bin/gradle clean build -b /var/lib/jenkins/workspace/ReactiveTest_master/ReactiveRESTfulWebServiceV2/build.gradle'
          }
        }
        stage('DeleteDockerImage') {
          steps {
            sh '''imageName=`sudo docker images | grep testapp02 | awk \'{print $1}\' | wc -l`
imageTag=`sudo docker images | grep testapp02 | awk \'{print $2}\' | wc -l`
imageID=`sudo docker images | grep testapp02 | awk \'{print $3}\'`

if [ ${imageName} -gt 0 ] && [ ${imageTag} -gt 0 ] ; then
        echo "remove docker image"
        sudo docker rmi ${imageID}
fi'''
          }
        }
      }
    }
    stage('CreateDockerImage') {
      steps {
        sh 'sudo docker build -f ReactiveRESTfulWebServiceV2/Dockerfile -t testapp02:0.0 .'
      }
    }
    stage('CreateDockerContainer') {
      steps {
        sh 'sudo docker run -d -p 18081:18081 --name app02con testapp02:0.0'
      }
    }
  }
}