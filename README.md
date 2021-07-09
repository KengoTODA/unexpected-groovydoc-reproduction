# Reproduce the strange Groovydoc for enum

## How to reproduce the unexpected behaviour

1. Run `./gradlew groovydoc -P groovy=2.5.14` and confirm that the file `build/docs/groovydoc/DefaultPackage/TestWithAbstractMethod.html` is generated as expected.
2. Run `./gradlew groovydoc -P groovy=3.0.8` and confirm that the file `build/docs/groovydoc/DefaultPackage/TestWithAbstractMethod.html` is **NOT** generated as expected.
