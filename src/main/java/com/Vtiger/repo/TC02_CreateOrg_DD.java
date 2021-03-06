package com.Vtiger.repo;

import org.testng.annotations.Test;

import com.Vtiger.generic.JavaUtil;
import com.Vtiger.generic.TestdataTest;
import com.Vtiger.generic.WebdriverUtilTest;

public class TC02_CreateOrg_DD  extends BaseClass{

	@Test
	public void createorg_dd () throws Throwable {
		HomePage homePage= new HomePage(driver);
		homePage.getOrglink().click();

		OrgInfoPage orgInfoPage = new OrgInfoPage(driver);
		orgInfoPage.getCreateorgbtn().click();

		TestdataTest testData= new TestdataTest();
		JavaUtil javaUtil = new JavaUtil();
		String orgname=testData.getOrgname()+javaUtil.createRandomnumber();
		CreateNewOrgPage createNewOrgPage= new CreateNewOrgPage(driver);

		createNewOrgPage.getOrgname().sendKeys(orgname);
		WebdriverUtilTest webDriverUtil= new WebdriverUtilTest(driver);

		webDriverUtil.selectValuefromdd("Active", createNewOrgPage.getRating());

		webDriverUtil.selectValuefromdd(createNewOrgPage.getIndustry(), "Education");

		webDriverUtil.selectValuefromdd(createNewOrgPage.getType(), 3);

		createNewOrgPage.getSaveorgbtn().click();

		Thread.sleep(4000);
		driver.navigate().refresh();

		homePage.getOrglink().click();

		orgInfoPage.searchforOrg(orgname, "accountname");

		Thread.sleep(3000);

		String actualorgname=orgInfoPage.getfirstOrg().getText();

		if (orgname.equals(actualorgname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}
	}
}