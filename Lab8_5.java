import java.util.ArrayList;

public class Lab8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>Colors=new ArrayList<String>();
		Colors.add("Red");
		Colors.add("Green");
		Colors.add("Orange");
		Colors.add("White");
		Colors.add("Black");
		if(Colors.contains("Red")) {
			System.out.println("This list does contain the color red");
		}
		else {
			System.out.println("This list does not contain the color red");
		}
	}

}
