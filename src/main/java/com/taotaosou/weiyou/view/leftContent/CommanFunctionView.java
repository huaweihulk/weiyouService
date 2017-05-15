package com.taotaosou.weiyou.view.leftContent;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class CommanFunctionView extends HBox {
    public CommanFunctionView() {
        //message
        Image messageImage = new Image(getClass().getClassLoader().getResourceAsStream("chat.png"));
        ImageView messageImageView = new ImageView(messageImage);
        Button messageButton = new Button();
        messageButton.setGraphic(messageImageView);
        getChildren().add(messageButton);

        //reply
        Image replyImage = new Image(getClass().getClassLoader().getResourceAsStream("reply.png"));
        ImageView replyImageView = new ImageView(replyImage);
        Button replyButton = new Button();
        replyButton.setGraphic(replyImageView);
        getChildren().add(replyButton);

        //setting
        Image settingImage = new Image(getClass().getClassLoader().getResourceAsStream("setting.png"));
        ImageView settingImageView = new ImageView(settingImage);
        Button settingButton = new Button();
        settingButton.setGraphic(settingImageView);
        getChildren().add(settingButton);
    }
}
