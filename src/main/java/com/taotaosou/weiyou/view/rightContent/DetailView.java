package com.taotaosou.weiyou.view.rightContent;

import javafx.scene.control.TabPane;

/**
 * Created by hulk on 17-5-17.
 */
public class DetailView extends TabPane {
    public DetailView() {
        getTabs().add(new UserInfoDetailTab());
        getTabs().add(new ChatHistoryDetailView());
    }
}
