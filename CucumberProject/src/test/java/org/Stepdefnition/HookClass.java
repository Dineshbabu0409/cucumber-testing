package org.Stepdefnition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import sam.BaseClass;

public class HookClass extends BaseClass {
	@Before(order = 1)
	private void precondition2() {
		launchBrowser();
	}

	@Before(order = 2)
	private void precondition1() {
		windowMaximize();
	}

	@Before(order = 3,value = {})
	private void precondition3() {
		System.out.println("Launched the browser");
	}

	@After(order = 2)
	private void postcondition2() {
		System.out.println("close entire browser");
	}

	@After(order = 9,value = {""})
	private void postcondition1() {
		closeEntrieBrowser();
	}

}
