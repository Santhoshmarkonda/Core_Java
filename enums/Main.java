package com.enums;

enum Grade {
	A(90, 100, "Excellent"), B(75, 89, "Very Good"), C(60, 74, "Good"), D(40, 59, "Needs Improvement"),
	F(0, 39, "Fail");

	private int minScore;
	private int maxScore;
	private String description;

	Grade(int minScore, int maxScore, String description) {
		this.minScore = minScore;
		this.maxScore = maxScore;
		this.description = description;
	}

	public static Grade getGrade(int marks) {
		for (Grade g : Grade.values()) {
			if (marks >= g.minScore && marks <= g.maxScore) {
				return g;
			}
		}
		return null;
	}

	public String getDescription() {
		return description;
	}
}

public class Main {
	public static void main(String[] args) {
		int score = 92;
		Grade g = Grade.getGrade(score);

		if (g != null) {
			System.out.println("Score: " + score);
			System.out.println("Grade: " + g);
			System.out.println("Description: " + g.getDescription());
		} else {
			System.out.println("Invalid score: " + score);
		}

	}
}
