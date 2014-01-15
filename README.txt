Before doing this, make sure you installed mongodb.
$ mongo
The above should work and go to the mongodb terminal

How to run play and play around with the sample project
http://www.playframework.com/download

Download Play Framework 2.2.1 and extract

$ vi ~/.bash_profile
$ export PATH=$PATH:/Users/*your-username*/Desktop/play-2.2.0
$ source ~/.bash_profile

play help /* now should work*/

The samples should be inside the play folder under samples

cd into the play project and type the following
$ play eclipse

then import as a general project in eclipse


To run play project, cd into the project
type the following in the command line

$ play 
$ run

navigate to http://localhost:9000/


Some more tutorial/information
http://www.playframework.com/documentation/2.2.x/JavaHome
http://www.playframework.com/documentation/2.2.x/JavaTodoList
http://www.playframework.com/modules/mongo-1.1/home
https://github.com/mongodb/morphia/wiki/MappingObjects

if mongodb doesn't work and needs repair
http://stackoverflow.com/questions/16245805/unable-to-connect-to-mongodb-error-couldnt-connect-to-server-127-0-0-127017-a
