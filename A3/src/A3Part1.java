//                      Samuel Reeder
//                     	CS 4110 - 3:24 pm
//                      Assignment 3
//                      Dr. Rague
//                      Due: 04/10/2018
//                      Version: 1.0
// -----------------------------------------------------------------
//This program makes us of the TM class to test strings provided from 
//the command line to see if they fit into the language defined as follows:
//A TM for alphabet {a,b} that recognizes the language consisting of all words 
//that contain the substring bbb.  
// -----------------------------------------------------------------
public class A3Part1 {

	public static void main(String[] args)
	  {
	    // Language: strings in which the second letter is 
	    String[] C  =
		      {"0,a=>a,R,0",
		       "0,b=>b,R,1",
		       "1,b=>b,R,2",
		       "1,a=>a,R,0",
		       "2,b=>b,R,4",
		       "2,a=>a,R,0"};
		
	    char[] ST = {'R','R','R','R','H'};

	 

	    String inString;
	    boolean accept1;
	    TM TM1 = new TM(C, ST);
	    if(args.length >= 1){
	       //Input string is command line parameter
	      inString = args[0];
	      // Process input string
	      accept1 = TM1.ProcessData(inString);
	      System.out.println("\n Valid string?   " + accept1);
	    }
	  }// end main

}
