package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before
public void start() {
	System.out.println("Started");
}

@After
public void stop() {
	System.out.println("Stopped");
}

@Before("@Regression")
public void startR() {
	System.out.println("Started This test");
}

@After("@Regression")
public void stopR() {
	System.out.println("Stopped after test");
}
}
