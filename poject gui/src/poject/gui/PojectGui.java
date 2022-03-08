/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poject.gui;



import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class PojectGui extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //loadingBase root = new loadingBase(primaryStage);
        //choiceBase root = new choiceBase(primaryStage);
        //winBase root = new winBase(primaryStage);
        SinglePlayBase root = new SinglePlayBase(primaryStage);
        //multiBase root = new multiBase(primaryStage);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Tic Tac Toe!");
        Image icon = new Image(getClass().getResourceAsStream("imgs/uu.png"));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
        primaryStage.show();   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    } 
}
