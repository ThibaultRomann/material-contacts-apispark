package net.apispark.webapi.db;


import static org.hamcrest.CoreMatchers.* ;
import static org.junit.Assert.*;
import net.apispark.webapi.representation.Contact;

import org.junit.Assert;
import org.junit.Test;

public class ContactPersistenceTest {

	@Test
	public void test() {
		
		Contact contact = new Contact();
		contact.setFirstName("bob");
		
		Contact contactSaved = ContactPersistence.INSTANCE.addContact(contact);
		
		Assert.assertThat(contactSaved.getId(), is(notNullValue()));
		
		

	}

}
