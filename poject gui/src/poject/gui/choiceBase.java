package poject.gui;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class choiceBase extends BorderPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final HBox hBox;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;

    public choiceBase(Stage primaryStage) {

        imageView = new ImageView();
        imageView0 = new ImageView();
        hBox = new HBox();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();

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
        imageView0.setFitHeight(166.0);
        imageView0.setFitWidth(420.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("imgs/kindpng_691940.png").toExternalForm()));
        setCenter(imageView0);

        BorderPane.setAlignment(hBox, javafx.geometry.Pos.CENTER);
        hBox.setPrefHeight(256.0);
        hBox.setPrefWidth(726.0);
        hBox.setStyle("-fx-alignment: center;");

        imageView1.setFitHeight(166.0);
        imageView1.setFitWidth(117.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setStyle("-fx-cursor: HAND;");
        imageView1.setImage(new Image(getClass().getResource("imgs/PngItem_216020.png").toExternalForm()));

        imageView2.setFitHeight(173.0);
        imageView2.setFitWidth(116.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setStyle("-fx-cursor: HAND;");
        imageView2.setImage(new Image(getClass().getResource("imgs/comic-vs-versus-1.png").toExternalForm()));
        HBox.setMargin(imageView2, new Insets(0.0, 0.0, 0.0, 150.0));

        imageView3.setFitHeight(150.0);
        imageView3.setFitWidth(108.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);

        imageView4.setFitHeight(131.0);
        imageView4.setFitWidth(166.0);
        imageView4.setStyle("-fx-cursor: HAND;");
        imageView4.setImage(new Image(getClass().getResource("imgs/topScore.png").toExternalForm()));
        setBottom(hBox);

        hBox.getChildren().add(imageView1);
        hBox.getChildren().add(imageView2);
        hBox.getChildren().add(imageView3);
        hBox.getChildren().add(imageView4);

    }
}
