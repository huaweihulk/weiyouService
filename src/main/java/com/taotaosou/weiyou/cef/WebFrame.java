package com.taotaosou.weiyou.cef;

import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefRequestContext;
import org.cef.network.CefCookieManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hulk on 17-5-15.
 */
public class WebFrame extends JFrame {
    private CefApp cefApp;
    private CefClient client;
    private CefBrowser cefBrowser;
    private CefCookieManager cefCookieManager;

    public WebFrame(CefApp cefApp, String startURL, boolean useOSR, boolean isTransparent) throws HeadlessException {
        CefSettings settings = new CefSettings();
        settings.windowless_rendering_enabled = useOSR;
        this.cefApp = cefApp;
        cefApp.setSettings(settings);
        client = cefApp.createClient();
        cefBrowser = client.createBrowser(startURL, useOSR, isTransparent,
                CefRequestContext.createContext(new DefaultCefRequestContextHandler()));
        client.addRequestHandler(new ClientRequestHandler());
        add(getBrowerFrame());
    }

    private Component getBrowerFrame() {
        return cefBrowser.getUIComponent();
    }
}
