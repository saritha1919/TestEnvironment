package com.test.utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseWeb {
	/**
     * Before test.
     *
     * @param env this is environment.
     */
    @Parameters({"env"})
    @BeforeMethod(alwaysRun = true)
    public void beforeTest(final String env) {
        String baseUrl = env;
    }

}
