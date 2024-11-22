package fitness;

import java.util.ArrayList;

public class Trainee extends User {
	private Trainer myTrainer;
	private ArrayList<WorkOut> workOutPlan;

	public Trainee(String name, int age, float weight, float height) {
		super(name, age, weight, height);
		this.workOutPlan = new ArrayList<>();
		addPrefixToId("22-");
	}

	public Trainer getMyTrainer() {
		return myTrainer;
	}

	public ArrayList<WorkOut> getWorkOutPlan() {
		return workOutPlan;
	}

	public void setMyTrainer(Trainer trainer) {
		this.myTrainer = trainer;
	}

	public void addWorkOutItem(String name, String type) {
		workOutPlan.add(new WorkOut(name, type));
	}

	public void startWorkOut(String name, String type) {
		for (WorkOut workout : workOutPlan) {
			if (workout.getName().equals(name) && workout.getType().equals(type)) {
				workout.startWorkOut();
				break;
			}
		}
	}

	public void completeWorkOut(String name, String type) {
		for (WorkOut workout : workOutPlan) {
			if (workout.getName().equals(name) && workout.getType().equals(type)) {
				workout.completeWorkOut();
				break;
			}
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", trainer=" + (myTrainer != null ? myTrainer.getName() : "none");
	}

	@Override
	public String toString(boolean details) {
		if (!details)
			return toString();
		return toString() + String.format(", workouts=%d", workOutPlan.size());
	}
}
