import jenkins.model.*

def call() {


  pipeline {
    agent any
    stages {
      stage ('jojojo') {
        steps {
          echo params.ver
          sh 'env'
          sh 'java -jar jenkins-cli.jar help'
          script {
              sh 'pwd'
              sh 'ls -ltra'
              def instance  = Jenkins.getInstance()
              def xmlStream = new ByteArrayInputStream( 'hogeeeeee'.getBytes() )
              instance.createProjectFromXML('ex4', xmlStream)
              sh 'pwd'
              sh 'ls -ltra'
          }
        }
      }
    }
  }
}