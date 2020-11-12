package classCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 =0, num2 =0, result =0;
		String op = "";
		
		System.out.println("-----계산기-----");
		System.out.print("수1:");
		num1 = sc.nextInt();
		System.out.print("수2:");
		num2 = sc.nextInt();
		
		op= sc.next();
		
		switch(op){
		case"+":
			result = num1 + num2;
			break;
		case"-":
			result = num1 - num2;
			break;
		case"*":
			result = num1 * num2;
			break;
		case"/":
			result = num1 / num2;
			break;
		default:
			System.out.println("잘못된 연산자 입력");
			result = 0;
			break;
		}
	System.out.println("계산결과 :" + result);
	}

}
