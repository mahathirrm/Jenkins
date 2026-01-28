def call() {
    sh "echo Hello world"
    sh "echo Jenkins Job Name is: ${env.JOB_NAME}"
}
