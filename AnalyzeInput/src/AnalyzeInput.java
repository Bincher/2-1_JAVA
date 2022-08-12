import java.util.*;
import java.io.Console;

public class AnalyzeInput {
    public static void main(String[] args) {
    	ArrayList <String> text = new ArrayList <String> ();
    	Console cons;
    	String line = "";
    	
    	while ( (cons = System.console()) != null
    	&& (line = cons.readLine()) != null
    	&& !line.equals("*") ) 
    	{
    	List <String> str_list = new ArrayList <String> (Arrays.asList(line.split(" ")));
    	text.addAll( str_list );
    	// text.addAll(Arrays.asList(line.split(" "))); 
    	}
    	System.out.println("\nYou typed: " + text);
        System.out.println("Word count: " + text.size());
        	
        HashSet <String> str_set = new HashSet <String> ();
        str_set.addAll(text);
        Iterator <String> it = str_set.iterator();
        while (it.hasNext()) 
        {
            String str = (String) it.next();
            int str_times = Collections.frequency(text, str);
            System.out.println(str + " appears " + str_times + " times");
        }
    }
}