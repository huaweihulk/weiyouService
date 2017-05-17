package com.taotaosou.weiyou;

import com.taotaosou.weiyou.cef.WebPanel;
import com.taotaosou.weiyou.util.ResourcesName;
import com.taotaosou.weiyou.view.MainPane;
import com.taotaosou.weiyou.view.centerContent.ChatMainView;
import com.taotaosou.weiyou.view.leftContent.LeftContentPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class WeiyouServiceApp extends Application {
    public static void main(String[] args) {
        launch(args);
//        WebPanel webPanel = new WebPanel();
//        webPanel.setVisible(true);
//        webPanel.setSize(1500, 800);
    }

    public void start(Stage primaryStage) throws Exception {
        MainPane mainPane = new MainPane();
        Scene scene = new Scene(mainPane, 1550, 1080);
        primaryStage.setTitle(ResourcesName.APP_NAME);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
