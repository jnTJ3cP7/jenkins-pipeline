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
              def job = jobb()
              def stream = st()
              doUpd(job, stream)
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
  ins.getAllItems(AbstractItem).each {
    echo it.fullName
  }
  def job = ins.getItemByFullName(jobName, AbstractItem)
  def configXml = new File("${env.JENKINS_HOME}/config.xml.test").text
  def xmlStream = new ByteArrayInputStream( configXml.getBytes() )

  if (job) {
    // echo job.class.name
    def template = InstanceFromJobTemplate.from(job)
    echo template.class.name
    // job.updateByXml(xmlStream)
  }
  else {
    echo 'fuga'
    // ins.createProjectFromXML(jobName, xmlStream)
  }
}

// @NonCPS
// def jobb() {
//   def jobName = 'ex8'
//   def ins = Jenkins.getInstance()
//   return job = ins.getItemByFullName(jobName, AbstractItem)
// }

// @NonCPS
// def st() {
//   def ins = Jenkins.getInstance()
//   def configXml = new File("${env.JENKINS_HOME}/config.xml.test").text
//   return xmlStream = new ByteArrayInputStream( configXml.getBytes() )

// }

// def doUpd(job, stream) {
//   job.updateByXml(stream)
// }