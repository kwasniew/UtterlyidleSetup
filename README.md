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
