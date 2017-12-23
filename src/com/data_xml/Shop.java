package com.data_xml;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Shop {
	
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/product/sample";
		WebResource resource=client.resource(url);
		ClientResponse clientResponse=(ClientResponse) resource.get(ClientResponse.class);
		String msg=(String) clientResponse.getEntity(String.class);
		System.out.println(msg);
	}

}
