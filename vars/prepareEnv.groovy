def verify_parametr(parameters, param){
    if (!parameters.containsKey(param)){
        throw new Exception("Missing parameter: ${param}")
    }
}

def get(script, parameters){
    verify_parametr(parameters, 'job_parameter')
    switch(parameters.job_parameter){
        case 'git_committer':
            def changeLogSets = script.currentBuild.changeSets
            def commitAuthor ="" 
            def commitMsg    =""
            echo 'committer'
            break
        default:
            // unsupported parameter
            break
    }
}

def call(Map parameters = [:]){
    verify_parametr(parameters, 'script')
    verify_parametr(parameters, 'action')
    switch(parameters.action){
        case 'get':
            get(parameters.script, parameters)
            break
        default:
            // unsupported action
            break
    }
}

return this
