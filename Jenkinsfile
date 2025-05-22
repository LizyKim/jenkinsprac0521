pipeline {
    agent any

    environment {
        BUILD_TIME = "${new Date().format("yyyy-MM-dd HH:mm:ss")}"
    }

    stages {
        stage('Build') {
            steps {
                echo '✅ 빌드 단계 실행 중...'
                sh 'echo "Build 단계 완료됨."'
            }
        }

        stage('Test') {
            steps {
                echo '✅ 테스트 단계 실행 중...'
                sh 'echo "Test 통과 ✅"'
            }
        }

        stage('Save Result') {
            steps {
                echo '📄 결과 파일 저장 중...'
                sh '''
                    echo "Successful Junkins Build, THIS IS BRANCH ONE." > result.txt
                    echo "execution time: ${BUILD_TIME}" >> result.txt
                    echo "build number : ${BUILD_NUMBER}" >> result.txt
                    echo "member: ${BUILD_USER}" >> result.txt || echo "no info" >> result.txt
                '''
                archiveArtifacts artifacts: 'result.txt', onlyIfSuccessful: true
            }
        }
    }

    post {
    success {
        mail to: 'hiiamlizy@gmail.com',
             subject: "✅ Jenkins 빌드 성공!",
             body: "Build #${BUILD_NUMBER} was successful."
        }
    }
}
