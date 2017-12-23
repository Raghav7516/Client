package org.pawa;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class EmployeeForm {

	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/home/form";
		WebResource wr=client.resource(url);
		Form f=new Form();
		f.add("eid", "65");
		ClientResponse cr=(ClientResponse) wr.post(ClientResponse.class, f);
		String msg=(String) cr.getEntity(String.class);
		System.out.println(msg);
		

	}

}
