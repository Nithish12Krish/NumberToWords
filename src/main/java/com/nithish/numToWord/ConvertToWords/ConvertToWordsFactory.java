package com.nithish.numToWord.ConvertToWords;


import com.nithish.numToWord.numToWords.INumToWords;
import com.nithish.numToWord.numToWords.NumToWordsFactory;


public class ConvertToWordsFactory {
	
	public IConvertToWords cfactory() {
		INumToWords inum=NumToWordsFactory.nfactory();
		IConvertToWords ctw= new ConvertToWordsImp(inum);
		return ctw;
	}
}
