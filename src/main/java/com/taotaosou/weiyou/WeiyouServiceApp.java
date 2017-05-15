package com.taotaosou.weiyou;

import com.taotaosou.weiyou.util.ResourcesName;
import com.taotaosou.weiyou.view.MainPane;
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
    }

    public void start(Stage primaryStage) throws Exception {
        MainPane mainPane = new MainPane();
        LeftContentPane leftContentPane = new LeftContentPane();
        mainPane.setLeft(leftContentPane);

        Scene scene = new Scene(mainPane, 1280, 960);
        primaryStage.setTitle(ResourcesName.APP_NAME);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
