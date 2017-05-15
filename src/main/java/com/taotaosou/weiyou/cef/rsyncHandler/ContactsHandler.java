package com.taotaosou.weiyou.cef.rsyncHandler;

import com.taotaosou.weiyou.cef.StringCookieVistor;
import org.cef.callback.CefCookieVisitor;
import org.cef.network.CefCookieManager;
import org.cef.network.CefRequest;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by hulk on 17-5-15.
 */
public class ContactsHandler implements Callable<String> {
    public static void copyCef(CefRequest source, CefRequest taget) {
        taget.setURL(source.getURL());
        HashMap<String, String> header = new HashMap<>();
        source.getHeaderMap(header);
        taget.setHeaderMap(header);
        taget.setFirstPartyForCookies(source.getFirstPartyForCookies());
        taget.setFlags(source.getFlags());
        taget.setMethod(source.getMethod());
        taget.setPostData(source.getPostData());
    }

    private CefRequest cefRequest;

    public ContactsHandler(CefRequest cefRequest) {
        this.cefRequest = CefRequest.create();
        copyCef(cefRequest, this.cefRequest);
    }

    @Override
    public String call() throws Exception {
        HashMap<String, String> header = new HashMap<>();
        CefCookieVisitor cookieVisitor = new StringCookieVistor();
        return null;
    }

}
