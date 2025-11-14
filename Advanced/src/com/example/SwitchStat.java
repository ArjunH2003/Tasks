package com.example;

public class SwitchStat {
	
	//public static String validate(String day) {
		
//		switch(day) {
//		case "Monday":return("Day 1 Meeting");
//		case "Tuesday":return("Day 2 Meeting");
//		case "Wednesday":return("Day 3 Meeting");
//		default:System.out.println("Ïnvalid Day");
//		}
//		return day;
//	}
//	

	public static void main(String[] args) {
		//System.out.println(validate("Monday"));
		

        String day = "MONDAY";

        String result = switch (day) {
            case "MONDAY" -> "Start of the week";
            case "TUESDAY" -> "Second day";
            case "WEDNESDAY" -> "Middle of the week";
            case "THURSDAY" -> "Almost there";
            case "FRIDAY" -> "End of the workweek";
            case "SATURDAY", "SUNDAY" -> "Weekend!"; 
            default -> "Invalid day";  
        };

        System.out.println(result);
    }
	}

