package fitness;

import java.util.ArrayList;

public class FitnessCenter {
	private String name;
	private ArrayList<Trainer> trainers = new ArrayList<>();
	private ArrayList<Trainee> trainees = new ArrayList<>();
	private User loggedInUser = null;

	public FitnessCenter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Trainer> getTrainers() {
		return trainers;
	}

	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User user) {
		this.loggedInUser = user;
	}

	public String addTrainer(String name, int age, float weight, float height, int yearOfExperience) {
		Trainer trainer = new Trainer(name, age, weight, height, yearOfExperience);
		trainers.add(trainer);
		return trainer.getFitnessId();
	}

	public String addTrainee(String name, int age, float weight, float height) {
		Trainee trainee = new Trainee(name, age, weight, height);
		trainees.add(trainee);
		return trainee.getFitnessId();
	}

	public Trainer findTrainer(String id) throws InvalidUserException {
		for (Trainer trainer : trainers) {
			if (trainer.getFitnessId().equals(id))
				return trainer;
		}
		throw new InvalidUserException(id, "Trainer");
	}

	public Trainee findTrainee(String id) throws InvalidUserException {
		for (Trainee trainee : trainees) {
			if (trainee.getFitnessId().equals(id))
				return trainee;
		}
		throw new InvalidUserException(id, "Trainee");
	}

	public void requestForTrainer(String trainerId) throws InvalidUserException {
		if (loggedInUser instanceof Trainee) {
			Trainer trainer = findTrainer(trainerId);
			if (trainer != null) {
				trainer.addTraineeRequest((Trainee) loggedInUser);
			}
		}
	}

	public void acceptTraineeRequest(String traineeId) {
		if (loggedInUser instanceof Trainer) {
			((Trainer) loggedInUser).acceptTraineeRequest(traineeId);
		}
	}
}
