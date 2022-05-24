package ru.kit.neocource.simple_route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CreateXmlByJSONRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jetty:http://localhost:9999/")
		.routeId("MYROUTE9999")
		.log("receive request body ${body}")
		.unmarshal()
		.json()
		.marshal()
		.xstream()
		.to("file://files/?fileName=out.xml")
		.log("Success save into file");
	}
}
