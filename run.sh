mvn clean package
java -Xmx256M -XX:+UseZGC -XX:ActiveProcessorCount=2 -XX:+UseStringDeduplication -jar target/demo-0.0.1-SNAPSHOT.jar