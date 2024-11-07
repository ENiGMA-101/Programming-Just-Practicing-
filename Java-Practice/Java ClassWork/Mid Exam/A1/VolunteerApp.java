package vol.app;

import java.util.Scanner;

import vol.Volunteer;
import vol.VolunteerManagement;

public class VolunteerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		VolunteerManagement management = new VolunteerManagement();

		while (true) {
			System.out.println("\n--- Volunteer Management System ---");
			System.out.println("1. Add a volunteer");
			System.out.println("2. Start training for a volunteer");
			System.out.println("3. Complete training for a volunteer");
			System.out.println("4. View a specific volunteer");
			System.out.println("5. View all volunteers");
			System.out.println("6. View volunteers who completed training");
			System.out.println("7. Exit");

			int choice = scan.nextInt();

			if (choice == 1) {
				// Add a volunteer
				System.out.print("Enter name: ");
				String name = scan.next();
				System.out.print("Enter NID: ");
				String nid = scan.next();
				System.out.print("Enter age: ");
				int age = scan.nextInt();
				System.out.print("Enter gender: ");
				String gender = scan.next();
				System.out.print("Enter volunteer area: ");
				String area = scan.next();

				Volunteer volunteer = new Volunteer(name, nid, age, gender, area);
				management.addVolunteer(volunteer);
			} else if (choice == 2) {
				// Start training
				System.out.print("Enter NID: ");
				String startNid = scan.next();
				management.StartTraining(startNid);

			} else if (choice == 3) {
				// Complete training
				System.out.print("Enter NID: ");
				String completeNid = scan.next();
				management.CompleteTraining(completeNid);

			} else if (choice == 4) {
				// View a specific volunteer
				System.out.print("Enter NID: ");
				String viewNid = scan.next();
				management.viewVolunteer(viewNid);

			} else if (choice == 5) {
				// View all volunteers
				management.viewAllVolunteer();

			} else if (choice == 6) {
				// View volunteers who completed training
				management.viewCompleteTask();

			} else if (choice == 0) {
				break;

			} else {
				System.out.println("Invalid choice. Please try again.");
			}

		}
		scan.close();
	}
}
