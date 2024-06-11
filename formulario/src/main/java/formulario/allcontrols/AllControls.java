package formulario.allcontrols;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AllControls extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("All Controls");

        // Create a BorderPane to hold the entire layout
        BorderPane borderPane = new BorderPane();

        // Create a GridPane to hold the controls
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add labels and controls to the GridPane
        grid.add(new Label("Button:"), 0, 0);
        grid.add(new Button("Button"), 1, 0);

        grid.add(new Label("CheckBox:"), 0, 1);
        grid.add(new CheckBox("CheckBox"), 1, 1);

        grid.add(new Label("Hyperlink:"), 0, 2);
        grid.add(new Hyperlink("Hyperlink"), 1, 2);

        grid.add(new Label("ToggleButton:"), 0, 3);
        grid.add(new ToggleButton("ToggleButton"), 1, 3);

        grid.add(new Label("RadioButton:"), 0, 4);
        grid.add(new RadioButton("RadioButton"), 1, 4);

        grid.add(new Label("Label:"), 0, 5);
        grid.add(new Label("Label"), 1, 5);

        grid.add(new Label("TextField:"), 0, 6);
        grid.add(new TextField(), 1, 6);

        grid.add(new Label("PasswordField:"), 0, 7);
        grid.add(new PasswordField(), 1, 7);

        // Create an HBox to hold the TextArea
        HBox textAreaHBox = new HBox(10);
        textAreaHBox.setAlignment(Pos.CENTER);
        textAreaHBox.setPadding(new Insets(10, 0, 10, 0));
        textAreaHBox.getChildren().add(new Label("TextArea:"));
        textAreaHBox.getChildren().add(new TextArea("This is very long text that will wrap to several lines."));
        grid.add(textAreaHBox, 0, 8, 2, 1);

        // Create an HBox to hold the ProgressIndicator
        HBox progressIndicatorHBox = new HBox(10);
        progressIndicatorHBox.setAlignment(Pos.CENTER);
        progressIndicatorHBox.setPadding(new Insets(10, 0, 10, 0));
        progressIndicatorHBox.getChildren().add(new Label("ProgressIndicator:"));
        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.setProgress(0.49);
        progressIndicatorHBox.getChildren().add(progressIndicator);
        grid.add(progressIndicatorHBox, 0, 9, 2, 1);

        // Create an HBox to hold the ProgressBar
        HBox progressBarHBox = new HBox(10);
        progressBarHBox.setAlignment(Pos.CENTER);
        progressBarHBox.setPadding(new Insets(10, 0, 10, 0));
        progressBarHBox.getChildren().add(new Label("ProgressBar:"));
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.49);
        progressBarHBox.getChildren().add(progressBar);
        grid.add(progressBarHBox, 0, 10, 2, 1);

        // Create a HBox to hold the Slider
        HBox sliderHBox = new HBox(10);
        sliderHBox.setAlignment(Pos.CENTER_LEFT);
        sliderHBox.setPadding(new Insets(10, 0, 10, 0));
        sliderHBox.getChildren().add(new Label("Slider:"));
        Slider slider = new Slider();
        slider.setValue(49);
        sliderHBox.getChildren().add(slider);
        borderPane.setBottom(sliderHBox);

        // Set the GridPane as the center of the BorderPane
        borderPane.setCenter(grid);

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}