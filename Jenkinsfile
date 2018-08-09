pipeline{
    agent any
    stages {
        stage ('Compile stage'){
            steps {
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Test stage'){
            steps {
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn test'
                }
            }
        }
        stage ('Deploy stage'){
            steps {
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}