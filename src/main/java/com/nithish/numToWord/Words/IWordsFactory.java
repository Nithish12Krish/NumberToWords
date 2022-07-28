package com.nithish.numToWord.Words;

public class IWordsFactory {
	
	public static  IWords ifactory() {
		IWords i= new WordsImp();
		return i;
	}
}
