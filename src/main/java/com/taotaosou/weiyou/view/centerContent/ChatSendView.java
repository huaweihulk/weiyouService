package com.taotaosou.weiyou.view.centerContent;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-17.
 */
public class ChatSendView extends VBox {
    class ToolView extends HBox {
        public ToolView() {
            setAlignment(Pos.BASELINE_LEFT);
            Image image = new Image(getClass().getClassLoader().getResourceAsStream("header.png"));
            ImageView emojiImageView = new ImageView(image);
            ImageView cutScreenImageView = new ImageView(image);
            ImageView fileImageView = new ImageView(image);
            getChildren().addAll(emojiImageView, cutScreenImageView, fileImageView);
        }
    }

    class SendView extends HBox {
        public SendView() {
            setAlignment(Pos.BASELINE_RIGHT);
            Button button = new Button("发送消息");
            getChildren().addAll(button);
        }
    }

    public ChatSendView() {
        getChildren().addAll(new ToolView());
        TextArea textArea = new TextArea();
        textArea.setPrefHeight(150);
        getChildren().addAll(textArea, new SendView());
    }
}
