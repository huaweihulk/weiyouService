package com.taotaosou.weiyou.view.centerContent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-17.
 */
public class ChatContentView extends ListView<HBox> {
    ObservableList<HBox> observableList = FXCollections.observableArrayList();

    class ChatCOntentCell extends ListCell<HBox> {
        @Override
        protected void updateItem(HBox item, boolean empty) {
            setGraphic(item);
        }
    }

    static class ChatContentOtherUnit extends HBox {
        private Image headerImage;
        private String content;

        public ChatContentOtherUnit() {
            headerImage = new Image(getClass().getClassLoader().getResourceAsStream("chat.png"));
            content = "别人";
            getChildren().add(new ImageView(headerImage));
            getChildren().add(new Label(content));
            setAlignment(Pos.BASELINE_LEFT);
        }
    }

    static class chatContentSelfUnit extends HBox {
        private Image headerImage;
        private String content;

        public chatContentSelfUnit() {
            headerImage = new Image(getClass().getClassLoader().getResourceAsStream("chat.png"));
            content = "自己";
            getChildren().add(new Label(content));
            getChildren().add(new ImageView(headerImage));
            setAlignment(Pos.BASELINE_RIGHT);
        }
    }

    public ChatContentView() {
        setPrefHeight(600);
        setWidth(400);

        observableList.addAll(new ChatContentOtherUnit(), new chatContentSelfUnit());
        for (int i = 0; i < 10; i++) {
            observableList.add(new ChatContentOtherUnit());
            observableList.add(new ChatContentView.chatContentSelfUnit());
        }
        setCellFactory((ListView<HBox> l) -> new ChatCOntentCell());
        setItems(observableList);
    }
}
