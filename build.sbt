
name := "concurrency"

version := "1.0"

scalaVersion := "2.11.7"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.10",
  "org.json4s" %% "json4s-jackson" % "3.2.10"
)

resolvers ++= Seq(
  // HTTPS is unavailable for Maven Central
  "oschina"              at "http://maven.oschina.net/content/groups/public/",
  "Maven Repository"     at "http://repo.maven.apache.org/maven2",
  "Apache Repository"    at "https://repository.apache.org/content/repositories/releases",
  "JBoss Repository"     at "https://repository.jboss.org/nexus/content/repositories/releases/",
  "MQTT Repository"      at "https://repo.eclipse.org/content/repositories/paho-releases/",
  "Cloudera Repository"  at "http://repository.cloudera.com/artifactory/cloudera-repos/",
  // For Sonatype publishing
  // "sonatype-snapshots"   at "https://oss.sonatype.org/content/repositories/snapshots",
  // "sonatype-staging"     at "https://oss.sonatype.org/service/local/staging/deploy/maven2/",
  // also check the local Maven repository ~/.m2
  Resolver.mavenLocal
)