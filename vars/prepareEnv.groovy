def verify_parametr(parameters, param){
    if (!parameters.containsKey(name)){
        throw new Exception("Missing parameter: ${param}")
    }
}

def get(script, parameters){

}

def call(Map parameters = [:]){
    verify_parametr(parameters, 'script')
    verify_parametr(parameters, 'action')
    switch(parameters.action){
        case 'get':
            get(script, parameters)
            break
        default:
            // unsupported action
            break
    }
}

return this
