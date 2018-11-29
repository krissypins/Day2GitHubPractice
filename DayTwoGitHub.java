import java.util.ArrayList;
import java.lang.*;

public class DayTwoGitHub{
	public static void main(String[]args){
		ArrayList<Integer> list = convertToArrayList(8950);
		System.out.println(list);
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
			x += Math.pow(arr.get(i), arr.size()-i);
		}//end for
		return x;
	}//close method
}