package poject.gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SinglePlayBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final ImageView imageView;
    protected final ButtonBar buttonBar;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Button button8;
    protected final Button button9;
    protected final HBox hBox;
    protected final ImageView imageView2;
    protected final ImageView imageView3;

    public SinglePlayBase(Stage primaryStage) {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        imageView = new ImageView();
        buttonBar = new ButtonBar();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        button8 = new Button();
        button9 = new Button();
        hBox = new HBox();
        imageView2 = new ImageView();
        imageView3 = new ImageView();

        setAlignment(javafx.geometry.Pos.CENTER);
        setPrefHeight(492.0);
        setPrefWidth(749.0);
        getStylesheets().add("/poject/gui/style.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(121.20000610351562);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(42.000024414062494);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(173.1999755859375);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(98.00001220703123);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(115.60000457763672);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(73.6);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(220.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(111.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(100.0);
        columnConstraints3.setMinWidth(0.0);
        columnConstraints3.setPrefWidth(11.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(220.0);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(113.39995117187499);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(100.0);
        columnConstraints5.setMinWidth(0.0);
        columnConstraints5.setPrefWidth(11.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(220.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(115.99998779296874);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(199.99997558593748);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(59.00002441406252);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints8.setMaxWidth(199.99997558593748);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(118.79999999999995);

        rowConstraints.setMaxHeight(41.39999084472656);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.999996948242185);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(144.19998779296876);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(69.4000030517578);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(144.19998779296876);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(35.000000000000014);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(50.0);
        rowConstraints2.setPrefHeight(80.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(82.4);
        rowConstraints3.setMinHeight(13.800006103515614);
        rowConstraints3.setPrefHeight(14.800024414062506);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(50.0);
        rowConstraints4.setPrefHeight(80.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(80.0);
        rowConstraints5.setMinHeight(11.400006103515636);
        rowConstraints5.setPrefHeight(11.799993896484352);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(50.0);
        rowConstraints6.setPrefHeight(80.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(80.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(32.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(imageView, 5);
        GridPane.setRowIndex(imageView, 1);
        imageView.setFitHeight(141.0);
        imageView.setFitWidth(158.0);
        imageView.setFocusTraversable(true);
        imageView.setId("logo");
        imageView.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("imgs/uu.png").toExternalForm()));

        GridPane.setColumnIndex(buttonBar, 2);
        GridPane.setRowIndex(buttonBar, 1);
        buttonBar.setPrefHeight(40.0);
        buttonBar.setPrefWidth(22.0);

        GridPane.setColumnIndex(button, 3);
        GridPane.setRowIndex(button, 3);
        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button.setGraphicTextGap(5.0);
        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMinHeight(USE_PREF_SIZE);
        button.setMinWidth(USE_PREF_SIZE);
        button.setMnemonicParsing(false);
        button.setOpacity(0.7);

        GridPane.setColumnIndex(button0, 3);
        GridPane.setRowIndex(button0, 7);
        button0.setAlignment(javafx.geometry.Pos.CENTER);
        button0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button0.setGraphicTextGap(5.0);
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMinHeight(USE_PREF_SIZE);
        button0.setMinWidth(USE_PREF_SIZE);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.7);

        GridPane.setColumnIndex(button1, 7);
        GridPane.setRowIndex(button1, 5);
        button1.setAlignment(javafx.geometry.Pos.CENTER);
        button1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button1.setGraphicTextGap(5.0);
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMinHeight(USE_PREF_SIZE);
        button1.setMinWidth(USE_PREF_SIZE);
        button1.setMnemonicParsing(false);
        button1.setOpacity(0.7);

        GridPane.setColumnIndex(button2, 7);
        GridPane.setRowIndex(button2, 7);
        button2.setAlignment(javafx.geometry.Pos.CENTER);
        button2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button2.setGraphicTextGap(5.0);
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMinHeight(USE_PREF_SIZE);
        button2.setMinWidth(USE_PREF_SIZE);
        button2.setMnemonicParsing(false);
        button2.setOpacity(0.7);

        GridPane.setColumnIndex(button3, 5);
        GridPane.setRowIndex(button3, 5);
        button3.setAlignment(javafx.geometry.Pos.CENTER);
        button3.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button3.setGraphicTextGap(5.0);
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMinHeight(USE_PREF_SIZE);
        button3.setMinWidth(USE_PREF_SIZE);
        button3.setMnemonicParsing(false);
        button3.setOpacity(0.7);

        GridPane.setColumnIndex(button4, 3);
        GridPane.setRowIndex(button4, 5);
        button4.setAlignment(javafx.geometry.Pos.CENTER);
        button4.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button4.setGraphicTextGap(5.0);
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMinHeight(USE_PREF_SIZE);
        button4.setMinWidth(USE_PREF_SIZE);
        button4.setMnemonicParsing(false);
        button4.setOpacity(0.7);

        GridPane.setColumnIndex(button5, 7);
        GridPane.setRowIndex(button5, 3);
        button5.setAlignment(javafx.geometry.Pos.CENTER);
        button5.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button5.setGraphicTextGap(5.0);
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMinHeight(USE_PREF_SIZE);
        button5.setMinWidth(USE_PREF_SIZE);
        button5.setMnemonicParsing(false);
        button5.setOpacity(0.7);
        button5.setPrefHeight(80.0);
        button5.setPrefWidth(106.0);
        button5.setOpaqueInsets(new Insets(0.0));

        GridPane.setColumnIndex(button6, 5);
        GridPane.setRowIndex(button6, 3);
        button6.setAlignment(javafx.geometry.Pos.CENTER);
        button6.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button6.setGraphicTextGap(5.0);
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMinHeight(USE_PREF_SIZE);
        button6.setMinWidth(USE_PREF_SIZE);
        button6.setMnemonicParsing(false);
        button6.setOpacity(0.7);

        GridPane.setColumnIndex(button7, 5);
        GridPane.setRowIndex(button7, 7);
        button7.setAlignment(javafx.geometry.Pos.CENTER);
        button7.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button7.setGraphicTextGap(5.0);
        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMinHeight(USE_PREF_SIZE);
        button7.setMinWidth(USE_PREF_SIZE);
        button7.setMnemonicParsing(false);
        button7.setOpacity(0.7);

        GridPane.setColumnIndex(imageView0, 1);
        GridPane.setRowIndex(imageView0, 4);
        imageView0.setFitHeight(114.0);
        imageView0.setFitWidth(157.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("imgs/Boy-Avatar-PNG-Download-Image.png").toExternalForm()));

        GridPane.setColumnIndex(imageView1, 9);
        GridPane.setRowIndex(imageView1, 4);
        imageView1.setFitHeight(114.0);
        imageView1.setFitWidth(83.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("imgs/PngItem_216020.png").toExternalForm()));

        GridPane.setColumnIndex(button8, 7);
        GridPane.setRowIndex(button8, 9);
        button8.setAlignment(javafx.geometry.Pos.CENTER);
        button8.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button8.setGraphicTextGap(5.0);
        button8.setMaxHeight(Double.MAX_VALUE);
        button8.setMaxWidth(Double.MAX_VALUE);
        button8.setMinHeight(USE_PREF_SIZE);
        button8.setMinWidth(USE_PREF_SIZE);
        button8.setMnemonicParsing(false);
        button8.setStyle("-fx-background-color: #7BE1D7; -fx-font-weight: bold; -fx-cursor: HAND;");
        button8.setText("Reset");
        button8.setFont(new Font("System Bold", 18.0));

        GridPane.setColumnIndex(button9, 3);
        GridPane.setRowIndex(button9, 9);
        button9.setAlignment(javafx.geometry.Pos.CENTER);
        button9.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button9.setGraphicTextGap(5.0);
        button9.setMaxHeight(Double.MAX_VALUE);
        button9.setMaxWidth(Double.MAX_VALUE);
        button9.setMinHeight(USE_PREF_SIZE);
        button9.setMinWidth(USE_PREF_SIZE);
        button9.setMnemonicParsing(false);
        button9.setStyle("-fx-background-color: #F86156; -fx-font-weight: bold; -fx-cursor: HAND;");
        button9.setText("Exit");
        button9.setFont(new Font("System Bold", 18.0));

        GridPane.setColumnIndex(hBox, 1);
        GridPane.setRowIndex(hBox, 6);
        hBox.setPrefHeight(54.0);
        hBox.setPrefWidth(70.0);

        imageView2.setFitHeight(53.0);
        imageView2.setFitWidth(82.0);
        imageView2.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("imgs/pngwing.com.png").toExternalForm()));
        HBox.setMargin(imageView2, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(imageView3, 9);
        GridPane.setRowIndex(imageView3, 6);
        imageView3.setFitHeight(50.0);
        imageView3.setFitWidth(75.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("imgs/pning.com.png").toExternalForm()));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getColumnConstraints().add(columnConstraints2);
        getColumnConstraints().add(columnConstraints3);
        getColumnConstraints().add(columnConstraints4);
        getColumnConstraints().add(columnConstraints5);
        getColumnConstraints().add(columnConstraints6);
        getColumnConstraints().add(columnConstraints7);
        getColumnConstraints().add(columnConstraints8);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getRowConstraints().add(rowConstraints6);
        getRowConstraints().add(rowConstraints7);
        getRowConstraints().add(rowConstraints8);
        getRowConstraints().add(rowConstraints9);
        getChildren().add(imageView);
        getChildren().add(buttonBar);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);
        getChildren().add(button6);
        getChildren().add(button7);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(button8);
        getChildren().add(button9);
        hBox.getChildren().add(imageView2);
        getChildren().add(hBox);
        getChildren().add(imageView3);

    }
}
