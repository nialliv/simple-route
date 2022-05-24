# simple-route
A simple route that convert file from  json to xml in a request on localhost


=== Build

You will need to compile this example first:

[source,sh]
----
$ mvn package
----

=== Run

To run the example type

[source,sh]
----
$ java -jar target/simple-route-0.0.1-SNAPSHOT.jar
----

To stop the example hit `ctrl+c`

=== How to use

Send POST request to localhost:9999/ with JSON file. Xml file will be created in folder - files/
