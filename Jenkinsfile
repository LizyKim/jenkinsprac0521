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
