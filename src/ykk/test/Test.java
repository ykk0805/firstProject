package ykk.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*char c1= 'a';
		int i = c1 +2;
		char c2 = (char) i;
		System.out.println(c2);*/
		
		/*int i = 100000000;
		int a = 100;
		long b = 100l*i;
		System.out.println(b);*/
		//final int MAX_S = 1;
		
		//9*9 
		/*for (int i = 1; i <= 9; i ++) {
			for (int j = 1; j <= i; j++ ) {
				System.out.print(j+"*"+i +"=" +i*j + "  ");
			}
		System.out.println("");
		}*/
		
		/*for (int i = 0 ; i < 10; i ++) {
			System.out.println((int)(Math.random()*10)+1);
		}
 */		
		
		
		//break and coutinue
		
		/*outer:for (int i = 100; i < 150; i ++) {
			for (int j = 2; j < i/2; j ++){
				if (i % j == 0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
		*/

		//¼üÅÌ¼üÈë   Scanner
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.next();
//		System.out.println(str);
	} 
	
	//µÝ¹éËã·¨
	public static int test1(int num) {
		if (num <= 1) {
			return num;
		}else {
			return num*test1(num-1);
		}
	}
}
