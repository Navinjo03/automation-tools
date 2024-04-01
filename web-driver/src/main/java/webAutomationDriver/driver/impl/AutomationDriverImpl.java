package webAutomationDriver.driver.impl;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import webAutomationDriver.driver.service.AutomationDriver;
import webAutomationDriver.element.finders.impl.WebDriverFinder;
import webAutomationDriver.element.finders.service.ElementFinder;
import webAutomationDriver.element.locator.target_locator.impl.TargetLocatorImpl;
import webAutomationDriver.element.locator.target_locator.service.TargetLocator;
import webAutomationDriver.page_component.impl.PageInformationImpl;
import webAutomationDriver.page_component.impl.PageNavigatorImpl;
import webAutomationDriver.page_component.service.PageInformation;
import webAutomationDriver.page_component.service.PageNavigator;
import webAutomationDriver.tabs.impl.TabHandlerImpl;
import webAutomationDriver.tabs.impl.TabNavigatorImpl;
import webAutomationDriver.tabs.service.TabHandler;
import webAutomationDriver.tabs.service.TabNavigator;

/**
 * Provides functionality for automating browser interactions using the WebDriver API.
 *
 * @author [Navin Jones]
 * @version 1.0
 * @see AutomationDriver
 */
public final class AutomationDriverImpl implements AutomationDriver {

    private final WebDriver driver;
    private final TakesScreenshot takeScreenshot;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
        this.takeScreenshot = (TakesScreenshot) driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * {@inheritDoc}
     *
     * @return A Finder instance for element location.
     */
    @Override
    public ElementFinder find() {
        return new WebDriverFinder(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return An Information instance for page information retrieval.
     */
    @Override
    public PageInformation inform() {
        return new PageInformationImpl(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A PageNavigator instance for page navigation.
     */
    @Override
    public PageNavigator navigator() {
        return new PageNavigatorImpl(driver.navigate());
    }

    /**
     * {@inheritDoc}
     *
     * @return A TargetLocator instance for browsing context switching.
     */
    @Override
    public TargetLocator targetLocator() {
        return new TargetLocatorImpl(driver.switchTo(), driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A WindowHandler instance for browser window handling.
     */
    @Override
    public TabNavigator window() {
        return new TabNavigatorImpl(driver.manage().window());
    }

    /**
     * {@inheritDoc}
     *
     * @return A WindowIdentifier instance for window handle identification.
     */
    @Override
    public TabHandler tabs() {
        return new TabHandlerImpl(driver);
    }


    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return takeScreenshot.getScreenshotAs(target);
    }
}

