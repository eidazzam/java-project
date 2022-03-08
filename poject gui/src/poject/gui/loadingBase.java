package poject.gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class loadingBase extends BorderPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;

    public loadingBase(Stage primaryStage) {

        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(549.0);
        setPrefWidth(726.0);
        getStylesheets().add("/poject/gui/style.css");

        BorderPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);
        imageView.setFitHeight(229.0);
        imageView.setFitWidth(255.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("imgs/uu.png").toExternalForm()));
        setTop(imageView);

        BorderPane.setAlignment(imageView0, javafx.geometry.Pos.CENTER);
        imageView0.setFitHeight(192.0);
        imageView0.setFitWidth(199.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("imgs/output-onlinegiftools.gif").toExternalForm()));
        setBottom(imageView0);

        BorderPane.setAlignment(imageView1, javafx.geometry.Pos.CENTER);
        imageView1.setFitHeight(195.0);
        imageView1.setFitWidth(458.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("imgs/kindpng_691940.png").toExternalForm()));
        setCenter(imageView1);

    }
}
