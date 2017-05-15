package com.taotaosou.weiyou.cef;

import org.cef.CefApp;
import org.cef.CefSettings;

import javax.swing.*;

/**
 * Created by hulk on 17-5-15.
 */
public class WebTabPabel extends JTabbedPane {
    private CefApp cefApp;
    private boolean useOSR;
    private boolean isTransparent;

    public WebTabPabel(boolean useOSR, boolean isTransparent) {
        CefSettings settings = new CefSettings();
        settings.windowless_rendering_enabled = useOSR;
        cefApp = CefApp.getInstance(settings);
        this.useOSR = useOSR;
        this.isTransparent = isTransparent;
    }

    private WebFrame generateWebFrame(String url) {
        WebFrame webFrame = new WebFrame(cefApp, url, useOSR, isTransparent);
        return webFrame;
    }

    private void addANewPanel() {

    }
}
