/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.test;

/**
 *
 * @author IDC-205
 */
import java.util.ArrayList;
import java.util.HashMap;

class Source {
	/* Add your code here 
        Length of the string * ASCII value of the first letter of the username
        */
    
    public int generateHashCode(String state){
        int output=0;
        try {
//            System.out.println("state.length():"+state.length()+"\tstate.codePointAt(1):"+state.codePointAt(0));
        output=state.length()*state.codePointAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

/**
Spam Filter
Description
You need to develop a custom hash function which takes " User Names" as input and generates a hash code for the same. 
* The logic used for generating the hash code is 
Length of the string * ASCII value of the first letter of the username
You are given the input usernames and just need to add your hashing function to the code.
Execution time limit

5 seconds
*/
//	public static void main(String args[]) {
//		ArrayList<String> states = new ArrayList<String>();
//		states.add("Barun");
//		states.add("Mayank");
//		states.add("Karan");
//		states.add("Shubham");
//
//		Source hd = new Source();
//		for (String s : states)
//			System.out.println(hd.generateHashCode(s));
//	}
    
    /**
     HashMap
Description
 You need to develop a Spam Filter which accepts a number and then decides whether that number is a spam or not spam. 
 * The list of numbers used is given below for your reference:

    111:SPAM
    101:NOT SPAM
    105:NOT SPAM
    113:SPAM
    118:NOT SPAM


You need to add your code to the below code given below so that the program can detect whether the number is spam or not.
Execution time limit

5 seconds
*/
    private static HashMap<Long,String> spamList = new HashMap<Long,String>();
	static {
		spamList.put(111L, "SPAM");
		spamList.put(112L, "SPAM");
		spamList.put(113L, "SPAM");
		spamList.put(114L, "SPAM");
		spamList.put(115L, "SPAM");
		spamList.put(116L, "SPAM");
	}

        public static String isSpam(Long ln){
            if (spamList.containsKey(ln)) {
			return spamList.get(ln);
		} else {
			return "NOT SPAM";
		}
    }

    public static void main(String[] args) {
		ArrayList<Long> phoneNum = new ArrayList<Long>();
		phoneNum.add(111L);
		phoneNum.add(101L);
		phoneNum.add(105L);
		phoneNum.add(113L);
		phoneNum.add(118L);

		for (Long ln : phoneNum) {
			System.out.println(ln + ":" + Source.isSpam(ln));
		}

	}
    
}

//Solution output
//485
//582
//485
//728
//
//Expected output
//
//330
//462
//375
//581