package com.nithish.numToWord;

import com.nithish.numToWord.ConvertToWords.ConvertToWordsFactory;
import com.nithish.numToWord.ConvertToWords.IConvertToWords;

public class App 
{
	static IConvertToWords CTW;
	App(IConvertToWords CTW){
		this.CTW=CTW;
	}
	
		
		 public static void main(String[] args)
		    {
		        
		        long n = 1000000;
		        ConvertToWordsFactory c=new ConvertToWordsFactory();
		        App a=new App(c.cfactory());
		 
		        System.out.printf(CTW.convertTowords(n));
		    }
	
	 
}
