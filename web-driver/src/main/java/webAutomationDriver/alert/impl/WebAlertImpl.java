package webAutomationDriver.alert.impl;

import org.openqa.selenium.Alert;
import webAutomationDriver.alert.service.WebAlert;

/**
 * Provides functionality for interacting with browser alerts, such as dismissing them,
 * accepting them, retrieving their text, and sending keys to them.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see WebAlert
 */
public final class WebAlertImpl implements WebAlert {

    private final Alert alerts;

    public WebAlertImpl(final Alert alert) {
        this.alerts = alert;
    }

    /**
     * Dismisses the browser alert.
     * {@inheritDoc}
     */
    @Override
    public void dismiss() {
        alerts.dismiss();
    }

    /**
     * Accepts the browser alert.
     * {@inheritDoc}
     */
    @Override
    public void accept() {
        alerts.accept();
    }

    /**
     * Retrieves the text of the browser alert.
     *
     * @return The text of the browser alert.
     * {@inheritDoc}
     */
    @Override
    public String getText() {
        return alerts.getText();
    }

    /**
     * Sends the specified keys to the browser alert.
     *
     * @param keysToSend The keys to send to the browser alert.
     * {@inheritDoc}
     */
    @Override
    public void sendKeys(final String keysToSend) {
        alerts.sendKeys(keysToSend);
    }
}

