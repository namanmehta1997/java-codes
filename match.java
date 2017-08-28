import java.util.regex.*;

class match{
	public static void main(String args[]){
		String INPUT = "1_2_3_4_5";
		String REGEX	="_";
		Pattern pattern = Pattern.compile(REGEX);
	    String[] result = pattern.split(INPUT);
	    for(String data:result){
	        System.out.println(data); 
	    }
	}
}