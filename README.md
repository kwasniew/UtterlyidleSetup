UtterlyidleSetup
================

Utterlyidle (http://code.google.com/p/utterlyidle/wiki/GettingStarted) based project template used to kickstart new projects.


Usage
--------

Prerequisites: Java 1.6, ant

1.  git clone _repo_url_
2.  cd UtterlyidleSetup
3.  ant (builds the app)
4.  ant run (runs the app using a default port of 8181)
5.  Go to http://localhost:8181/main

Project Files and Directories
--------

`build.xml` - main ant build file  

`src` - app sources go here  

`test` - app tests (unit, functional, performance) go here  

`lib` - ant and shavenmaven jars are here by default, all other jar dependencies downloaded from shavenmaven will be automatically
put here  

`build/artifacts` - all build generated artifacts go here (release-scripts, test reports, app jar, app tarball etc.)  

`build/commit` - commit stage ant macros  

`build/dependencies` - shavenmaven config file and all dependencies declarations are here (no transitive dependencies, everythin
 has to be declared explicitly)  

`build/deploy` - deploy stage ant macros  

`build/environments` - deployment/release related properties. You can put your environment specific files (e.g. build.dev.properties,
 build.test.properties, build.prod.properties) here.  

Deployment and Release
--------

This project template comes with deployment and release scripts out of the box. 
First you need to setup how you gonna access a remote server. We use SSH with key access. No plain text passwords in deployment
scripts! We suggest you put your properties in build/environments in a file called e.g. build.dev.properties

`ssh.username=me`  
`ssh.key=/Users/me/.ssh/private_key`  
`ssh.passphrase=secret_password`  
`ssh.hostname=192.168.20.100`  
`ssh.port=8080`  
`ssh.toDir=/home/me/my_app_dir`

Once you have this file setup you can deploy the app to a server and release it with one click/one command:

`ant -Dbuild.properties=build/environments/build.dev.properties -Dbuild.number=100 click`

If you want to split build/packaging, deploy and release into separate activities (e.g. to plug them into
different stages of your deployment pipeline) you can invoke the following sequence of commands:

`ant -Dbuild.number=100 package`  
`ant -Dbuild.number=100 -Dbuild.properties=build/environments/build.dev.properties deploy`  
`ant -Dbuild.number=100 -Dbuild.properties=build/environments/build.dev.properties release`  

To rollback to a previous version:
`ant -Dbuild.properties=build/environments/build.dev.properties rollback`
