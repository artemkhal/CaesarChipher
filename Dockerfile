FROM alpine:3.14

COPY target/CaesarChiper*.jar /CaesarCipher.jar

CMD ["java", "-jar", "/CaesarCipher.jar"]