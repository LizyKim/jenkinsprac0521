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
                    echo "✅ Jenkins Build 성공!" > result.txt
                    echo "🕒 시간: ${BUILD_TIME}" >> result.txt
                    echo "🔢 빌드 번호: ${BUILD_NUMBER}" >> result.txt
                    echo "👤 실행자: ${BUILD_USER}" >> result.txt || echo "실행자 정보 없음" >> result.txt
                '''
                archiveArtifacts artifacts: 'result.txt', onlyIfSuccessful: true
            }
        }
    }

    post {
        success {
            echo '🎉 모든 단계 성공적으로 완료!'
        }
        failure {
            echo '❌ 빌드 실패! 원인을 분석하세요.'
        }
    }
}
