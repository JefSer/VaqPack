/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaqpack;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author Jeff
 */
public class VaqPack extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnNext = new Button();
        btnNext.setText("Next");
        Button btnBack = new Button();
        btnBack.setText("Back");
        Button btnClose = new Button();
        btnClose.setText("Close");
        btnNext.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
         btnBack.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
          btnClose.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });
        
        BorderPane border = new BorderPane();
        
        HBox box = new HBox();
        box.getChildren().addAll(btnNext,btnBack,btnClose);
        border.setBottom(box);
        
        
        Image img = new Image(VaqPack.class.getResourceAsStream("b.png"));
        ImageView imgViewer = new ImageView(img);
        imgViewer.setFitHeight(100);
        imgViewer.setFitWidth(100);
        HBox top = new HBox();
        top.getChildren().add(imgViewer);           
        top.setStyle("-fx-background: #000000;");
        //top.setBackground(new Background(new BackgroundFill( new Paint, CornerRadii.EMPTY, Insets.EMPTY)));
        border.setTop(top);
        Scene scene = new Scene(border, 1000, 1000);
        
        primaryStage.setTitle("VaqPack");
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
