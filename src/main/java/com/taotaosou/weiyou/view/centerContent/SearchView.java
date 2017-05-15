package com.taotaosou.weiyou.view.centerContent;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Created by hulk on 17-5-15.
 */
public class SearchView extends HBox {
    public SearchView() {
        TextField searchText = new TextField();
        searchText.setText("搜索微信名/备注名");

    }
}
