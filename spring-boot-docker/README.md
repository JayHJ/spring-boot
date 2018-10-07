# Spring boot docker
Integration docker with spring boot application

#### basic command to be noticed
mvn package will not trigger docker build default.  
mvn package -Plocal-docker will trigger docker build and generate docker image in local  
mvn pakcage -Plocal-docker-push -DpushImage will trigger docker build and push the image to local registry(any registry)  
mvn package -Prepo-docker-push -DpushImage will trigger docker build and push the image to remote registry(any registry)  

- Normally -DpushImage is must parameter when trying push image to any registry, otherwise it will only save the image in local
- Refer to pom.xml, if we want to set the server authentication fo registry, we can set it in the maven's setting.xml to avoid show password in the pom.xml file

