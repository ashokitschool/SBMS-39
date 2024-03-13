package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {

	private Integer personId;

	private String passportNum;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	@Override
	public String toString() {
		return "PersonPK [personId=" + personId + ", passportNum=" + passportNum + "]";
	}

}
