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

/**
 * Created by hulk on 17-5-15.
 */
public class ContactsView extends Tab {
    private ListView<contactUnit> contactUnitListView = new ListView<>();
    private ObservableList<ContactsView> contactsViewObservableList = FXCollections.observableArrayList();

    class ContactsCell extends ListCell<ContactsCell> {
        @Override
        protected void updateItem(ContactsCell item, boolean empty) {
            setGraphic(item);
        }
    }

    class contactUnit extends HBox {
        private Image image;
        private Label label;

        public contactUnit(Image image, Label label) {
            this.image = image;
            this.label = label;
            ImageView imageView = new ImageView(image);
            getChildren().add(imageView);
            getChildren().add(label);
        }
    }

    private ListView contactsListView;

    public ContactsView() {
        setText(ResourcesName.ALL_CONTACTS);

    }
}
