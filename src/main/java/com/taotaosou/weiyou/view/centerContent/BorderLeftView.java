package com.taotaosou.weiyou.view.centerContent;

import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-15.
 * 搜索框和通讯列表框
 */
public class BorderLeftView extends VBox {

    public BorderLeftView() {
        SearchView searchView = new SearchView();
        LeftChatTabView leftChatTabView = new LeftChatTabView();
        getChildren().addAll(searchView, leftChatTabView);
    }
}
