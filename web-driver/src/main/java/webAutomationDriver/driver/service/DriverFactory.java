package webAutomationDriver.driver.service;


import webAutomationDriver.driver.impl.DriverFactoryImpl;

/**
 * Contracts for factories that produce instances of AutomationDriver,
 * catering to automation tasks within the application.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public interface DriverFactory {

    static DriverFactory getInstance() {
        return new DriverFactoryImpl();
    }

    /**
     * Retrieves an instance of {@link AutomationDriver} configured for automation tasks.
     *
     * @return An instance of AutomationDriver.
     */
    AutomationDriver getDriver();
}


