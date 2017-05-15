package com.taotaosou.weiyou.view.centerContent;

import com.taotaosou.weiyou.util.ResourcesName;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class ContactsView extends Tab {

    class contactUnit extends HBox {
        private Image image;
       
    }

    private ListView contactsListView;

    public ContactsView() {
        setText(ResourcesName.ALL_CONTACTS);

    }
}
