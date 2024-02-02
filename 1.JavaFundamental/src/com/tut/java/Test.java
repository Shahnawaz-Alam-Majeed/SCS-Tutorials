package com.tut.java;

import java.io.*;
class Test{
	public static void main(String []args) throws IOException {
		File f = new File("C:\\Users\\Snz-iQC\\Desktop\\SCS_UI_TUT\\Java\\src");
		//f.createNewFile ();
		int count=0;
		System.out.println("Total no of file "+ f.list ());
		String[] s = f.list ();
		for(String s1:s){
			File f1 = new File(f,s1);
			count++;
			System.out.println(s1);
			}
		System.out.println("Total no of file "+count);
		System.out.println("Hello ");
		}

}


























