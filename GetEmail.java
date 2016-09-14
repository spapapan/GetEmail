import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;

public class GetEmail {
 
	public static void main(String[] args) {

		String RandomText = "asdf!>:<email@gmail.gr:..03asdf";
		
		LinkedList<String> correctEmails = new LinkedList<String>();
		
		for (int i=0; i<RandomText.length()-10; i++){
			for (int j=RandomText.length(); j>4+i; j--){
				if(getEmail(RandomText.substring(i,j))){
				correctEmails.add(RandomText.substring(i,j));
				}
			}
		}
		System.out.println("Correct Email: " + correctEmails.getFirst());
   
     }
		
	 
	 private static Boolean getEmail(String email){
	 Pattern p = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
	 Matcher matcher = p.matcher(email);
           matcher.find();
           if (matcher.matches()){
             	return true;
           }
		  return false;
	  }
}
