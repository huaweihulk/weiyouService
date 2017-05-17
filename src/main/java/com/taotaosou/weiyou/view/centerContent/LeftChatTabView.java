package com.taotaosou.weiyou.view.centerContent;

import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-15.
 * 左边所有聊天的列表显示
 */
public class LeftChatTabView extends TabPane {
    public LeftChatTabView() {
        ContactsView contactsView = new ContactsView();
        RecentChatView recentChatView = new RecentChatView();
        getTabs().add(contactsView);
        getTabs().add(recentChatView);

        setHeight(1400);
    }
}
