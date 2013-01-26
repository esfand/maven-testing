Source: http://antoniogoncalves.org/2012/12/13/lets-turn-integration-tests-with-maven-to-a-first-class-citizen/

Either run UT or IT or none of them:

    mvn install             : exec both Unit and Integration Tests
    mvn install -DskipUTs   : Skips Unit tests
    mvn install -DskipITs   : Skips Integration tests
    mvn install -DskipTests : Skips both Unit and Integration Tests
