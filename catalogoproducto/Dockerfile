FROM openjdk:8-jre
ADD target/catalogoproducto-0.0.1-SNAPSHOT.jar app.jar
ADD catalogo-producto.yml app-config.yml
EXPOSE 8020
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar", "server", "app-config.yml"]
