def gitUrl = 'https://github.com/nathanagood/cloudformation-examples.git'

job('Sample Job 1') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo \"Hello, world\" > helloworld.txt')
    }
}
