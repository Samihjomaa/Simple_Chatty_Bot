import java.util.Scanner;

class Main {
	public static void main (String[]args){
		int a;
		int b;
		try (Scanner scan = new Scanner(System.in)) {

			a = scan.nextInt();
			b = scan.nextInt();
			a-=1;
		}
		int i;
		for (i=a; i <b; ++i ){
			a++;

			if (a%3==0 && a%5 ==0){
				System.out.println("FizzBuzz");
			}
			else if (a%3 ==0){
				System.out.println("Fizz");
			}
			else if (a%5==0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(a);
			}
		}
	}
}
