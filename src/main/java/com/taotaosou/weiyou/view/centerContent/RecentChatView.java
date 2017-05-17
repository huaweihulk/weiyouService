package com.taotaosou.weiyou.view.centerContent;

import com.taotaosou.weiyou.util.ResourcesName;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;

/**
 * Created by hulk on 17-5-15.
 */
public class RecentChatView extends Tab {
    private ListView<RecentChatUnit> recentChatUnitListView = new ListView<>();
    private ObservableList<RecentChatUnit> observableList = FXCollections.observableArrayList();

    class RecentChetMessage extends VBox {
        private Label userName;
        private Label recentMessage;

        public RecentChetMessage(Label userName, Label recentMessage) {
            this.userName = userName;
            this.recentMessage = recentMessage;
            getChildren().add(userName);
            getChildren().add(recentMessage);
        }
    }

    class RecentViewCell extends ListCell<RecentChatUnit> {
        @Override
        protected void updateItem(RecentChatUnit item, boolean empty) {
            setGraphic(item);
        }
    }

    class RecentChatUnit extends HBox {
        private Image image;
        private RecentChetMessage recentChetMessage;

        public RecentChatUnit(Image image, RecentChetMessage recentChetMessage) {
            this.image = image;
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(50);
            this.recentChetMessage = recentChetMessage;
            getChildren().add(imageView);
            getChildren().add(recentChetMessage);
        }
    }

    public RecentChatView() {
        setText(ResourcesName.RECENT_CHAT);
        for (int i = 0; i < 20; i++) {
            Image headerImage = new Image(getClass().getClassLoader().getResourceAsStream("chat.png"));
            observableList.add(new RecentChatUnit(headerImage, new RecentChetMessage(new Label("测试"), new Label("测试"))));
        }

        recentChatUnitListView.setCellFactory((ListView<RecentChatUnit> l) -> new RecentViewCell());
        recentChatUnitListView.setItems(observableList);
        recentChatUnitListView.setPrefHeight(1400);
        setContent(recentChatUnitListView);
        setClosable(false);
    }
}
