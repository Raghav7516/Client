package org.student;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class StudentSubject {
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/student/subject";
		WebResource wr=client.resource(url);
		Form form=new Form();
		form.add("subject", "science");
		ClientResponse cr=(ClientResponse) wr.post(ClientResponse.class, form);
		String msg=(String) cr.getEntity(String.class);
		System.out.println(msg);
	}
}
