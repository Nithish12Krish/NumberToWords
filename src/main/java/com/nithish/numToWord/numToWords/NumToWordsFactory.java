package com.nithish.numToWord.numToWords;

import com.nithish.numToWord.Words.IWords;
import com.nithish.numToWord.Words.IWordsFactory;

public class NumToWordsFactory {
	
	public static INumToWords nfactory() {
		IWords iword=IWordsFactory.ifactory();
		INumToWords ntw= new NumToWordsImp(iword);
		return ntw;
	}

}
