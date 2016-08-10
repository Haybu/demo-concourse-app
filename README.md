== copy the properties file into a local .concourse folder
cp ./concourse/demo-resource-properties.yml ~/.concourse/.

== change the mode of the properties file
chmod 600 ~~/.concourse/demo-resource-properties.yml

== create a pipleLine:
fly -t lite sp -p demo-pipeline -c ./concourse/pipeline.yml -l ./concourse/demo-resource-properties.yml


== test the task
fly -t lite execute -c ./concourse/build.yml -i resource-git=.

== trigger the job using [pipeline name]/[job name]
fly -t lite trigger-job --job demo-pipeline/package-job

== unpause the pipeline (only when a pipeline is created for the first time)
fly -t lite unpause-pipeline -p demo-pipeline