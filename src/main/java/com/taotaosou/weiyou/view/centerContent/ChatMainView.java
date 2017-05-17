package com.taotaosou.weiyou.view.centerContent;

import com.taotaosou.weiyou.cef.WebPanel;
import javafx.embed.swing.SwingNode;
import javafx.scene.layout.BorderPane;

/**
 * Created by hulk on 17-5-15.
 */
public class ChatMainView extends BorderPane {
    public ChatMainView() {
        BorderLeftView borderLeftView = new BorderLeftView();
        setLeft(borderLeftView);

        BorderCenterView borderCenterView = new BorderCenterView();
        setCenter(borderCenterView);

//        WebPanel webPanel = new WebPanel();
//        webPanel.addANewBrowser("http://www.baidu.com");
//        webPanel.addANewBrowser("http://www.baidu.com");
//        SwingNode swingNode = new SwingNode();
//        //swingNode.setContent(webPanel);
//        setCenter(swingNode);
    }
}
