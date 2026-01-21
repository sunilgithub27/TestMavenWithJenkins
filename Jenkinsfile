pipeline{
	agent{label 'linux'}
	stages{
		stage('Run the tests'){
		steps {
			sh './mvnw clean test'
		}
	}
	}
	post {
		always {
			testng 'target/surefire-reports/*.xml'
		}
	}
}