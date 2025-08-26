package com.enums;

enum Days{
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
	
	private int num;
	
	Days(int num){
		this.num = num;
	}
	
	public static Days getDay(int number) {
		for(Days d : Days.values()) {
			if(d.num == number) {
				return d;
			}
		}
		return null;
	}
}

public class Day {
	
	public static void main(String[] args) {
		int number = 7;
		Days d = Days.getDay(number);
		System.out.println(d);
	}

}
