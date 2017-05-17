package com.taotaosou.weiyou.view.centerContent;

import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-17.
 * 中间位置的聊天窗口
 */
public class BorderCenterView extends VBox {

    public BorderCenterView() {
        setPrefWidth(500);
        getChildren().addAll(new ChatWithHeader());
        getChildren().add(new ChatContentView());
        getChildren().addAll(new ChatSendView());
    }

}
