package com.nithish.numToWord.numToWords;

import com.nithish.numToWord.Words.IWords;

public class NumToWordsImp implements INumToWords {
	
	IWords iwords;
	
	NumToWordsImp(IWords iwords){
		this.iwords=iwords;
	}
	
		public String numToWords(int n, String s)
	    {
	        String str = "";
	        // if n is more than 19, divide it
	        
	        if(n>100) {
	        	str+=iwords.oneswords()[n/100]+"hundred and "+iwords.tenswords()[(n%100)/10]+iwords.oneswords()[(n%100)%10];
	        }
	        else if (n > 19) {
	            str += iwords.tenswords()[n / 10] + iwords.oneswords()[n % 10];
	        }
	        else {
	            str += iwords.oneswords()[n];
	        }
	 
	        // if n is non-zero
	        if (n != 0) {
	            str += s;
	        }
	 
	        return str;
	    }

}
