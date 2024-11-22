package app;

import java.util.Scanner;
import fitness.*;

public class FitnessApp 
{
	private static final String ADMIN_ID = "ADMIN";
	private static final String ADMIN_PASSWORD = "admin321";

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		FitnessCenter myFitness = new FitnessCenter("MyFitness Center");

		while (true) 
		{
			System.out.println("\n--- Fitness Tracking System ---");
			System.out.println("Select User Type:");
			System.out.println("1. Admin");
			System.out.println("2. Trainer");
			System.out.println("3. Trainee");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int userTypeChoice = scanner.nextInt();
			scanner.nextLine();

			switch (userTypeChoice) 
			{
				case 1:
					handleAdminMenu(scanner, myFitness);
					break;
	
				case 2:
					handleTrainerMenu(scanner, myFitness);
					break;
	
				case 3:
					handleTraineeMenu(scanner, myFitness);
					break;
	
				case 4:
					System.out.println("Exiting the Fitness Tracking System. Goodbye!");
					return;
	
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void handleAdminMenu(Scanner scanner, FitnessCenter myFitness) 
	{
		System.out.print("Enter Admin ID: ");
		String inputAdminId = scanner.nextLine();
		System.out.print("Enter Admin Password: ");
		String inputAdminPassword = scanner.nextLine();

		if (!inputAdminId.equals(ADMIN_ID) || !inputAdminPassword.equals(ADMIN_PASSWORD)) {
			System.out.println("Invalid Admin Credentials. Access Denied.");
			return;
		}

		while (true) 
		{
			System.out.println("\n--- Admin Menu ---");
			System.out.println("1. Add New Trainer");
			System.out.println("2. Add New Trainee");
			System.out.println("3. View List of Trainers");
			System.out.println("4. View List of Trainees");
			System.out.println("5. Logout");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) 
			{
				case 1:
					System.out.println("Adding New Trainer:");
					System.out.print("Enter Name: ");
					String trainerName = scanner.nextLine();
					System.out.print("Enter Age: ");
					int trainerAge = scanner.nextInt();
					System.out.print("Enter Weight: ");
					float trainerWeight = scanner.nextFloat();
					System.out.print("Enter Height: ");
					float trainerHeight = scanner.nextFloat();
					System.out.print("Enter Years of Experience: ");
					int yearOfExperience = scanner.nextInt();
	
					String trainerId = myFitness.addTrainer(trainerName, trainerAge, trainerWeight, trainerHeight,
							yearOfExperience);
					System.out.println("Trainer added with ID: " + trainerId);
					break;
	
				case 2:
					System.out.println("Adding New Trainee:");
					System.out.print("Enter Name: ");
					String traineeName = scanner.nextLine();
					System.out.print("Enter Age: ");
					int traineeAge = scanner.nextInt();
					System.out.print("Enter Weight: ");
					float traineeWeight = scanner.nextFloat();
					System.out.print("Enter Height: ");
					float traineeHeight = scanner.nextFloat();
	
					String traineeId = myFitness.addTrainee(traineeName, traineeAge, traineeWeight, traineeHeight);
					System.out.println("Trainee added with ID: " + traineeId);
					break;
	
				case 3:
					System.out.println("--- List of Trainers ---");
					if (myFitness.getTrainers().isEmpty()) {
						System.out.println("No trainers found.");
					} else {
						for (Trainer trainer : myFitness.getTrainers()) {
							System.out.println(trainer.toString(true));
						}
					}
					break;
	
				case 4:
					System.out.println("--- List of Trainees ---");
					if (myFitness.getTrainees().isEmpty()) {
						System.out.println("No trainees found.");
					} else {
						for (Trainee trainee : myFitness.getTrainees()) {
							System.out.println(trainee.toString(true));
						}
					}
					break;
	
				case 5:
					return;
	
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}


	private static void handleTrainerMenu(Scanner scanner, FitnessCenter myFitness) 
	{
		try 
		{
			System.out.print("Enter Trainer ID: ");
			String trainerId = scanner.nextLine();
			Trainer trainer = myFitness.findTrainer(trainerId);
			myFitness.setLoggedInUser(trainer);

			while (true) 
			{
				System.out.println("\n--- Trainer Menu ---");
				System.out.println("1. Login");
				System.out.println("2. Set Workout Plan for Trainee");
				System.out.println("3. Add Workout Item");
				System.out.println("4. View My Trainees");
				System.out.println("5. View Trainee Progress");
				System.out.println("6. View Trainee Requests");
				System.out.println("7. Accept Trainee Request");
				System.out.println("8. Logout");
				System.out.print("Enter your choice: ");

				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) 
				{
					case 1:
						System.out.println("Login successful as Trainer.");
						break;
	
					case 2:
						System.out.print("Enter Trainee ID: ");
						String traineeId = scanner.nextLine();
						try 
						{
							Trainee trainee = myFitness.findTrainee(traineeId);
							System.out.print("Enter Workout Name: ");
							String workoutName = scanner.nextLine();
							System.out.print("Enter Workout Type: ");
							String workoutType = scanner.nextLine();
	
							WorkOut workout = new WorkOut(workoutName, workoutType);
							trainer.addWorkoutForTrainee(trainee, workout);
							System.out.println("Workout added for trainee.");
						} 
						catch (InvalidUserException e) 
						{
							System.out.println(e.getMessage());
						} 
						catch (Exception e) 
						{
							System.out.println(e.getMessage());
						}
						break;
	
					case 3:
						break;
	
					case 4:
						System.out.println("--- My Trainees ---");
						if (trainer.getMyTrainees().isEmpty()) {
							System.out.println("No trainees found.");
						} else {
							for (Trainee trainee : trainer.getMyTrainees()) 
							{
								System.out.println(trainee.toString(true));
							}
						}
						break;
	
					case 5:
						break;
	
					case 6:
						System.out.println("--- Trainee Requests ---");
						if (trainer.getMyTraineeRequests().isEmpty()) {
							System.out.println("No trainee requests found.");
						} else {
							for (Trainee request : trainer.getMyTraineeRequests()) {
								System.out.println(request.toString(true));
							}
						}
						break;
	
					case 7:
						System.out.print("Enter Trainee ID to Accept: ");
						String requestTraineeId = scanner.nextLine();
						trainer.acceptTraineeRequest(requestTraineeId);
						System.out.println("Trainee request accepted.");
						break;
	
					case 8:
						myFitness.setLoggedInUser(null);
						return;
	
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		} 
		catch (InvalidUserException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	private static void handleTraineeMenu(Scanner scanner, FitnessCenter myFitness) 
	{
		try 
		{
			System.out.print("Enter Trainee ID: ");
			String traineeId = scanner.nextLine();
			Trainee trainee = myFitness.findTrainee(traineeId);
			myFitness.setLoggedInUser(trainee);

			while (true) 
			{
				System.out.println("\n--- Trainee Menu ---");
				System.out.println("1. Login");
				System.out.println("2. View Trainers");
				System.out.println("3. Send Request to Trainer");
				System.out.println("4. View Workout Plan");
				System.out.println("5. Start Workout");
				System.out.println("6. Complete Workout");
				System.out.println("7. Logout");
				System.out.print("Enter your choice: ");

				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) 
				{
					case 1:
						System.out.println("Login successful as Trainee.");
						break;
	
					case 2:
						System.out.println("--- Available Trainers ---");
						if (myFitness.getTrainers().isEmpty()) {
							System.out.println("No trainers available.");
						} else {
							for (Trainer trn : myFitness.getTrainers()) 
							{
								System.out.println(trn.toString(true));
							}
						}
						break;
	
					case 3:
						System.out.print("Enter Trainer ID to Send Request: ");
						String trainerId = scanner.nextLine();
						myFitness.requestForTrainer(trainerId);
						System.out.println("Request sent to trainer.");
						break;
	
					case 4:
						System.out.println("--- My Workout Plan ---");
						if (trainee.getWorkOutPlan().isEmpty()) {
							System.out.println("No workout plan found.");
						} else {
							for (WorkOut workout : trainee.getWorkOutPlan()) 
							{
								System.out.println(workout);
							}
						}
						break;
	
					case 5:
						System.out.print("Enter Workout Name: ");
						String startWorkoutName = scanner.nextLine();
						System.out.print("Enter Workout Type: ");
						String startWorkoutType = scanner.nextLine();
						trainee.startWorkOut(startWorkoutName, startWorkoutType);
						System.out.println("Workout started.");
						break;
	
					case 6:
						System.out.print("Enter Workout Name: ");
						String completeWorkoutName = scanner.nextLine();
						System.out.print("Enter Workout Type: ");
						String completeWorkoutType = scanner.nextLine();
						trainee.completeWorkOut(completeWorkoutName, completeWorkoutType);
						System.out.println("Workout completed.");
						break;
	
					case 7:
						myFitness.setLoggedInUser(null);
						return;
	
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		} 
		catch (InvalidUserException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}