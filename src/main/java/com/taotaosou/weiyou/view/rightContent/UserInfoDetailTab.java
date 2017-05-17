package com.taotaosou.weiyou.view.rightContent;

import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-17.
 */
public class UserInfoDetailTab extends Tab {
    public UserInfoDetailTab() {
        VBox vBox = new VBox();
        setContent(vBox);
        Image image = new Image(getClass().getClassLoader().getResourceAsStream("header.png"));
        ImageView imageView = new ImageView(image);
        Label nick = new Label("昵称 测试");
        Label alias = new Label("备注 测试");
        Label wechat = new Label("微信号 ceshi");
        Label sex = new Label("性别 男");
        vBox.getChildren().addAll(imageView, nick, alias, wechat, sex);
        setText("微信信息");
    }
}
