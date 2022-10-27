import java.util.Scanner;

public class Lab8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your month 1-12: ");
		int Month=scan.nextInt();
		System.out.println("Enter your year: ");
		int Year=scan.nextInt();
		
		int NumOfDays;
		String Name;
		switch(Month) {
			case 1:
				Name = "January";
				NumOfDays = 31;
				System.out.println(Name + " has " + NumOfDays + " days.");
				break;
			case 2:
				String Name2 = "Febuary";
				int LeapYear=29;
				NumOfDays=28;
				if (Year % 4 != 0) {
				    System.out.println(Name2 + " has " + NumOfDays);
				  } else if (Year % 400 == 0) {
				    System.out.println(Name2 + " has " + LeapYear);;
				  } else if (Year % 100 == 0) {
					  System.out.println(Name2 + " has " + NumOfDays);
				  } else {
				    System.out.println(Name2 + " has " + LeapYear);
				  }
				break;
				  case 3:
						Name = "March";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 4:
						Name = "April";
						NumOfDays = 30;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 5:
						Name = "May";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 6:
						Name = "June";
						NumOfDays = 30;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 7:
						Name = "July";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 8:
						Name = "August";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 9:
						Name = "September";
						NumOfDays = 30;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 10:
						Name = "October";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 11:
						Name = "November";
						NumOfDays = 30;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  case 12:
						Name = "April";
						NumOfDays = 31;
						System.out.println(Name + " has " + NumOfDays + " days.");
						break;
				  default:
					  System.out.println("Invalid");
				  
		
	}

}
}
