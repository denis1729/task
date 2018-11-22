pipeline{
        agent any
        stages{
                stage('Build'){
                        steps{
                                echo 'Building'
                                sh './webaplication/gradlew clean assemble -p webaplication'
                        }
                }
                stage('Testing'){
                        steps{
                                echo 'Runnig unit test'
                                sh './webaplication/gradlew test -p webaplication'
                                junit '**/test-results/test/*.xml'
                        }
                }
                stage('Publish'){
                        steps{
                                echo 'Publishing Artifact'
                                sh './webaplication/gradlew uploadArchives -p webaplication'
                                archiveArtifacts artifacts: '**/repos/*.war'
                        }
                }
        }
}
