# Quarkus starter project

If you want to learn more about Quarkus, visit [https://quarkus.io](https://quarkus.io)


## Development

During development use Quarkus Maven plugin with dev goal:

```
mvn quarkus:dev

```
Development mode supports live coding, i.e. hot deployment.

The starter project contains only one single REST endpoint: /hello

Try

```
{http|wget|curl} http://localhost:8080/hello
```


## Packaging and running on JVM

```
mvn clean package
java -jar target/quarkus-starter-1.0-runner.jar
```

Quarkus libs in ``lib`` folder. With uber jar (all in one jar):

```
mvn clean package -Dquarkus.package.uber-jar=true
java -jar target/quarkus-starter-1.0-runner.jar
```


Test with
```
mvn test
```

## Creating and executing a native executable

GraalVM with `native-image` installed:

```
mvn package -Pnative 
```

Or build with docker or podman

```
mvn package -Pnative -Dquarkus.native.container-build=true     # defaults to docker
mvn package -Pnative -Dquarkus.native.container-runtime=docker
mvn package -Pnative -Dquarkus.native.container-runtime=podman
```

Run it with 

```
./target/quarkus-starter-1.0-runner
```

Test with

```
mvn verify -Pnative
mvn verify -Pnative -Dquarkus.native.container-runtime=podman # with podman
```

## Extensions
Quarkus knows about JAX-RS and nothing else in the standard case. However, there
are extensions for many use cases. To show all extionsions do

```
mvn quarkus:list-extensions
```

To use an extension, i.e. update the POM with some dependency do

```
mvn quarkus:add-extension -Dextensions=<extension>
```

where ``<extension>`` is one of the extensions shown by ``list-extensions``.


Happy hacking !


## License

See the [license](license.txt) file for license rights and limitations (MIT).



