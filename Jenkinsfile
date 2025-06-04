//테스트용 주석을 추가해보았습니다.-재현-
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
            echo '🎉 모든 단계 성공적으로 완료!'
            emailext(
                subject: "✅ Jenkins 빌드 성공 - Build #${BUILD_NUMBER}",
                body: """
                🎉 빌드 성공 알림

                - 프로젝트: ${env.JOB_NAME}
                - 빌드 번호: ${env.BUILD_NUMBER}
                - 실행 시간: ${BUILD_TIME}
                - 결과 보기: ${env.BUILD_URL}
                """,
                to: 'alex6715jh@gmail.com'
            )
        }

        failure {
            echo '❌ 빌드 실패! 원인을 분석하세요.'
        }
    }
}

