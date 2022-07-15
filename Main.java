package SortCollection;

public class Main {
	
	public static void printlist(int[] list) {
		for(int n : list) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] test = {2,4,5,1,3,8,6};
		Main.printlist(test);
		test = quick.quicksort(test);
		Main.printlist(test);
	}
}
