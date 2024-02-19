pipelineJob('temp') {
    displayName('display name of temp groovy file')

    parameters {
        stringParam(parameterName="name", defaultValue="Aniket", description="your name")
        stringParam(parameterName="name2", defaultValue="2nd param", description="2nd param description goes here")
    }

    definition {
        cps {
            script(readFileFromWorkspace('pipelines/temp.jenkinsfile'))
            sandbox()
        }
    }
}
