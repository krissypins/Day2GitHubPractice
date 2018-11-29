import java.util.ArrayList;
public class DayTwoGitHub{
	public static void main(String[]args){

	}
	public static int putTogether(ArrayList<Integer> arr){
		int x = 0;
		for(int i = 0; i < arr.size(); i++){
			x += arr.get(i);
		}//end for
		return x;
	}//close method
}