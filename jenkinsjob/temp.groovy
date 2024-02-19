pipelineJob('temp') {
    displayName('display name of temp groovy file')

    parameters {
        stringParam(parameterName="name", defaultValue="Aniket", description="your name")
    }

    definition {
        cps {
            script(readFileFromWorkspace('pipelines/temp.jenkinsfile'))
            sandbox()
        }
    }
}
