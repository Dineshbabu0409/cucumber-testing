package org.Stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sam.BaseClass;

public class FbLogin extends BaseClass {

	FbLoginPojo f = new FbLoginPojo();

	@Given("The user launch the chrome browser and maximize window")
	public void the_user_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("The user launch the url of the Bisto bites")
	public void the_user_launch_the_url_of_the_Bisto_bites() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("The user click the account button")
	public void the_user_click_the_account_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/login'])[2]"));
		account.click();
	}

	@When("The user give the Invalid user name")
	public void the_user_give_the_Invalid_user_name() {
		f = new FbLoginPojo();
		WebElement email = f.getEmail();
		email.sendKeys("9989282");
	}

	@When("The user give the Invalid password")
	public void the_user_give_the_Invalid_password() {
		f = new FbLoginPojo();
		WebElement pass = f.getPassword();
		pass.sendKeys("dineshbabu");
	}

	@When("The user click the login button")
	public void the_user_click_the_login_button() {
		f = new FbLoginPojo();
		WebElement login = f.getLoginBtn();
		login.click();
	}

	@When("The user check whether navigate to the home page or not")
	public void the_user_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("check the whether");
	}

	@Then("The user close the browser")
	public void the_user_close_the_browser() {
		closeEntrieBrowser();
	}

	@Given("To user Enter the browser and maximazie")
	public void to_user_Enter_the_browser_and_maximazie() {
		launchBrowser();
		windowMaximize();
	}

	@When("To user launch the url")
	public void to_user_launch_the_url() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("To user click the Home button")
	public void to_user_click_the_Home_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement home = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com'])[3]"));
		home.click();
	}

	@When("To user dropdown the Dosa label")
	public void to_user_dropdown_the_Dosa_label() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Dosa')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
	}

	@When("To user click the dosa button")
	public void to_user_click_the_dosa_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement dosa = driver.findElement(By.xpath("//span[contains(text(),'Dosa')]"));
		dosa.click();
	}

	@When("To user select the Masala Dosa")
	public void to_user_select_the_Masala_Dosa() throws InterruptedException {
		Thread.sleep(3000);
		WebElement masaladosa = driver.findElement(By.xpath(
				"(//a[@href='https://bistrobitesdc.com/detailitem/17'])[1]"));
		masaladosa.click();
	}

	@When("To user check the Available Time")
	public void to_user_check_the_Available_Time() {
		WebElement time = driver.findElement(By.xpath("//span[@id='priceshow']"));
		String text1 = time.getText();
		System.out.println(text1);
	}

	@Given("As a User Enter the browser and maximazie")
	public void as_a_User_Enter_the_browser_and_maximazie() {
		launchBrowser();
		windowMaximize();
	}

	@When("As a Userlaunch the url")
	public void as_a_Userlaunch_the_url() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("https://bistrobitesdc.com");
	}
	
	
	@When("As a Userclick the account button")
	public void as_a_Userclick_the_account_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/login'])[2]"));
		account.click();
	}

	@When("As a user give a the Name")
	public void as_a_user_give_a_the_Name() {
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Dinesh");
	}

	@When("As s user give a mail")
	public void as_s_user_give_a_mail() {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("dinshbabu0409@gmail.com");
	}

	@When("As a user give a number")
	public void as_a_user_give_a_number() {
		WebElement phone = driver.findElement(By.xpath("(//input[@id='phone'])[2]"));
		phone.sendKeys("865549763");
	}

	@When("As a user give a password")
	public void as_a_user_give_a_password() {
		WebElement pass = driver.findElement(By.xpath("(//input[@name='password'])[2]"));
		pass.sendKeys("dienshbau");
	}

	@When("As a User click the register button")
	public void as_a_User_click_the_register_button() {
		WebElement register = driver.findElement(By.xpath("(//button[@name='login'])[2]"));
		register.click();
	}

	@Given("He Enter the browser and maximazie")
	public void he_Enter_the_browser_and_maximazie() {
		launchBrowser();
		windowMaximize();
	}

	@When("He launch the url")
	public void he_launch_the_url() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("https://bistrobitesdc.com");
	}

	@When("He click the search icon")
	public void he_click_the_search_icon() throws InterruptedException {
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("(//a[@href='#'])[5]"));
		account.click();
	}

	@When("He Search coke can")
	public void he_Search_coke_can() {
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		search.sendKeys("coke" + Keys.ENTER);
	}

	@When("He select the coke can")
	public void he_select_the_coke_can() {
		WebElement coke = driver.findElement(By.xpath("//img[@src='https://bistrobitesdc.com/public/upload/images/menu_item_icon/cixdE3MXXh1623198848.jpg']"));
		coke.click();
	}

	@When("He check the can dollar")
	public void he_check_the_can_dollar() {
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),' 1.50 ')]"));
		String text = price.getText();
		System.out.println(text);
	}

	@Given("tester Enter the browser and maximazie")
	public void tester_Enter_the_browser_and_maximazie() {
		launchBrowser();
		windowMaximize();
	}

	@When("tester  launch the url")
	public void tester_launch_the_url() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("tester click search icon")
	public void tester_click_search_icon() {
		WebElement account = driver.findElement(By.xpath("(//a[@href='#'])[5]"));
		account.click();
	}

	@When("tester search the spanish omelet")
	public void tester_search_the_spanish_omelet() {
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		search.sendKeys("spanish omelet" + Keys.ENTER);
	}

	@When("tester  click the Probability")
	public void tester_click_the_Probability() {
		System.out.println("check the probability");
	}

	@When("tester check the dollar")
	public void tester_check_the_dollar() {
		WebElement dollar = driver.findElement(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
		String text = dollar.getText();
		System.out.println(text);
		
	}

	@Given("I want to Enter the browser and maximazie")
	public void i_want_to_Enter_the_browser_and_maximazie() {
		launchBrowser();
		windowMaximize();
	}

	@When("I want to launch the url")
	public void i_want_to_launch_the_url() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("I want to click the Story option")
	public void i_want_to_click_the_Story_option() throws InterruptedException {
		Thread.sleep(3000);
		WebElement story = driver.findElement(By.xpath("//a[@href='https://bistrobitesdc.com/aboutus']"));
		story.click();
	}

	@When("I want to check the spelling mistake")
	public void i_want_to_check_the_spelling_mistake() {
		System.out.println("Spelling mistake");
	}

	@Then("I want to close the browser")
	public void i_want_to_close_the_browser() {
		closeEntrieBrowser();
	}
}
