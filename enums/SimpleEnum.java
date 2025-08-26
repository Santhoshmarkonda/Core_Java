package com.enums;

enum Status {
	RUNNING("running"), COMPLETE("successful"), PENDING("please wait"), ERROR("failed");

	private String status;

	Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return this.name() + " (" + status + ")";
	}

}

public class SimpleEnum {
	public static void main(String[] args) {
//		Status[] s = Status.values();
//		
//		for(int i =0;i<4;i++) {
//			System.out.println(s[i]);
//		}

		for (Status s : Status.values()) {
			System.out.println(s);
		}

	}
}
