package com.atlus.moodreactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class MoodReactor {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Feed Child With Ice Cream, Salad or Milk To See Child's Face Reaction : ");
		String food = null;	
		food = reader.readLine();

		System.out.println("Enter option for the method: 1,2,3,4");
		String option = reader.readLine();

		switch(option) {
		case "1":
			System.out.println(Original(food));
			break;
		case "2":
			System.out.println(Refactor1(food));
			break;
		case "3":
			System.out.println(Refactor2(food));
			break;
		case "4":
			System.out.println(Refactor3(food));
			break;
		default:
			System.out.println("Error wrong input");
		}

	}

	public static String Original(String food) {
		String faceReaction = null;
		if (food.equalsIgnoreCase("Ice Cream")) {
			faceReaction = "Happy" + " " + "Face";
		} else if (food.equalsIgnoreCase("Salad")) {
			faceReaction = "Angry" + " " + "Face";
		} else if (food.equalsIgnoreCase("Milk")) {
			faceReaction = "Normal" + " " + "Face";
		} else {
			faceReaction = "Error" + " " + "Face";
		}
		return faceReaction;	
	}
	public static String Refactor1(String food) {

		Map<String, String> reactions = new HashMap<String, String>();
		reactions.put("Ice Cream", "Happy Face");
		reactions.put("Salad", "Angry Face");
		reactions.put("Milk", "Normal Face");

		String faceReaction = reactions.getOrDefault(food, "Error Face");
		return faceReaction;
	}

	public static String Refactor2(String food) {
		String faceReaction;

		switch (food.toLowerCase()) {
		case "ice cream":
			faceReaction = "Happy Face";
			break;
		case "salad":
			faceReaction = "Angry Face";
			break;
		case "milk":
			faceReaction = "Normal Face";
			break;
		default:
			faceReaction = "Error Face";
		}
		return faceReaction; 
	}

	public enum FaceReaction {
		ICE_CREAM("Happy Face"),
		SALAD("Angry Face"),
		MILK("Normal Face"),
		ERROR("Error Face");

		private final String reaction;

		FaceReaction(String reaction) {
			this.reaction = reaction;
		}

		public String getReaction() {
			return reaction;
		}
	}

	public static String Refactor3(String food) {
		FaceReaction[] reactions = FaceReaction.values();

		for (FaceReaction reaction : reactions) {
			if (food.equalsIgnoreCase(reaction.name())) {
				return reaction.getReaction();
			}
		}
		return FaceReaction.ERROR.reaction;  
	}

}


