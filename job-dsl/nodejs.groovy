job('NodeJS example') {
    scm {
        git('git://github.com/arjunachari12/docker-demo.git') {  node -> 
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
    }
}
