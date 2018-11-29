import java.util.ArrayList;
import java.lang.*;

public class DayTwoGitHub{
	public static void main(String[]args){
		ArrayList<Integer> list = convertToArrayList(8950);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(8);
		list2.add(9);
		list2.add(5);
		list2.add(0);
		System.out.println(putTogether(list2));

	}
	public static ArrayList<Integer> convertToArrayList(int value){
		ArrayList<Integer> list = new ArrayList<>();
		while(value > 0){
			list.add(0, value%10);
			value= value/10;
		}
		return list;
	}

	public static int putTogether(ArrayList<Integer> arr){
		int x = 0;
		for(int i = 0; i < arr.size(); i++){
			x += arr.get(i) * Math.pow(10, arr.size()-(i+1));
		}//end for
		return x;
	}//close method
}