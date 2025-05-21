pipeline {
  agent any
  options {
    skipStagesAfterUnstable()
  }
  stages {
    stage('Build') {
      steps {
        echo '빌드 단'//sh 'make' 대신 넣음, gpt
      }
    }
    stage('Test') {
      steps {
        echo '테스트 단계'// sh 'make check'
        // junit 'reports/**/*.xml'
      }
    }
    stage('Deploy') {
      steps {
        echo '배포 단계'//sh 'make publish'
      }
    }
  }
}
