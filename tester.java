
public class tester {
	int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
	{
		 for (int i = 8; i >= 0; i--) { a[i] = a[i + 1]; }
	}
	import java.util.Scanner;

	public class P6_11 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int[] firstArray = new int[5];
	        for (int i = 0; i < firstArray.length; i++) {
	            System.out.printf("%d element of array: ", i + 1);
	            firstArray[i] = input.nextInt();
	        }

	        int[] secondArray = new int[5];
	        for (int i = 0; i < secondArray.length; i++) {
	            System.out.printf("%d element of array: ", i + 1);
	            secondArray[i] = input.nextInt();
	        }

	        input.close();

	        boolean isSameElements = sameElements(firstArray, secondArray);
	        System.out.printf("Are same elements? %s", isSameElements);
	    }

	    public static boolean sameElements(int[] a, int[] b) {
	        for (int i = 0; i < a.length; i++) {
	            int currentElement = a[i];

	            int firstArrayOccurrences = 0;
	            for (int j = 0; j < a.length; j++) {
	                if (a[j] == currentElement) {
	                    firstArrayOccurrences++;
	                }
	            }

	            int secondArrayOccurences = 0;
	            for (int j = 0; j < b.length; j++) {
	                if (b[j] == currentElement) {
	                    secondArrayOccurences++;
	                }
	            }

	            if (firstArrayOccurrences != secondArrayOccurences) {
	                return false;
	            }
	        }

	        return true;
	    }
	}

}
