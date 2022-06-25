package com.Dipta.ToDoList;

import com.Dipta.ToDoList.dataModel.ToDo_Data;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("ToDo List");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        try{
            ToDo_Data.getInstance().loadToDoItems();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        try{
            ToDo_Data.getInstance().storeToDoItems();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
