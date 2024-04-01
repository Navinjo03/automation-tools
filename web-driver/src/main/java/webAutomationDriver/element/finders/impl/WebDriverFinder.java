package webAutomationDriver.element.finders.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webAutomationDriver.element.finders.service.ElementFinder;
import webAutomationDriver.element.web_element.impl.PageElementImpl;
import webAutomationDriver.element.web_element.service.PageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Methods for locating web elements within a web page using the WebDriver API.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see ElementFinder
 */
public final class WebDriverFinder implements ElementFinder {

    private final WebDriver driver;

    public WebDriverFinder(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @param by The selector used to locate the web element.
     * @return The first occurrence of the located web element, or null if not found.
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(driver.findElement(by));
    }

    /**
     * {@inheritDoc}
     *
     * @param by The selector used to locate the web elements.
     * @return A collection of all occurrences of the located web elements.
     */
    @Override
    public Collection<PageElement> findElements(final By by) {
        final Collection<WebElement> webElements = driver.findElements(by);
        final Collection<PageElement> pageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            pageElements.add(new PageElementImpl(element));
        }

        return pageElements;
    }
}
