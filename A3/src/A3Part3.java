//                      Samuel Reeder
//                     	CS 4110 - 10:01 pm
//                      Assignment 3
//                      Dr. Rague
//                      Due: 04/10/2018
//                      Version: 1.0
// -----------------------------------------------------------------
//This program makes us of the TM class to test strings provided from 
//the command line to see if they fit into the language defined as follows:
//A TM for alphabet {x,y} that recognizes the language consisting of all odd-length palindromes.   
// -----------------------------------------------------------------
public class A3Part3 {

	public static void main(String[] args)
	  {
	    // Language: strings in which the second letter is 
	    String[] C  =
		      {"0,x=>#,R,1",
		       "0,y=>#,R,2",
		       "1,y=>y,R,4",
		       "1,x=>x,R,4",
		       "1,#=>#,R,3",
		       "2,#=>#,R,3",
		       "2,x=>x,R,7",
		       "2,y=>y,R,7",
		       "4,x=>x,R,4",
		       "4,y=>y,R,4",
		       "4,#=>#,L,5",
		       "5,x=>#,L,6",
		       "6,x=>x,L,6",
		       "6,y=>y,L,6",
		       "6,#=>#,R,0",
		       "7,x=>x,R,7",
		       "7,y=>y,R,7",
		       "7,#=>#,L,8",
		       "8,y=>#,L,6",
		       "3,#=>3,R,3"};
		
	    char[] ST = {'R','R','R','H','R','R','R','R','R'};

	 

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
