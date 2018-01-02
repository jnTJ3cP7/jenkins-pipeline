pipeline {
  agent any
  stages {
    stage('ssh') {
      steps {
        sshagent(['deployment']) {
          sh 'ls -l'
          sh 'pwd'
          sh 'env'

          sh "ssh -p 22 root@app-server 'ls -l'"
          sh "ssh -p 22 root@app-server 'pwd'"
          sh "ssh -p 22 root@app-server 'env'"
        }
      }
    }
  }
}
// @Library('hogee')
// import com.co.Example
// def pras = 'HHH\nFFF'
// def strs() {
//     System.getenv('HOSTNAME') == 'localhost.localdomain' ? 'BB\nCC' : 'ggg\nhhh\niii'
//     // 'RR\nAA'
//     // if (System.getenv('HOSTNAME') == 'localhost.localdomain') {
//     //     'BB\nCC'
//     // }
//     // 'ggg\nhhh\niii'
// }
// pipeline {
//     agent any
//     // parameters {
//     //     // choice(choices: 'hoge\nfuga', description: 'What AWS region?', name: 'region')
//     //     // choice(choices: "${pras}", description: 'What AWS region?', name: 'region')
//     //     choice(choices: strs(), description: 'What AWS region?', name: 'region')
//     // }
//     stages {
//         // stage("Compile") {
//         //     agent {
//         //         dockerfile {
//         //             dir 'Dockerfiles/build'
//         //             // args '-v /var/jenkins_home/.gradle/wrapper/dists:/root/.gradle/wrapper/dists'
//         //         }
//         //     }
//         //     steps {
//         //         // sh '/lib/x86_64-linux-gnu/libc.so.6'
//         //         sh 'chmod +x ./gradlew'
//         //         sh "./gradlew war --stacktrace"
//         //         stash includes: 'build/libs/*.war', name: 'appp'
//         //     }
//         // }
//         // stage("groooo") {
//         //     steps {
//         //         script {
//         //             env.HOSTT = InetAddress.localHost.hostName
//         //             if (env.HOSTT == 'localhost.localdomain') {
//         //                 env.RELEASE_SCOPE = input message: 'What server ?',
//         //                                         parameters: [choice(choices: 'BB\nFF', name: 'RELEASE_SCOPE')]
//         //             } else {
//         //                 env.RELEASE_SCOPE = input message: 'What server ?',
//         //                                         parameters: [choice(choices: 'ZZ\nYY', name: 'RELEASE_SCOPE')]
//         //             }
//         //         }
//         //         sh 'env'
//         //         sh 'hostname'
//         //         echo "${env.RELEASE_SCOPE}"
//         //         echo "${env.HOSTT}"
//         //     }
//         // }
//         // stage("after input") {
//         //     steps {
//         //         sh 'env'
//         //         echo 'fugaaaaaaaaaaa'
//         //         echo "${env.RELEASE_SCOPE}"
//         //     }
//         // }
//         // stage("when test") {
//         //     when {
//         //         environment name: 'HOSTT', value: 'localhost.localdomain'
//         //     }
//         //     steps {
//         //         echo '!!!!!!!'
//         //     }
//         // }
//         // stage("when test2") {
//         //     when {
//         //         environment name: 'HOSTT', value: 'gugego'
//         //     }
//         //     steps {
//         //         echo '???????'
//         //     }
//         // }
//         // stage ('shared lib') {
//         //     steps {
//         //         tes()
//         //     }
//         // }
//         stage ('src') {
//             steps {
//                 script {
//                     CONFIG = readYaml(file: 'dir/config.yml').obj2
//                 }
//                 exx(CONFIG)
//             }
//         }
//         stage ('shared lib2') {
//             steps {
//                 script {
//                     CONFIG = readYaml(file: 'dir/config.yml')
//                     pipel {
//                         name = 'ssss'
//                     }
//                 }
//                 echo "${CONFIG}"
//                 // pipel("${CONFIG}")
//             }
//         }
//         stage ('gitt') {
//             environment {
//                 TAGG = 'testdayo'
//             }
//             steps {
//                 sh 'git describe'
//                 // sh script: "git show-ref -s -d --abbrev testdayo | awk '/\^{}$/ {print $1}'", returnStdout: true
//                 version "${TAGG}"
//             }
//         }
//     }
//     post {
//         always {
//             deleteDir()
//         }
//     }
// }
