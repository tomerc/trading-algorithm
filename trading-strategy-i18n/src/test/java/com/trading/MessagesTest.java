package com.trading;

import com.trading.i18n.Messages;
import org.junit.Test;

import java.util.Locale;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * @author Tomer Cohen
 */
public class MessagesTest {
    @Test
    public void getMessage() {
        String message = Messages.getMessage("trading.application.intro", null);
        assertNotNull(message);
        assertEquals("Trading Application", message);
    }

    @Test
    public void getMessageWithLocale() {
        String message = Messages.getMessage("trading.application.intro", null, new Locale("es"));
        assertNotNull(message);
        assertEquals("aplicacion comercial", message);
    }
}
