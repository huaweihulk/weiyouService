package com.taotaosou.weiyou.cef;

import org.cef.CefApp;
import org.cef.CefSettings;
import org.cef.OS;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hulk on 17-5-15.
 */
public class WebPanel extends JFrame {
    private CefApp cefApp;
    private WebTabPabel browserTabPane;

    public WebPanel() throws HeadlessException {
        CefSettings settings = new CefSettings();
        settings.windowless_rendering_enabled = OS.isLinux();
        cefApp = CefApp.getInstance(settings);
        browserTabPane = new WebTabPabel(cefApp, OS.isLinux(), true);
        add(browserTabPane);
    }

    public void addANewBrowser(String url) {
        if (browserTabPane != null) {
            browserTabPane.addANewPanel(url);
        }
    }
}
