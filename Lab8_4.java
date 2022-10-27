import java.util.ArrayList;
import java.util.Iterator;

public class Lab8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Nums=new ArrayList<Integer>();
		Nums.add(23);
		Nums.add(8);
		Nums.add(31);
		Nums.add(45);
		Nums.add(6);
		Nums.add(7);
		Nums.add(19);
		Nums.add(15);
		Iterator<Integer> i=Nums.iterator();
		while(i.hasNext()) {
			Integer NewNum=i.next();
			if (NewNum>10 && NewNum<20)
				i.remove();
		}
		System.out.println("The numbers more than 10 and less than 20: " + Nums);
	}

}
