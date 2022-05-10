package com.Vtiger.generic;

import com.github.javafaker.Faker;

public class TestdataTest {
	/**
	 * This method gonna create fake data for the firstname
	 *
	 * @return String Firstname
	 */
	public String getFirstName() {
		Faker faker=new Faker();
		String firstName=faker.name().firstName();
		return firstName;
		
		
	}
	
	/**
	 * @author Amar G
	 * This method will return name of the city
	 *
	 * @return String city name
	 */
public String cityname() {
	Faker faker=new Faker();
	return  faker.address().cityName();
	
	
}

	public String getOrganizationName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getOrgname() {
		Faker faker = new Faker();
		return	faker.company().industry();
	}

}
