package com.hxd.Javabase.helloword;

public class ChengFa {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++){
			for(int a=1 ;a<=i;a++){
			
				System.out.print(a+"*"+i+"="+i*a+"\t");
			}
			System.out.println();
		}

	}

}
/*	public static void main(String args[]){
	for(int i=0;i<5;i++){
		for(int j=0;j<9;j++){
			if(j>=4-i&&j<=4+i) {System.out.print("*");}
			else {System.out.print(" ");}
		}
		System.out.println();
	}
}
}*/