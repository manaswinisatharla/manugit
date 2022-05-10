package com.Vtiger.Practice;

import com.github.javafaker.Faker;

public class Browser {
	/**
	 * @author Manu
	 * This method will return name of the organization
	 * @return name
	 */

		public String getOrganizationName()
		{
			Faker fk=new Faker();
				String name = fk.company().industry();
					return name;
		}
		/**
		 * @author SaiNadh
		 * This method will return the phone number
		 * @return phonenumber
		 */
      public String getPhoneNumber()
      {
    	  Faker fk=new Faker();
    	  String phonenumber = fk.phoneNumber().cellPhone();
    	  return phonenumber;
      }
      /**
		 * @author SaiNadh
		 * This method will return the Email
		 * @return email
		 */
		public String getEmail()
		{
		Faker fk=new Faker();
		String email = fk.internet().emailAddress();
		return email;
	}
		/**
		 * @author SaiNadh
		 * This method will return the Address
		 * @return Address
		 */
public String getAddress()
{
	Faker fk=new Faker();
	String add = fk.address().fullAddress();
	return add;
	}
		public void openBrowser() {
			// TODO Auto-generated method stub
			
		}
}