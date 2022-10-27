import java.util.Scanner;

public class Lab8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,Nums=0,Sum=0;
		double Average;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 5 numbers: ");
		for(i=0;i<5;i++) {
			Nums=scan.nextInt();
			Sum += Nums;
		}
		Average=Sum/5;
		System.out.println("The sum is: " + Sum);
		System.out.println("The average is: " + Average);
	}

}
