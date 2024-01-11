```shell
mvn install:install-file -Dfile=parquet-format-2.3.1.jar -DgroupId=org.apache.parquet -DartifactId=parquet-format -Dversion=2.3.0 -Dpackaging=jar
mvn install:install-file -Dfile=eigenbase-properties-1.1.4.jar -DgroupId=eigenbase -DartifactId=eigenbase-properties -Dversion=1.1.4 -Dpackaging=jar
mvn install:install-file -Dfile=pentaho-aggdesigner-algorithm-5.1.5-jhyde.jar -DgroupId=org.pentaho -DartifactId=pentaho-aggdesigner-algorithm -Dversion=5.1.5-jhyde -Dpackaging=jar
```