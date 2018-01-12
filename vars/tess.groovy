def call() {
  properties([parameters([[$class: 'ExtensibleChoiceParameterDefinition', choiceListProvider: [$class: 'TextareaChoiceListProvider', addEditedValue: false, choiceListText: '''pjh
omoo
'''], description: '', editable: true, name: 'oikoi']])])

  pipeline {
    agent any
    stages {
      stage ('jojojo') {
        steps {
          echo oikoi
        }
      }
    }
  }
}