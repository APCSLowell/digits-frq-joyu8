import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		if(num == 0){
			digitList.add(0);
		}else {
			int ee = num % 10;
			digitList.add(0, ee);
			ee = ee / 10;
		}
	}

	public boolean isStrictlyIncreasing()
	{  
		int a = digitList.get(0);
		for(int i = 0; i < digitList.size(); i++){
			if(digitList.get(a) > digitList.get(i)){
				return false;
			}
		}
		return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
