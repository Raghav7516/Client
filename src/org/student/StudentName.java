package org.student;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class StudentName {

	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/student/name";
		WebResource wr=client.resource(url);
		wr=wr.queryParam("name", "vijay kumar");
		ClientResponse cr=(ClientResponse) wr.get(ClientResponse.class);
		String msg=(String) cr.getEntity(String.class);
		System.out.println(msg);
	}

}
