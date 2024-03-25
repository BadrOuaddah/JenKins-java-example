node {

  stage('Clone') {
      dir('.') {
          git branch: 'master', credentialsId: 'Jenkins-testing', url: 'git@github.com:BadrOuaddah/JenKins-java-example.git'
      }
  }

  stage('Build') {
      withGradle {
        sh './gradlew clean build --stacktrace -i'
      }
  }

  stage('Publish') {
     withCredentials([usernamePassword(
        credentialsId: 'Jenkins-testing',
        usernameVariable: 'Badr.Ouaddah.07@gmail.com')]) {

        withGradle {
          sh """
            ./gradlew -i --stacktrace publish \
                -PMVN_USERNAME=${MVN_USERNAME} \
                -PMVN_VERSION=1.${BUILD_NUMBER}
          """
        }
     }
  }

}