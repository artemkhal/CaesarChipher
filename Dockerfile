FROM openjdk:19-alpine

COPY target/CaesarChiper*.jar /CaesarCipher.jar

CMD ["java", "-jar", "/CaesarCipher.jar"]