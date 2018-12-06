package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Home_Page;
import com.crm.qa.pages.LoginPage;

public class TestPageLogin extends TestBase {

	LoginPage loginpage;
	Home_Page homepage;

	public TestPageLogin() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initilazitatilon();
		loginpage = new LoginPage();

	}

	@Test(priority=1)
	public void loginpagetitletest() {
		String title = loginpage.validatetitleofpage();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}

	@Test(priority=2)
	public void logoimagetest() {
		boolean flag = loginpage.validatelogo();
		Assert.assertTrue(flag);

	}

	@Test(priority=3)
	public void signintest() {
		homepage = loginpage.signin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void breakin() {
		driver.quit();

	}

}
