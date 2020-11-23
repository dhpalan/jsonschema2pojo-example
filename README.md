# jsonschema2pojo-example
Generate Plain Old Java Objects from JSON-Schema using jsonschema2pojo.

## Input and Output
- The project https://github.com/dhpalan/jsonschema2pojo-ignoreunknown-annotator is a dependency for this project
- The dependency is used by <configuration><customAnnotator>xxx</customAnnotator></configuration>

- JSON files (Input) are placed here [src/main/resources/schema](src/main/resources/schema)
- On eclipse, choose Run As -> Maven generate-sources to successfully compile and generate sources
- Generated sources are here [target/generated-sources/jsonschema2pojo](target/generated-sources/jsonschema2pojo)

- Edit your pom.xml as explained here https://github.com/joelittlejohn/jsonschema2pojo/wiki/Getting-Started#the-maven-plugin to further customize the project