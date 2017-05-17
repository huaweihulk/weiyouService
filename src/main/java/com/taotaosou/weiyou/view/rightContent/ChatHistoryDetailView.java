package com.taotaosou.weiyou.view.rightContent;

import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-17.
 */
public class ChatHistoryDetailView extends Tab {
    public ChatHistoryDetailView() {
        VBox vBox=new VBox();
        vBox.getChildren().addAll(new Label("测试"));
        setText("聊天记录");
    }
}
