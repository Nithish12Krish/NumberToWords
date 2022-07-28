package com.nithish.numToWord.Words;

public class WordsImp implements IWords {
	
	String one[] = { "", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen " };
	
	String ten[] = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };

	public String[] oneswords() {
		return one;
	}

	public String[] tenswords() {
		return ten;
	}

}
