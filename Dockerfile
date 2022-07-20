FROM alpine:3.14
ARG JAR_FILE=target/
COPY target/CaesarChiper*.jar /CaesarCipher.jar

CMD ["java", "-jar", "/CaesarCipher.jar"]