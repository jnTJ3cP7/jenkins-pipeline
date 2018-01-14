def call() {

  pipeline {
    agent any
    stages {
      stage ('jojojo') {
        steps {
          echo params.ver
        }
      }
    }
  }
}