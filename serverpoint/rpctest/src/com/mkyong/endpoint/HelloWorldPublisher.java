package com.mkyong.endpoint;

import javax.xml.ws.Endpoint;
import com.mkyong.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher
{
	
	public static void main(String[] args) 
	{
	   Endpoint.publish("http://192.168.0.107:9999/ws/hello", new HelloWorldImpl());
    }

}
