

public class StringProcessing
{
    public static void main(String[] args)
    {
    	//use the split function
    	String toSplit = "Split this string!";
    	String[] afterSplit = toSplit.split(" ");
    	System.out.println("After the split:");
    	for(int i = 0; i < afterSplit.length; i++)
    		System.out.println("The String at location " + i + " is " + afterSplit[i]);
    		
    	System.out.println("---------------------------------------------------");
    	
    	//find and replace a section of a string	
        String sentence = "I hate text processing!";
        int position = sentence.indexOf("hate");
        String ending = 
                sentence.substring(position + "hate".length( ));
        
        System.out.println(sentence);
        System.out.println("The word \"hate\" starts at index "
                                                      + position);
 
        sentence = sentence.substring(0, position) + "adore" 
                                                    + ending;
        System.out.println("The changed string is:");
        System.out.println(sentence);
        
        System.out.println("---------------------------------------------------");
        
        //find the number of instances of the word Syntel
        String s = "My name is Jessica and I work for Syntel.  Syntel is an IT company.  We use Syntelligence for many differet things.";
        String temp = s;
        String syntel = "Syntel";
        int loc = 0;
        int count = 0;
        //search through for a location of the given substring
        while(loc != -1){
        	loc = temp.indexOf(syntel);
        	//if the location is found increment count and take out the section already searched.
        	if(loc != -1){
        		count++;
        		temp = temp.substring(loc+1);
        	}
        }
        System.out.println("There are " + count + " instance of the word " + syntel + " in the string '" + s + "'.");
    }
}
