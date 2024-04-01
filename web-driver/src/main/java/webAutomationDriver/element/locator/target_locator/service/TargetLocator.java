package webAutomationDriver.element.locator.target_locator.service;

import org.openqa.selenium.WindowType;
import webAutomationDriver.alert.service.WebAlert;
import webAutomationDriver.driver.service.AutomationDriver;

/**
 * Set of methods for locating targets within a web page.
 *
 * @Author  [Navin Jones]
 * @Version  1.0
 */

public interface TargetLocator {

    /**
     * Locates the window with the specified name.
     *
     * @param name The name of the window to locate.
     * @return An AutomationDriver instance representing the located window.
     */
    AutomationDriver window(final String name);

    /**
     * Opens a new window with the specified type.
     *
     * @param windowType The type of window to open.
     * @return An AutomationDriver instance representing the new window.
     */
    AutomationDriver newWindow(final WindowType windowType);

    /**
     * Retrieves the alert present on the web page.
     *
     * @return An Alerts instance representing the alert.
     */
    WebAlert alert();
}

