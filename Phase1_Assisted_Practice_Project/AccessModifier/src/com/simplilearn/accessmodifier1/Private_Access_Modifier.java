package com.simplilearn.accessmodifier1;

public class Private_Access_Modifier {

	public static void main(String[] args) {
		PrivateAccessModifier obj = new PrivateAccessModifier();
		//Private Modifier
		//obj.method();

	}

}

class PrivateAccessModifier{
	private void method(){
		System.out.println("You are using private access modifier");
	}
}