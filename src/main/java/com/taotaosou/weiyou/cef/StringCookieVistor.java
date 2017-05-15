package com.taotaosou.weiyou.cef;

import org.cef.callback.CefCookieVisitor;
import org.cef.misc.BoolRef;
import org.cef.network.CefCookie;

/**
 * Created by hulk on 17-5-15.
 */
public class StringCookieVistor implements CefCookieVisitor {
    private StringBuilder currentCookiesBuilder = new StringBuilder();

    public String getCookieStr() {
        return currentCookiesBuilder.toString();
    }

    public void clearCookie() {
        currentCookiesBuilder.delete(0, currentCookiesBuilder.length());
    }

    @Override
    public boolean visit(CefCookie cefCookie, int i, int i1, BoolRef boolRef) {
        currentCookiesBuilder.append(cefCookie.name);
        currentCookiesBuilder.append("=");
        currentCookiesBuilder.append(cefCookie.value);
        currentCookiesBuilder.append("; ");
        return true;
    }
}
