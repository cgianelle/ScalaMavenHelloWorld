## Scala and Maven
by Chris Gianelle

I am learning the Scala language and after a couple of files, the Scala compiler (scalac) becomes a little tedious:
~~~~
scalac -d classes/ src/com/hello/world/greeting/* src/com/hello/world/*.scala
~~~~
Not to mention figuring out the order in which things should be specified!!!

### Scala with Maven Tutorial
After some Googling, I came across [this](http://docs.scala-lang.org/tutorials/scala-with-maven.html). I already had Maven installed from tinkering around with the Spring Framework, so I started with section **Creating Your First Project**.

I created workspace for my experimentation and cd'd into it. Then set about creating a project:

**GIANELC-M-J09Z:Scala gianelc$ mvn archetype:generate**

... (lots of plugins types are displayed - 1711 in all)

Since I am primarily interested in using the Maven build environment for a Scala project, I searched for Scala plugins.

**Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 874: scala**

Choose archetype:
1. remote -> co.cask.cdap:cdap-spark-scala-archetype (-)
2. remote -> com.bugvm:bugvm-scala-template (-)
3. remote -> com.github.igor-petruk.archetypes:maven-archetype-scala-executable (Creates executable Scala Project that is ready to run with 'java -jar')
4. remote -> com.iobeam:iobeam-spark-scala-maven-archetype (Maven archetype to set up an iobeam spark app project.)
5. remote -> de.schlichtherle:javafx-scala-demo (An archetype for a standalone JavaFX 2.0 application written in Scala.
The generated application is translated from the Colorful Circles demo from the
JavaFX 2.0 SDK.)
6. remote -> eu.stratosphere:quickstart-scala (-)
7. **remote -> net.alchim31.maven:scala-archetype-simple (The maven-scala-plugin is used for compiling/testing/running/documenting scala code in maven.)**
8. remote -> net.ladstatt:scala-javafx-archetype (The Scala JavaFX Archetype provides a simple template for a scala based 
	JavaFX project)
9. remote -> org.apache.camel.archetypes:camel-archetype-component-scala (Creates a new Camel component with Scala.)
10. remote -> org.apache.camel.archetypes:camel-archetype-scala (Creates a new Camel project using Scala DSL.)
11. remote -> org.apache.flink:flink-quickstart-scala (-)
12. remote -> org.apache.flink:flink-quickstart-scala_2.11 (-)
13. remote -> org.fusesource.scalate.tooling:scalate-archetype-empty (An archetype which creates an empty Scalate web application)
14. remote -> org.fusesource.scalate.tooling:scalate-archetype-guice (An archetype which creates an empty Scalate Guice web application)
15. remote -> org.fusesource.scalate.tooling:scalate-archetype-guice_2.10 (An archetype which creates an empty Scalate Guice web application)
16. remote -> org.fusesource.scalate.tooling:scalate-archetype-guice_2.9 (An archetype which creates an empty Scalate Guice web application)
17. remote -> org.fusesource.scalate.tooling:scalate-archetype-jersey (An archetype which creates an empty Scalate web application)
18. remote -> org.fusesource.scalate.tooling:scalate-archetype-jersey_2.10 (An archetype which creates an empty Scalate web application)
19. remote -> org.fusesource.scalate.tooling:scalate-archetype-jersey_2.9 (An archetype which creates an empty Scalate web application)
20. remote -> org.fusesource.scalate.tooling:scalate-archetype-sitegen (An archetype which creates an empty Scalate static website generation project)
21. remote -> org.fusesource.scalate.tooling:scalate-archetype-sitegen_2.10 (An archetype which creates an empty Scalate static website generation project)
22. remote -> org.fusesource.scalate.tooling:scalate-archetype-sitegen_2.9 (An archetype which creates an empty Scalate static website generation project)
23. remote -> org.openjdk.jmh:jmh-scala-benchmark-archetype (Generates Scala benchmarking project, uses JMH bytecode processors)
24. remote -> org.scala-tools.archetypes:scala-archetype-simple (The maven-scala-plugin is used for compiling/testing/running/documenting scala code in maven.)
25. remote -> org.scalatra.scalate.tooling:scalate-archetype-guice_2.10 (An archetype which creates an empty Scalate Guice web application)
26. remote -> org.scalatra.scalate.tooling:scalate-archetype-guice_2.11 (An archetype which creates an empty Scalate Guice web application)
27. remote -> org.scalatra.scalate.tooling:scalate-archetype-jersey_2.10 (An archetype which creates an empty Scalate web application)
28. remote -> org.scalatra.scalate.tooling:scalate-archetype-jersey_2.11 (An archetype which creates an empty Scalate web application)
29. remote -> org.scalatra.scalate.tooling:scalate-archetype-sitegen_2.10 (An archetype which creates an empty Scalate static website generation project)
30. remote -> org.scalatra.scalate.tooling:scalate-archetype-sitegen_2.11 (An archetype which creates an empty Scalate static website generation project)
31. remote -> org.wicketstuff.scala:wicket-scala-archetype (Basic setup for a project that combines Scala and Wicket, 
		depending on the Wicket-Scala project. Includes an example Specs 
		test.)
32. remote -> org.wicketstuff.scala:wicketstuff-scala-archetype (Basic setup for a project that combines Scala and Wicket, 
		depending on the Wicket-Scala project. Includes an example Specs 
		test.)
33. remote -> pl.org.miki:scala-quickstart-archetype (Customizable cruft-free Scala archetype. Options:
    * -sourceFolders: [all-in-src-java, scala-only, both-split-src]. DEFAULT: all-in-src-java.
    * --all-in-src-java: Scala and Java code are both in src/main/java (same for test). Plays nicely with IDEs.
    * --scala-only: only src/main/scala set up, and set as source folder.
    * --both-split-src: both src/main/java and src/main/scala. Can play merry havock with IDEs, so not the default.
    * -testLibrary: [scalatest, specs2, scalacheck-only, junit-only]. DEFAULT: scalatest.
    * --scalatest: adds Scalatest AND Scalacheck AND JUnit for most of your testing needs.
    * --specs2: adds specs2 AND Scalacheck AND JUnit.
    * --scalacheck-junit: adds Scalacheck AND JUnit.
    * --junit-only: adds JUnit ONLY.
    * -scalaVersion: 2.10.x+. DEFAULT: 2.11.2.

  * The Scala tool version is generated automatically.
  * Some Scala versions may not be compatible with selected test library versions. Adjust as necessary.)

Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 7

**Choose net.alchim31.maven:scala-archetype-simple version:**
1. 1.4
2. 1.5
3. 1.6

**Choose a number: 3: 3**

After selecting the scala plugin, I created the project specifics (groupId, artifactId, etc)
~~~~
Define value for property 'groupId': : com.gianelle.chris
Define value for property 'artifactId': : ScalaHello
Define value for property 'version':  1.0-SNAPSHOT: : 
Define value for property 'package':  com.gianelle.chris: : 
Confirm properties configuration:
groupId: com.gianelle.chris
artifactId: ScalaHello
version: 1.0-SNAPSHOT
package: com.gianelle.chris
 Y: : 
~~~~ 
 
This set up the basic project. 

### Now compile it

**GIANELC-M-J09Z:ScalaHello gianelc$ mvn package**

...
[ERROR] scalac error: bad option: '-make:transitive'
...

When I tried to compile I ran into the above issue. [Here's the solution](http://stackoverflow.com/questions/35016945/scalac-error-bad-option-maketransitive-on-mvn-package-via-command-line)

After fixing the make:transitive issue, I ran into another issue:

~~~~
[ERROR] /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/src/test/scala/samples/specs.scala:18: error: not found: type JUnitRunner
[ERROR] @RunWith(classOf[JUnitRunner])
~~~~

[Here's the solution for this issue](https://github.com/davidB/scala-archetype-simple/issues/9)

At this point, we are almost done, but the _Creating a Jar_ section from the [tuturial](http://docs.scala-lang.org/tutorials/scala-with-maven.html) points out that the Scala Maven Plugin doesn’t include a Main-Class attribute in the manifest. So to fix that, I added the following plugin to the build plugins section (**note the <mainClass>**):
~~~~
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>2.4</version>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
        <archive>
            <manifest>
                <mainClass>com.gianelle.chris.App</mainClass>
            </manifest>
        </archive>
    </configuration>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>single</goal>
            </goals>
        </execution>
    </executions>
</plugin>
~~~~

After this the packaging of the project completed succesfully:

~~~~
GIANELC-M-J09Z:ScalaHello gianelc$ mvn clean
GIANELC-M-J09Z:ScalaHello gianelc$ mvn package
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building ScalaHello 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ ScalaHello ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ ScalaHello ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- scala-maven-plugin:3.2.0:compile (default) @ ScalaHello ---
[INFO] /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/src/main/scala:-1: info: compiling
[INFO] Compiling 2 source files to /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/target/classes at 1476124379839
[INFO] prepare-compile in 0 s
[INFO] compile in 2 s
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ ScalaHello ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ ScalaHello ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- scala-maven-plugin:3.2.0:testCompile (default) @ ScalaHello ---
[INFO] /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/src/test/scala:-1: info: compiling
[INFO] Compiling 3 source files to /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/target/test-classes at 1476124382575
[WARNING] warning: there was one deprecation warning; re-run with -deprecation for details
[WARNING] one warning found
[INFO] prepare-compile in 0 s
[INFO] compile in 3 s
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ ScalaHello ---
[INFO] Surefire report directory: /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running samples.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in samples.AppTest
Running samples.ListSuite
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.093 sec - in samples.ListSuite
Running samples.MySpecTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.18 sec - in samples.MySpecTest
Running samples.StackSuite
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 sec - in samples.StackSuite

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ ScalaHello ---
[INFO] Building jar: /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/target/ScalaHello-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-assembly-plugin:2.4:single (default) @ ScalaHello ---
[INFO] Building jar: /Users/gianelc/Cisco/Sandbox/Scala/ScalaHello/target/ScalaHello-1.0-SNAPSHOT-jar-with-dependencies.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 10.884 s
[INFO] Finished at: 2016-10-10T14:33:09-04:00
[INFO] Final Memory: 32M/341M
[INFO] ------------------------------------------------------------------------
~~~~

### Running the JAR
OK, so now everything is packaged up and should be ready for execution:
~~~~
GIANELC-M-J09Z:ScalaHello gianelc$ java -jar target/ScalaMavenHelloWorld-1.0-SNAPSHOT-jar-with-dependencies.jar Chris Gianelle
Hello World!
concat arguments =  Chris Gianelle
Hello, Chris Gianelle, it is nice to meet you!
~~~~

And that's that!
