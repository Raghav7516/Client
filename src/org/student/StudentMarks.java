package org.student;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class StudentMarks {

	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/student/marks;marks=45";
		WebResource wr=client.resource(url);
		ClientResponse response=(ClientResponse) wr.get(ClientResponse.class);
		String msg=(String) response.getEntity(String.class);
		System.out.println(msg);
	}

}
