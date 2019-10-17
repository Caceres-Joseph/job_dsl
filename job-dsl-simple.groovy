job('Example') {
    scm {
        git('git://github.com/quidryan/aws-sdk-test.git')
        //github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        scm('* * * * *')
        //cron("@hourly")
    }
    steps {
        shell("echo 'Hello World'")
    }
}
