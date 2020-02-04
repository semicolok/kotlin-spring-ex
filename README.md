# kotlin-spring-ex  
Sample project based on Kotlin and Spring boot.  
 
## Prerequisites  
* JDK 11 or later  
* GIT  

### Running the application locally  
You can run the application from the command line using:
```shell  
./gradlew bootRun
```  
Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources with:
```shell  
./gradlew clean build
```  
Then you can run the JAR file with:  
```shell  
java -jar build/libs/kotlin-spring-ex-0.0.1.jar
```  

### Run tests  
```shell  
./gradlew test
```  