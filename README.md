# jsonschema2pojo-example

1. Generate Plain Old Java Objects from JSON-Schema using jsonschema2pojo.
2. Usage of custom annotator for adding "JsonIgnoreProperties(ignoreUnknown = true)" to generated files.
3. Include Jsr303 Annotations.

## Input and Output
- JSON files are here [src\main\resources\schema](src\main\resources\schema)
- Generated sources are [target\generated-sources\jsonschema2pojo](target\generated-sources\jsonschema2pojo)