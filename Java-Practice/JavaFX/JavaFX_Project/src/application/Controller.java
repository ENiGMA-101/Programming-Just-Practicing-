package application;

import java.util.ArrayList;

import fitness.lib.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {
	Pane root;
	Stage stage;
	Scene scene;

	@FXML
	TextField IdTF;
	String id;

	public void login(ActionEvent e) {
		id = IdTF.getText();
		if (id.equals("group2")) {
			try {
				System.out.println("Admin Logged in");
				root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
				scene = new Scene(root);
				Main.primaryStage.setScene(scene);
				Main.primaryStage.setTitle("Admin Menu");
				Main.primaryStage.show();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} 

		else if (id.charAt(0)=='1' && id.charAt(1)=='1') {
			try {
				Main.trainer = Main.center.findTrainer(id);
				Main.center.setLoggedInUser(null);
				System.out.println("Trainer Logged in");
				root = FXMLLoader.load(getClass().getResource("TrainerMenu.fxml"));
				scene = new Scene(root);
				Main.primaryStage.setScene(scene);
				Main.primaryStage.setTitle("Trainer Menu");
				Main.primaryStage.show();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}

		else if (id.charAt(0)=='2' && id.charAt(1)=='2') {
			try {
				Main.trainee = Main.center.findTrainee(id);
				System.out.println("Trainee Logged in");
				root = FXMLLoader.load(getClass().getResource("TraineeMenu.fxml"));
				scene = new Scene(root);
				Main.primaryStage.setScene(scene);
				Main.primaryStage.setTitle("Trainee Menu");
				Main.primaryStage.show();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

	@FXML
	public void Logout(ActionEvent e) {
		try {
			DataHandler.saveData(Main.center);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Logout");
			alert.setHeaderText("You are about to Log out");
			alert.setContentText("Do you really want to log out?");
			if(alert.showAndWait().get() == ButtonType.OK)
			{
				System.out.println("You successfully logged out");
				root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
				stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	
	
	

	
	/*
	===========================================================================================================================================
	                                         -- ADMIN MENU --
	===========================================================================================================================================
	*/
	
	
	@FXML
	public void AdminMenu(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}


	@FXML
	TextField TrainerName;
	@FXML
	TextField TrainerAge;
	@FXML
	TextField TrainerWeight;
	@FXML
	TextField TrainerHeight;
	@FXML
	TextField TrainerExperience;
	@FXML
	ListView fitness = new ListView();
	String fName="Data.txt";
	@FXML
	public void addTrainerinfo(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("addTrainerInfo.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainer Menu/TrainerI info");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public void addTrainer(ActionEvent e)
	{
		String name = TrainerName.getText();
		int age = Integer.parseInt(TrainerAge.getText()); 
		float weight = Float.parseFloat(TrainerWeight.getText());
		float height = Float.parseFloat(TrainerHeight.getText());
		int yearofexp = Integer.parseInt(TrainerExperience.getText());
		String Trainerid = Main.center.addTrainer(name, age, weight, height, yearofexp);
		System.out.println(Trainerid);
		
		TrainerName.clear();
		TrainerAge.clear();
		TrainerHeight.clear();
		TrainerWeight.clear();
		TrainerExperience.clear();
	}
	
	public void showTrainer(ActionEvent e)
	{
		ArrayList<Trainer> Trainers = Main.center.getTrainers();
		fitness.getItems().clear();
		for (Trainer t : Trainers)
		{
			System.out.println(t.toString());
			fitness.getItems().add(t.toString());
		}
	}
	
	@FXML
	TextField TraineeName;
	@FXML
	TextField TraineeAge;
	@FXML
	TextField TraineeWeight;
	@FXML
	TextField TraineeHeight;
	@FXML
	ListView fitness2 = new ListView();
	String fName2="Data2.txt";
	
	@FXML
	public void addTraineeinfo(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("addTraineeInfo.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainee Menu/Trainee info");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public void addTrainee(ActionEvent e)
	{
		String name = TraineeName.getText();
		int age = Integer.parseInt(TraineeAge.getText()); 
		float weight = Float.parseFloat(TraineeWeight.getText());
		float height = Float.parseFloat(TraineeHeight.getText());
		String Traineeid = Main.center.addTrainee(name, age, weight, height);
		System.out.println(Traineeid);
		
		TraineeName.clear();
		TraineeAge.clear();
		TraineeHeight.clear();
		TraineeWeight.clear();
	}
	
	public void showTrainee(ActionEvent e)
	{
		ArrayList<Trainee> Trainees = Main.center.getTrainees();
		fitness2.getItems().clear();
		for (Trainee t : Trainees)
		{
			System.out.println(t.toString());
			fitness2.getItems().add(t.toString());
		}
	}
	
	
	
	/*
	===========================================================================================================================================
	                                         -- TRAINER MENU --
	===========================================================================================================================================
	*/
	
	
	@FXML
	public void TrainerMenu(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("TrainerMenu.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@FXML
	public void SetWorkoutPlan_Progress(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("SetWorkOutPlan&Progress.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainer Menu/WorkOut Plan & Progress");
			stage.setScene(scene);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	
	@FXML
	public void ViewTraineeRequest(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("TraineeRequest.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainer Menu/View Trainee request");
			stage.setScene(scene);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	@FXML
	TextField AcceptID = new TextField();
	
	@FXML
	ListView TraineeListAfterAccept = new ListView();
	String fAccept="TraineeAccept.txt";
	
	public void showAcceptTrainee(ActionEvent e)
	{
		System.out.println(Main.trainer.getMyTrainees().toString());
		ArrayList<Trainee> Trainees = Main.center.getTrainees();
		TraineeListAfterAccept.getItems().clear();
		for (Trainee t : Trainees)
		{
			System.out.println(t.toString());
			TraineeListAfterAccept.getItems().add(t.toString());
		}
	}
	
	@FXML
	public void AcceptRequest(ActionEvent e) {
		try {
			Main.center.acceptTraineeRequest(AcceptID.getText());
			System.out.println(Main.center.getTrainees());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	
	
	public void showTraineeRequest(ActionEvent e)
	{
		System.out.println(Main.trainer.toString());
		ArrayList<Trainee> Trainees = Main.center.getTrainees();
		requestListView.getItems().clear();
		for (Trainee t : Trainees)
		{
			System.out.println(t.toString());
			requestListView.getItems().add(t.toString());
		}
	}
	
	public void showTraineeListAfterAccept(ActionEvent e)
	{
		ArrayList<Trainee> Trainees = Main.center.getTrainees();
		fitness2.getItems().clear();
		for (Trainee t : Trainees)
		{
			System.out.println(t.toString());
			fitness2.getItems().add(t.toString());
		}
	}
	
	@FXML
	public void showTraineeListAfterAcceptFXML(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("TraineeListAfterAccept.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainer Menu/WorkOut Plan & Progress");
			stage.setScene(scene);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	@FXML
	public void search(ActionEvent e)
	{
		try {
			Trainee t1 = Main.center.findTrainee(workoutid.getText());
			if(t1 == null)
			{
				System.out.println("Not found");
			}
			else
			{
				System.out.println("ID found");
				t1.addWorkOutItem(new WorkOut(workOutNameTrainer.getText(),workOutTypeTrainer.getText()));
				workOutNameTrainer.clear();
				workOutTypeTrainer.clear();
			}
		} catch (InvalidUserException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	@FXML
	public void saveWorkout(ActionEvent e)
	{
		try {
			Trainee t = Main.center.findTrainee(id);
			t.addWorkOutItem(new WorkOut(workOutName.getText(),workOutType.getText()));
			System.out.println("Workout plan added");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	
	
	
	/*
	===========================================================================================================================================
	                                         -- TRAINEE MENU --
	===========================================================================================================================================
	*/

	@FXML
	public void TraineeMenu(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("TraineeMenu.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainee Menu");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@FXML
	public void ViewTheTrainers(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("ViewTheListOfTrainers.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainee Menu/View Trainer list");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@FXML
	ListView requestListView = new ListView();
	String frequest="TraineeRequest.txt";

	@FXML
	TextField RequestID = new TextField();
	
	@FXML
	public void RequesttoTrainer(ActionEvent e) {
		try {
			Main.center.requestForTrainer(RequestID.getText());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	public void showTrainertoRequest(ActionEvent e)
	{
		ArrayList<Trainer> Trainers = Main.center.getTrainers();
		requestListView.getItems().clear();
		for (Trainer t : Trainers)
		{
			System.out.println(t.toString());
			fitness.getItems().add(t.toString());
		}
	}
	
	@FXML
	ListView workOutListView = new ListView();
	String workout="workout.txt";
	
	@FXML
	TextField workOutName = new TextField();
	
	@FXML
	TextField workOutType = new TextField();
	
	@FXML
	public void WorkOUTPlan(ActionEvent e)
	{
		try {
			Main.trainee.addWorkOutItem(new WorkOut(workOutName.getText(),workOutType.getText()));
			workOutName.clear();
			workOutType.clear();
			System.out.println("Workout plan");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	@FXML
	public void workoutProgress(ActionEvent e) {
		try {
			workOutListView.getItems().clear();
			for (WorkOut w : Main.trainee.getWorkOutPlan())
			{
//				System.out.println(w.toString());
				workOutListView.getItems().add(w.toString());
				System.out.println(w.toString());
			}
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	@FXML
	public void TraineeProgress(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("ShowListProgressTrainee.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainee Menu/Workout Plan");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	
	@FXML
	public void SpecificWorkoutPlan(ActionEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("WorkOut.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setTitle("Trainee Menu/Workout Plan");
			stage.setScene(scene);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@FXML
	TextField workoutid;
	
	@FXML
	ListView workOutListViewTrainer = new ListView();
	String workoutTrainer="workout.txt";
	
	@FXML
	TextField workOutNameTrainer = new TextField();
	
	@FXML
	TextField workOutTypeTrainer = new TextField();
	
	
	public void WorkoutPlanTrainer(ActionEvent e)
	{
		ArrayList<Trainee> Trainees = Main.center.getTrainees();
		workOutListViewTrainer.getItems().clear();
		for (Trainee t : Trainees)
		{
			System.out.println(t.toString());
			workOutListViewTrainer.getItems().add(t.toString());
		}
	} 
	public void complete(ActionEvent e)
	{
		try {
			System.out.println("Completed");
		}catch(Exception e1)
		{
			System.out.println("Completed");
			System.out.println(e1.getMessage());
		}
	}
	
	
	
}
