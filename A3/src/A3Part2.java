//                      Samuel Reeder
//                     	CS 4110 - 3:36 pm
//                      Assignment 3
//                      Dr. Rague
//                      Due: 04/10/2018
//                      Version: 1.0

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
		       "0,y=>y,R,3",
		       "1,y=>y,R,1",
		       "1,b=>b,R,1",
		       "1,a=>y,L,2",
		       "2,a=>a,L,2",
		       "2,b=>b,L,2",
		       "2,y=>y,L,2",
		       "2,x=>x,R,0",
		       "3,y=>y,R,3",
		       "3,a=>a,R,4",
		       "3,b=>b,R,6",
		       "4,#=>#,R,5",
		       "6,y=>y,L,6",
		       "6,#=>#,L,5",
		       "5,#=>#,L,5",
		       };
		
	    char[] ST = {'R','R','R','R','R','H'};

	 

	    String inString;
	    boolean accept1;
	    TM TM1 = new TM(C, ST);
	    //if(args.length >= 1){
	       //Input string is command line parameter
	      inString = "bbaaaa";
	      // Process input string
	      accept1 = TM1.ProcessData(inString);
	      System.out.println("\n Valid string?   " + accept1);
	    //}
	  }// end main

}
