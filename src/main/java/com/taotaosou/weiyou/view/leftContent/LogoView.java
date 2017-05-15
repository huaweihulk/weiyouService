package com.taotaosou.weiyou.view.leftContent;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by hulk on 17-5-15.
 */
public class LogoView extends ImageView {
    public LogoView() {

        Image image = new Image(LogoView.class.getClassLoader().getResourceAsStream("logo.png"));
        setImage(image);


    }
}
