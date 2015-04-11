## spring-boot - template

* v1.0 
  - Java 1.8
  - JUnit Tests (Mock Tests, Web Unit Tests and Integration Tests)
  - Cobertura


* How to use it:

  - $ mvn test                									- Unit tests only
  - $ mvn integration-test    									- Unit and Integration tests
  - $ mvn clean cobertura:cobertura test                        - generates target/site/cobertura reports
  - $ mvn cobertura:check test                                  - check the totalLineRate
  - $ mvn cobertura:check package                               - check the totalLineRate. If passed then packages.
  - $ mvn clean cobertura:cobertura cobertura:check package     - generate and check. If passed then packages.


