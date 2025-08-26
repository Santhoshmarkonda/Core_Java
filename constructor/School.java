package com.constructor;

public class School {

	private String schoolName;
	private String schoolAddress;
	private String schoolMotto;

	private School(String schoolName, String schoolAddress, String schoolMotto) {
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolMotto = schoolMotto;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public void setSchoolMotto(String schoolMotto) {
		this.schoolMotto = schoolMotto;
	}
	
	public String toString() {
		return "School Name: ["+schoolName+"], Address: ["+schoolAddress+"], Motto: ["+schoolMotto+"]";
	}

	public static School getSchoolObject(String schoolName, String schoolAddress, String schoolMotto) {
        if (schoolName == null || schoolName.isEmpty() ||
            schoolAddress == null || schoolAddress.isEmpty() ||
            schoolMotto == null || schoolMotto.isEmpty()) {
            return null;
        }
        return new School(schoolName, schoolAddress, schoolMotto);
    }

}
