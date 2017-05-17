package com.taotaosou.weiyou.view;

import com.taotaosou.weiyou.cef.WebPanel;
import com.taotaosou.weiyou.view.centerContent.ChatMainView;
import com.taotaosou.weiyou.view.leftContent.LeftContentPane;
import com.taotaosou.weiyou.view.rightContent.DetailView;
import javafx.embed.swing.SwingNode;
import javafx.scene.layout.BorderPane;

/**
 * Created by hulk on 17-5-15.
 */
public class MainPane extends BorderPane {
    public MainPane() {
        LeftContentPane leftContentPane = new LeftContentPane();
        setLeft(leftContentPane);
        ChatMainView chatMainView = new ChatMainView();
        setCenter(chatMainView);
        DetailView detailView = new DetailView();
        detailView.setPrefWidth(300);
        setRight(detailView);
        //setCenter(swingNode);
    }
}
