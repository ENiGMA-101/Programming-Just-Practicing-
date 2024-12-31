package application;

import fitness.lib.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Main extends Application {
	static FitnessCenter center = new FitnessCenter("UAP");
	static Stage primaryStage;
	static Trainer trainer;
	static Trainee trainee;

	@Override
	public void start(Stage primaryStage) {
		Main.primaryStage = primaryStage;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Fitness Club App");
			primaryStage.show();
			primaryStage.setOnCloseRequest(event ->
			{
				event.consume();
				Logout(primaryStage);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void Logout(Stage primaryStage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You are about to Log out");
		alert.setContentText("Do you really want to Exit?");
		if(alert.showAndWait().get() == ButtonType.OK)
		{
			System.out.println("You successfully closed the window!");
			primaryStage.close();
		}
	}
	
	public static void main(String[] args) {
		try {
			center = DataHandler.loadData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		launch(args);
	}
}
