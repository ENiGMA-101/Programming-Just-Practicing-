package vol;

import java.util.*;

public class VolunteerManagement {

	ArrayList<Volunteer> volunteerList;

	public VolunteerManagement() {
		volunteerList = new ArrayList<>();
	}

	public Volunteer FindNid(String nid) {
		for (Volunteer v : volunteerList) {
			if (v.getNid().equals(nid)) {
				return v;
			}
		}
		return null;
	}

	public void addVolunteer(Volunteer volunteer) {
		volunteerList.add(volunteer);
	}

	public void StartTraining(String nid) {
		Volunteer v = FindNid(nid);
		if (v != null) {
			v.updatetrainingStatus("in progress");
			System.out.println("training started for " + v.getName());
		} else
			System.out.println("no volunteer");

	}
	
	public void CompleteTraining(String nid) {
		Volunteer v =FindNid(nid);
		if(v!=null)
		{
			v.updatetrainingStatus("Completed");
			System.out.println("training complete for " + v.getName());
		}
		else
			System.out.println("not found");
		
	}
	
	public void viewVolunteer(String nid) {
		Volunteer v = FindNid(nid);
		if(v!=null) {
			System.out.println(v.toString());   
		}
		else
			System.out.println("No such volunteer. Please check the id.");
	}
	
	public void viewCompleteTask() {
		int f=0;
		for(Volunteer v : volunteerList )
		{
			if("Completed".equalsIgnoreCase(v.getStatus())) {
				System.out.println(v.toString()); 
				f=1;
			}
		}
		if(f==0)
			System.out.println("not completed");
	}
	
	public void viewAllVolunteer() {
		if(volunteerList.isEmpty()) {
			System.out.println("empty");
		}
		else
		{
			for(Volunteer v : volunteerList)
			{
				System.out.println(v.toString());
			}
		}
	}
	
	

}
