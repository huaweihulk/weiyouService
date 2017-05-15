package com.taotaosou.weiyou.cef;

import org.cef.handler.CefRequestContextHandlerAdapter;
import org.cef.network.CefCookieManager;

/**
 * Created by hulk on 17-5-15.
 * 简单的cookie manager，主要是为了防止cookie覆盖
 */
public class DefaultCefRequestContextHandler extends CefRequestContextHandlerAdapter {

    private CefCookieManager cefCookieManager = CefCookieManager.createManager("", false);

    public CefCookieManager getCefCookieManager() {
        return cefCookieManager;
    }
}
