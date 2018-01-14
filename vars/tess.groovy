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
  def jobName = 'ex8'
  def ins = Jenkins.getInstance()
  // def job = ins.getItemByFullName(jobName, AbstractItem)
  // def configXml = new File("${env.JENKINS_HOME}/config.xml.test").text
  // def xmlStream = new ByteArrayInputStream( configXml.getBytes() )

  // if (job) {
  //   job.updateByXml(xmlStream);
  // }
  // else {
  //   ins.createProjectFromXML(jobName, xmlStream)
  // }
  ins.getAllItems(AbstractItem).each {
    echo it.fullName
  }

}