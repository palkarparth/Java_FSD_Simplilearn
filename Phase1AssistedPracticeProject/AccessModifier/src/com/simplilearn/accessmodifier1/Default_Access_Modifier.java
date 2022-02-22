package com.simplilearn.accessmodifier1;

public class Default_Access_Modifier {

	public static void main(String[] args) {
		defaccessmodifier d= new defaccessmodifier();
		d.method();

	}

}

class defaccessmodifier{
	void method(){
		System.out.println("You are Using Default Access Modifier");
	}
}

