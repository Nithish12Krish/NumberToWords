package com.nithish.numToWord.ConvertToWords;

import com.nithish.numToWord.numToWords.INumToWords;

public class ConvertToWordsImp implements IConvertToWords {
	
	INumToWords numToWords;
	
	public ConvertToWordsImp(INumToWords numToWords) {
		this.numToWords=numToWords;
	}

	public String convertTowords(long n) {
		String out = "";
		 
        // handles digits at ten millions and hundred
        out += numToWords.numToWords((int)(n / 1000000), "million ");
 
        // handles digits at thousands and tens thousands
        // places (if any)
        out += numToWords.numToWords((int)((n / 1000) % 1000), "thousand ");
 
        // handles digit at hundreds places (if any)
        out += numToWords.numToWords((int)((n / 100) % 10), "hundred ");
 
        if (n > 100 && n % 100 > 0) {
            out += "and ";
        }
 
        // handles digits at ones and tens places (if any)
        out += numToWords.numToWords((int)(n % 100), "");
 
        return out;
	}

}
