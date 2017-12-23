package org.pawa;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EmployeeMail {

	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2017/RestEmployee/rest/home/email;email=kushwahpawan2505@gmail.com";
		WebResource wr=client.resource(url);
		ClientResponse cr=(ClientResponse) wr.get(ClientResponse.class);
		String msg=(String) cr.getEntity(String.class);
		System.out.println(msg);
		

	}

}
