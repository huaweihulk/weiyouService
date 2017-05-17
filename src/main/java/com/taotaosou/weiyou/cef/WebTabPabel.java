package com.taotaosou.weiyou.cef;

import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefRequestContext;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hulk on 17-5-15.
 */
public class WebTabPabel extends JTabbedPane {
    private CefApp cefApp;
    private boolean useOSR;
    private boolean isTransparent;
    private int wechatOpenCount = 1;

    public WebTabPabel(CefApp cefApp, boolean useOSR, boolean isTransparent) {
        this.cefApp = cefApp;
        this.useOSR = useOSR;
        this.isTransparent = isTransparent;
    }

    private Component generateWebFrame(String url) {
        CefClient cefClient = cefApp.createClient();
        CefBrowser cefBrowser = cefClient.createBrowser(url, useOSR, isTransparent,
                CefRequestContext.createContext(new DefaultCefRequestContextHandler()));
        cefClient.addRequestHandler(new ClientRequestHandler());
        Component browser = cefBrowser.getUIComponent();
        return browser;
    }

    public void addANewPanel(String url) {
        addTab("wecchat" + wechatOpenCount, generateWebFrame(url));
    }
}
