job('NodeJS Create Pliplein Automatiily From DSL') {
    scm {
        git('git://github.com/md3danish/docker-demo.git') {  node -> 
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') 
                         
    }
    steps {
        shell("npm install")
        shell("echo test")
    }
}
