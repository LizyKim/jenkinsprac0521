pipeline {
  agent any
  options {
    skipStagesAfterUnstable()
  }
  stages {
    stage('Build') {
      steps {
        echo //sh 'make' 대신 넣음, gpt
      }
    }
    stage('Test') {
      steps {
        echo // sh 'make check'
        // junit 'reports/**/*.xml'
      }
    }
    stage('Deploy') {
      steps {
        echo //sh 'make publish'
      }
    }
  }
}
