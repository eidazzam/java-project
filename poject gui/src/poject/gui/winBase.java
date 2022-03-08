package poject.gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class winBase extends BorderPane {

    protected final HBox hBox;
    protected final ImageView imageView;
    protected final ImageView imageView0;

    public winBase(Stage primaryStage) {

        hBox = new HBox();
        imageView = new ImageView();
        imageView0 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(549.0);
        setPrefWidth(726.0);
        getStylesheets().add("/poject/gui/style.css");

        BorderPane.setAlignment(hBox, javafx.geometry.Pos.CENTER);
        hBox.setPrefHeight(256.0);
        hBox.setPrefWidth(726.0);
        hBox.setStyle("-fx-alignment: center;");

        imageView.setFitHeight(286.0);
        imageView.setFitWidth(682.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("imgs/win.png").toExternalForm()));
        setBottom(hBox);

        BorderPane.setAlignment(imageView0, javafx.geometry.Pos.CENTER);
        imageView0.setFitHeight(251.0);
        imageView0.setFitWidth(756.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("imgs/Win_Top_Image.png").toExternalForm()));
        setCenter(imageView0);

        hBox.getChildren().add(imageView);

    }
}
