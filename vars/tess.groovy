import jenkins.model.*
import com.cloudbees.groovy.cps.NonCPS

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
              doNonScp()
              sh 'pwd'
              sh 'ls -ltra'
          }
        }
      }
    }
  }
}

@NonCPS
def doNonScp() {
  def instance  = Jenkins.getInstance()
  def configXml = new File("${env.JENKINS_HOME}/config.xml.test").text
  def xmlStream = new ByteArrayInputStream( configXml.getBytes() )
  instance.createProjectFromXML('ex7', xmlStream)
}