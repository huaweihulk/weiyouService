package com.taotaosou.weiyou.view.leftContent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;

import java.util.List;

/**
 * Created by hulk on 17-5-15.
 */
public class AccountsView extends ListView<AccountUnitView> {
    class AccountCell extends ListCell<AccountUnitView> {
        @Override
        protected void updateItem(AccountUnitView item, boolean empty) {
            setGraphic(item);
        }
    }

    private ObservableList<AccountUnitView> accountUnitViews = FXCollections.observableArrayList();

    public AccountsView() {
        for (int i = 0; i < 20; i++) {
            accountUnitViews.add(new AccountUnitView());
        }

        setCellFactory((ListView<AccountUnitView> l) -> new AccountCell());
        setItems(accountUnitViews);
        setHeight(700);
    }
}
