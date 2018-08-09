pipeline{
    agent any
    stages {
        stage ('Compile stage'){
            step{
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Test stage'){
            step{
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn test'
                }
            }
        }
        stage ('Compile stage'){
            step{
                withMaven(maven : 'maven_3_5_3'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}