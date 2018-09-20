package io.vertx.starter;


import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

	@Test
	public void test() {
		Person person = new Person();
		
		Assert.assertEquals(5, person.call("Hello"));
	}

}
