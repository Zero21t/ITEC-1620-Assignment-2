package Fall22;

import java.util.Scanner;

public class diceroller {
	
		//storage//
			static boolean Z = true;
			static int A;
			static int B;
			static int C;
			static int x;
			static int W;
			static int i=1;
	public static void rollA() {
		//rolls player 1 dice
		//random number rolled
		x = (int) (Math.floor((Math.random()*6)+ 1));
		W = (int) (Math.floor((Math.random()*6)+ 1));
		System.out.println("Player 1 rolled a: " + x + " and " + W);
		A =A+x+W;
		//if someone rolls two same numbers
		if(x==W) {
			x = (int) (Math.floor((Math.random()*6)+ 1));
			W = (int) (Math.floor((Math.random()*6)+ 1));
			System.out.println("Player 1 rolled a: " + x + " and " + W);
			A =A+x+W;
		}
		System.out.println("Player 1 has: " + A + " points");
	}
	
	public static void rollB() {
		//rolls player 1 dice
		//random number rolled
		x = (int) (Math.floor((Math.random()*6)+ 1));
		W = (int) (Math.floor((Math.random()*6)+ 1));
		System.out.println("Player 2 rolled a: " + x + " and " + W);
		B =B+x+W;
		//if someone rolls two same numbers
		if(x==W) {
			x = (int) (Math.floor((Math.random()*6)+ 1));
			W = (int) (Math.floor((Math.random()*6)+ 1));
			System.out.println("Player 2 rolled a: " + x + " and " + W);
			B =B+x+W;
		}
		System.out.println("Player 2 has: " + B + " points");
	}
	
	public static void rollC() {
		//rolls player 1 dice
		//random number rolled
		x = (int) (Math.floor((Math.random()*6)+ 1));
		W = (int) (Math.floor((Math.random()*6)+ 1));
		System.out.println("Player 3 rolled a: " + x + " and " + W);
		C =C+x+W;
		//if someone rolls two same numbers
		if(x==W) {
			x = (int) (Math.floor((Math.random()*6)+ 1));
			W = (int) (Math.floor((Math.random()*6)+ 1));
			System.out.println("Player 3 rolled a: " + x + " and " + W);
			C =C+x+W;
		}
		System.out.println("Player 3 has: " + C + " points");
	}

	public static void checker() {
		//checks which play is highest to lowest and who is 1st to 3rd place 
		if(A>=15|B>=15|C>=15) {
			i=2;
			if(A > B && A > C){
	            System.out.println("Player 1 wins the first place with total of "+A);
	            if(B > C) {
	            	System.out.println("Player 2 wins the second place with total of "+B);
	            	System.out.println("Player 3 wins the third place with total of "+C);
	            }else if(C> B) {
	            	System.out.println("Player 3 wins the second place with total of "+C);
	            	System.out.println("Player 2 wins the third place with total of "+B);
	            }
	        }
	        else if(B > C && B>A){
	        	System.out.println("Player 2 wins the first place with total of "+B);
	        	if(A > C) {
	            	System.out.println("Player 1 wins the second place with total of "+A);
	            	System.out.println("Player 3 wins the third place with total of "+C);
	            }else if(C> A) {
	            	System.out.println("Player 3 wins the second place with total of "+C);
	            	System.out.println("Player 1 wins the third place with total of "+A);
	            }
	        }
	        else if(C>B && C>A){
	        	System.out.println("Player 3 wins the first place with total of "+C);
	        	if(B > A) {
	            	System.out.println("Player 2 wins the second place with total of "+B);
	            	System.out.println("Player 1 wins the third place with total of "+A);
	            }else if(A> B) {
	            	System.out.println("Player 1 wins the second place with total of "+A);
	            	System.out.println("Player 2 wins the third place with total of "+B);
	            }
	        } 
			if(A==B && C<A) {
	        	System.out.println("Player 1 and 2 wins the first place");
	        	System.out.println("Player 3 wins the second place");
	        }else if(A==C && B<A) {
	        	System.out.println("Player 1 and 3 wins the first place");
	        	System.out.println("Player 2 wins the second place");
	        }else if(C==B && A<C) {
	        	System.out.println("Player 3 and 2 wins the first place");
	        	System.out.println("Player 1 wins the second place");
	        }
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loop rolls till someone gets 15//
		do {
			rollA();
			rollB();
			rollC();
			checker();
		}while(i<2);
	}
}
