import jenkins.model.*

def call() {


  pipeline {
    agent any
    stages {
      stage ('jojojo') {
        steps {
          echo params.ver
          sh 'env'
          script {
              sh 'pwd'
              sh 'ls -ltra'
              def instance  = Jenkins.getInstance()
              def configXml = new File("${env.JENKINS_HOME}/config.xml.test").text
              // def xmlStream = new ByteArrayInputStream( configXml.getBytes() )
              instance.createProjectFromXML('ex6', new ByteArrayInputStream( configXml.getBytes() ))
              sh 'pwd'
              sh 'ls -ltra'
          }
        }
      }
    }
  }
}