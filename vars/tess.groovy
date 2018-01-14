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
              echo instance.class.name
              sh 'pwd'
              sh 'ls -ltra'
          }
        }
      }
    }
  }
}