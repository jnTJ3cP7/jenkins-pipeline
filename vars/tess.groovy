import jenkins.model.*

def call() {


  pipeline {
    agent any
    stages {
      stage ('jojojo') {
        steps {
          echo params.ver
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