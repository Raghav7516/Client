package org.pawa;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EmployeeHeader {

	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/home/head";
		WebResource wr=client.resource(url);
		ClientResponse cr=(ClientResponse) wr.header("sal","25").post(ClientResponse.class);
		String msg=(String) cr.getEntity(String.class);
		System.out.println(msg);
		

	}

}
