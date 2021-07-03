package org.addacinStepDefinition;

import org.addacinUserLab.BaseCls_UsrDfindCls;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AddacinHooks extends BaseCls_UsrDfindCls{
	@Before
	public void beforeScenario() {
		launchBrowser("chrome");
		implicitWait();
	}

	@After
	public void afterScenario() {
		quit();

	}


}
