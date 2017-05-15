package com.taotaosou.weiyou.cef;

import org.cef.browser.CefBrowser;
import org.cef.callback.CefAuthCallback;
import org.cef.callback.CefRequestCallback;
import org.cef.handler.CefLoadHandler;
import org.cef.handler.CefRequestHandler;
import org.cef.handler.CefRequestHandlerAdapter;
import org.cef.handler.CefResourceHandler;
import org.cef.misc.BoolRef;
import org.cef.misc.StringRef;
import org.cef.network.CefRequest;
import org.cef.network.CefResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hulk on 17-5-15.
 */
public class ClientRequestHandler extends CefRequestHandlerAdapter {
    private List<Byte> resultBytes = new ArrayList<Byte>(1 << 19);

    @Override
    public boolean onBeforeResourceLoad(CefBrowser cefBrowser, CefRequest cefRequest) {
        resultBytes.clear();
        System.out.println(cefBrowser.getURL() + "=====");
        return false;
    }

    @Override
    public CefResourceHandler getResourceHandler(CefBrowser cefBrowser, CefRequest cefRequest) {

        return null;
    }
}
