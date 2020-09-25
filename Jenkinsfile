node{
    stage('git checkout'){
        git 'https://github.com/Suchismita75/cicd-pipeline.git'
    }
     stage('build & test'){
       //sh 'mvn clean package' 
    def mavenHome = tool name: 'maven-3', type: 'maven'
    def mavenCMD = "${mavenHome}/bin/mvn"
    sh "${mavenCMD} clean package"     
     }
     stage('build docker image'){
        sh 'docker build -t suchismitak75/war-test:1.0.0 .'
    }
    stage('push docker image to docker hub'){
        withCredentials([string(credentialsId: 'dockerHubPassword', variable: 'dockerHubPwd')]) {
    sh "docker login -u suchismitak75 -p ${dockerHubPwd}"
    }
    sh 'docker push suchismitak75/war-test:1.0.0'
    }
    stage('run the docker image'){
        sh 'docker run -p 8889:8080 -d suchismitak75/war-test:1.0.0'
    }
}
