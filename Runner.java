package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Division test = new Division();
		try {
			test.division();
		} catch (MyExcep me) {
			// TODO Auto-generated catch block
			me.printStackTrace();
		}
		

	}

}
