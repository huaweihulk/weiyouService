package com.taotaosou.weiyou.view.leftContent;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class AccountUnitView extends HBox {
    public AccountUnitView() {
        setAlignment(Pos.CENTER);

        //header
        Image headerImage = new Image(getClass().getClassLoader().getResourceAsStream("header.png"));
        ImageView headerImageView = new ImageView(headerImage);
        headerImageView.setFitWidth(100);
        headerImageView.setFitHeight(50);

        //accountName
        Label label = new Label("林换吵");
        label.setStyle("-fx-font-size: 20px");

        getChildren().add(headerImageView);
        getChildren().add(label);

    }
}
