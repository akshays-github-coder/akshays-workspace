package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	private String qualification;
	// private Nurse nurse;

	public Doctor(String qualification) {
		super();
		this.qualification = qualification;
	}

	/*
	 * public Nurse getNurse() { return nurse; }
	 * 
	 * public void setNurse(Nurse nurse) { this.nurse = nurse; }
	 */
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void assist() {
		System.out.println("Doctor is assisting");
	}
}
