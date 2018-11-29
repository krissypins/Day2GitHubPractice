import java.util.ArrayList;
public class DayTwoGitHub{
	public static ArrayList<Integer> convertToArrayList(int value){
		ArrayList<Integer> list = new ArrayList<>();
		while(value > 0){
			list.add(0, value%10);
			value= value/10;
		}
		return list;
	}
	public static void main(String[]args){
		ArrayList<Integer> list = convertToArrayList(8950);
		System.out.println(list);

	}
}