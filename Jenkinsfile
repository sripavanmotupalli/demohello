pipeline{
    agent any
    stages {
        stage ('Compile stage'){
            steps {

                    sh 'mvn clean compile'

            }
        }
        stage ('Test stage'){
            steps {

                    sh 'mvn test'

            }
        }
        stage ('Deploy stage'){
            steps {

                    sh 'mvn deploy'

            }
        }
    }
}