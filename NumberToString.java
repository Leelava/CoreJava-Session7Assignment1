package StringAssignments;

public class NumberToString {
	/*This method takes aDouble variable converts them to String using the string function called "valueOf()"
	 * Once after the conversion performs some string operations using  Indexof() to get the position of".".and 
	 * length()  functions . This  gives the output as number of digits after and before decimal point in a 
	 * number
	 * 
	 */
	public static void main(String[] args) {
		double d = 858.48;
		System.out.println("Number to convert is " +d);
        String s = String.valueOf(d);
        
        int dot = s.indexOf('.');
        
        System.out.println("After conversion ,the indexof()  decimal point is" + dot);
        
        System.out.println(dot + " digits " +
            "before decimal point.");
        
        System.out.println( (s.length() - dot - 1) +
            " digits after decimal point.");
    }

	

}
