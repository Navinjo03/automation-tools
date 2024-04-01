package webAutomationDriver.driver.service;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import webAutomationDriver.element.finders.service.ElementFinder;
import webAutomationDriver.element.locator.target_locator.service.TargetLocator;
import webAutomationDriver.page_component.service.PageInformation;
import webAutomationDriver.page_component.service.PageNavigator;
import webAutomationDriver.tabs.service.TabHandler;
import webAutomationDriver.tabs.service.TabNavigator;

/**
 * Defines a set of methods for automating interactions with a web browser.
 *
 * @Author [Navin Jones]
 * @Version 1.0
 */

public interface AutomationDriver {

    /**
     * Closes the current window or tab.
     */
    void close();

    /**
     * Quits the browser, closing all windows and ending the session.
     */
    void quit();

    /**
     * To locate elements within the web page.
     *
     * @return A Finder instance for {@link ElementFinder}.
     */
    ElementFinder find();

    /**
     * To retrieve additional information about the web page.
     *
     * @return An Information instance for {@link PageInformation}.
     */
    PageInformation inform();

    /**
     * For navigating through pages.
     *
     * @return A PageNavigator instance for page {@link PageNavigator}.
     */
    PageNavigator navigator();

    /**
     * Locating targets within the web page.
     *
     * @return A TargetLocator instance for {@link TargetLocator}.
     */
    TargetLocator targetLocator();

    /**
     * For handling windows and tabs.
     *
     * @return A WindowHandler instance for {@link TabNavigator}.
     */
    TabNavigator window();

    /**
     * For identifying and managing tabs.
     *
     * @return A WindowIdentifier instance for {@link TabHandler}.
     */
    TabHandler tabs();


    <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException;
}



