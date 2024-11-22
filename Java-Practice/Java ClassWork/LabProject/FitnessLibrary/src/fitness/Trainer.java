package fitness;

import java.util.ArrayList;

public class Trainer extends User {
	private int yearOfExperience;
	private ArrayList<Trainee> myTrainees;
	private ArrayList<Trainee> myTraineeRequests;

	public Trainer(String name, int age, float weight, float height, int yearOfExperience) {
		super(name, age, weight, height);
		this.yearOfExperience = yearOfExperience;
		this.myTrainees = new ArrayList<>();
		this.myTraineeRequests = new ArrayList<>();
		addPrefixToId("11-");
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public ArrayList<Trainee> getMyTrainees() {
		return myTrainees;
	}

	public ArrayList<Trainee> getMyTraineeRequests() {
		return myTraineeRequests;
	}

	public Trainee findTrainee(String traineeId) {
		for (Trainee trainee : myTrainees) {
			if (trainee.getFitnessId().equals(traineeId))
				return trainee;
		}
		return null;
	}

	public Trainee findTraineeRequest(String traineeId) {
		for (Trainee trainee : myTraineeRequests) {
			if (trainee.getFitnessId().equals(traineeId))
				return trainee;
		}
		return null;
	}

	public void addTrainee(Trainee trainee) {
		myTrainees.add(trainee);
	}

	public void addTraineeRequest(Trainee trainee) {
		myTraineeRequests.add(trainee);
	}

	public void acceptTraineeRequest(String traineeId) {
		Trainee trainee = findTraineeRequest(traineeId);
		if (trainee != null) {
			myTraineeRequests.remove(trainee);
			myTrainees.add(trainee);
		}
	}

	public void addWorkoutForTrainee(Trainee trainee, WorkOut workOut) throws Exception {
		if (findTrainee(trainee.getFitnessId()) != null) {
			trainee.addWorkOutItem(workOut.getName(), workOut.getType());
		} else {
			throw new Exception(getName() + " doesn't have the authority to assign work out item.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", yearOfExperience=" + yearOfExperience;
	}

	@Override
	public String toString(boolean details) {
		if (!details)
			return toString();
		return toString() + String.format(", trainees=%d, requests=%d", myTrainees.size(), myTraineeRequests.size());
	}
}
