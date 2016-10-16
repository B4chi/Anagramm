package de.b4chi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by bachi on 11.10.2016.
 */
public class GUI extends Application {

    ArrayList<Label> labels = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Anagrammanalyse");
        BorderPane root = new BorderPane();
        Button buttonAlgorithmus1 = new Button("Algorithmus 1");
        Button buttonAlgorithmus2 = new Button("Algorithmus 2");
        Button buttonAlgorithmus3 = new Button("Algorithmus 3");
        Button buttonAlgorithmus4 = new Button("Algorithmus 4");
        Button buttonAlgorithmus5 = new Button("Algorithmus 5");
        HBox hBox = new HBox(20);
        hBox.setPadding(new Insets(20));
        hBox.getChildren().addAll(buttonAlgorithmus1, buttonAlgorithmus2, buttonAlgorithmus3, buttonAlgorithmus4, buttonAlgorithmus5);
        root.setTop(hBox);

        final Label labelHeading = new Label("     Algorithmus X");
        labelHeading.setFont(new Font(30));

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15));
        vBox.getChildren().addAll(labelHeading);


        HBox hBoxContend = new HBox(30);
        hBoxContend.setPadding(new Insets(30));
        VBox vBox1000 = new VBox(20);
        VBox vBox10000 = new VBox(20);
        VBox vBox100000 = new VBox(20);

        Label labelTausend = new Label("100 Zeichen");
        labelTausend.setFont(new Font(25));
        Label labelTausendBestCase = new Label("Best Case");
        Label labelTausendWorstCase = new Label("Worst Case");
        Label labelTausendAverageCase = new Label("Average Case");
        vBox1000.getChildren().addAll(labelTausend, labelTausendBestCase, labelTausendWorstCase, labelTausendAverageCase);


        Label labelZehntausend = new Label("1.000 Zeichen");
        labelZehntausend.setFont(new Font(25));
        Label labelZehntausendBestCase = new Label("Best Case");
        Label labelZehntausendWorstCase = new Label("Worst Case");
        Label labelZehntausendAverageCase = new Label("Average Case");
        vBox10000.getChildren().addAll(labelZehntausend, labelZehntausendBestCase, labelZehntausendWorstCase, labelZehntausendAverageCase);


        Label labelHundertausend = new Label("10.000 Zeichen");
        labelHundertausend.setFont(new Font(25));
        Label labelHundertausendBestCase = new Label("Best Case");
        Label labelHundertausendWorstCase = new Label("Worst Case");
        Label labelHundertausendAverageCase = new Label("Average Case");
        vBox100000.getChildren().addAll(labelHundertausend, labelHundertausendBestCase, labelHundertausendWorstCase, labelHundertausendAverageCase);
        hBoxContend.getChildren().addAll(vBox1000,vBox10000,vBox100000);
        vBox.getChildren().addAll(hBoxContend);
        root.setCenter(vBox);

        labels.add(labelTausendBestCase);
        labels.add(labelTausendWorstCase);
        labels.add(labelTausendAverageCase);

        labels.add(labelZehntausendBestCase);
        labels.add(labelZehntausendWorstCase);
        labels.add(labelZehntausendAverageCase);

        labels.add(labelHundertausendBestCase);
        labels.add(labelHundertausendWorstCase);
        labels.add(labelHundertausendAverageCase);


        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("theme.css").toString());
        stage.setScene(scene);
        stage.show();

        buttonAlgorithmus4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labelHeading.setText("     Algorithmus 4");
                Thread t1 = new AlgorithmusStarten(labels, 4);
                t1.run();

            }
        });


    }


}
