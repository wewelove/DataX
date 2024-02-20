```shell
mvn install:install-file -Dfile=parquet-format-2.3.1.jar -DgroupId=org.apache.parquet -DartifactId=parquet-format -Dversion=2.3.0 -Dpackaging=jar
mvn install:install-file -Dfile=eigenbase-properties-1.1.4.jar -DgroupId=eigenbase -DartifactId=eigenbase-properties -Dversion=1.1.4 -Dpackaging=jar
mvn install:install-file -Dfile=pentaho-aggdesigner-algorithm-5.1.5-jhyde.jar -DgroupId=org.pentaho -DartifactId=pentaho-aggdesigner-algorithm -Dversion=5.1.5-jhyde -Dpackaging=jar
mvn install:install-file -Dfile=greenplum-jdbc-5.1.4.jar -DgroupId=com.pivotal -DartifactId=greenplum-jdbc -Dversion=5.1.4 -Dpackaging=jar
mvn install:install-file -Dfile=kafka-schema-registry-client-5.5.2.jar -DgroupId=io.confluent -DartifactId=kafka-schema-registry-client -Dversion=5.5.2 -Dpackaging=jar

mvn install:install-file -Dfile=gbase-connector-java-9.5.0.1-build1-bin.jar -DgroupId=com.gbase.jdbc -DartifactId=gbase-jdbc -Dversion=9.5.0.1 -Dpackaging=jar
mvn install:install-file -Dfile=ojdbc6-11.2.0.3.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar
```