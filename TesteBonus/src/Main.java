
public class Main {

	public static void main(String[] args) {
		
			int cont;
			for(cont = 1; cont <= 100; cont++) {
				if(cont % 3 == 0 && cont % 5 == 0 ) {
					System.out.println("FizzBuzz");
				} else if(cont % 5 == 0) {
					System.out.println("Buzz");
				} else if(cont % 3 == 0) {
					System.out.println("Fizz");
				}
			}
		
		}
		
}
