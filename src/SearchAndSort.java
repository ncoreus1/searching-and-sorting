import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("what algorithm would you like to execute?");
		String algorithm = in.nextLine();
		System.out.println();
		System.out.print("what type of data?");
		String data = in.nextLine();
		System.out.println();
		System.out.print("how is it stored? (array or list)");
		String stored = in.nextLine();
		System.out.println();
		
		
		switch(algorithm.toLowerCase()) {
			case "bubble":
				break;
			case "selection":
				break;
			case "insertion":
				break;
			case "merge":
				break;
			case "linear":
				break;
			case "binary":
				break;
			case "quit":
				break;
			default:
				System.out.print("Invalid input");
				break;
		}
	}
}