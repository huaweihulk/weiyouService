package com.taotaosou.weiyou.view.leftContent;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class LoginOutView extends HBox {
    public LoginOutView() {
        Label userName = new Label("测试");
        getChildren().add(userName);

        //header
        Image loginOutImage = new Image(getClass().getClassLoader().getResourceAsStream("loginout.png"));
        ImageView loginOutImageView = new ImageView(loginOutImage);
        Button loginoutButton = new Button();
        loginoutButton.setGraphic(loginOutImageView);
        getChildren().add(loginoutButton);

    }
}
