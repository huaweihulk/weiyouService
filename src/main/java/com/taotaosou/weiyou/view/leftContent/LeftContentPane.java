package com.taotaosou.weiyou.view.leftContent;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

/**
 * Created by hulk on 17-5-15.
 */
public class LeftContentPane extends VBox {
    public LeftContentPane() {
        setAlignment(Pos.TOP_CENTER);
        //logo
        LogoView logoView = new LogoView();
        getChildren().add(logoView);

        //chatview
        AllChatHint chatHint = new AllChatHint();
        getChildren().add(chatHint);

        //accounts
        AccountsView accountsView = new AccountsView();
        getChildren().add(accountsView);

        //add account
        AddAccountView addAccountView = new AddAccountView();
        getChildren().add(addAccountView);

        //commanfunction
        CommanFunctionView commanFunctionView = new CommanFunctionView();
        getChildren().add(commanFunctionView);

        //loginout
        LoginOutView loginOutView = new LoginOutView();
        getChildren().add(loginOutView);
    }
}
