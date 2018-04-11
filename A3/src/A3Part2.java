//                      Samuel Reeder
//                     	CS 4110 - 12:12 pm
//                      Assignment 3
//                      Dr. Rague
//                      Due: 04/11/2018
//                      Version: 1.1
// -----------------------------------------------------------------
//This program makes us of the TM class to test strings provided from 
//the command line to see if they fit into the language defined as follows:
//A TM for alphabet {a,b} that recognizes the language consisting of all 
//words that contain N b's (N > 0, N is an integer) followed by N+1 a's  
// -----------------------------------------------------------------
public class A3Part2 {

	public static void main(String[] args)
	  {
	    // Language: strings in which the second letter is 
	    String[] C  =
		      {"0,b=>x,R,1",
		       "0,a=>a,R,4",
		       "0,b=>x,R,1",
		       "1,a=>a,R,1",
		       "1,b=>b,R,1",
		       "1,y=>y,L,2",
		       "1,#=>#,L,2",
		       "2,a=>y,L,3",
		       "3,b=>b,L,3",
		       "3,a=>a,L,3",
		       "3,x=>x,R,0",
		       "4,y=>y,R,4",
		       "4,#=>#,R,5",
		       "5,#=>#,R,5"};
		
	    char[] ST = {'R','R','R','R','R','H'};

	 

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
