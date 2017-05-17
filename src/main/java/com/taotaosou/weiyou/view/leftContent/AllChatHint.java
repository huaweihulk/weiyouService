package com.taotaosou.weiyou.view.leftContent;

import com.taotaosou.weiyou.util.ResourcesName;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class AllChatHint extends HBox {
    public AllChatHint() {
        //chat icon
        Image chatImage = new Image(getClass().getClassLoader().getResourceAsStream("chat.png"));
        ImageView chatImageView = new ImageView(chatImage);
        chatImageView.setFitHeight(50);
        chatImageView.setFitWidth(100);
        getChildren().add(chatImageView);

        //label
        Label label = new Label(ResourcesName.ALL_CHAT_HINT);
        label.setStyle("-fx-font-size: 20px;");
        getChildren().add(label);

    }
}
