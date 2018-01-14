import java.nio.charset.StandardCharsets
import javax.xml.transform.stream.*
import com.cloudbees.groovy.cps.NonCPS

def call() {

  pipeline {
    agent any
    options { timestamps() }
    stages {
      stage ('jojojo') {
        steps {
          echo params.ver
          sh 'env'
          script {
              doNonScp()
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
  def xmlStream = new ByteArrayInputStream( configXml.getBytes(StandardCharsets.UTF_8) )

  if (job) {
    job.updateByXml(new StreamSource(xmlStream))
  }
  else {
    ins.createProjectFromXML(jobName, xmlStream)
  }
}
