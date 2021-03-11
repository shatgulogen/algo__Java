import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // O(nlog(n) + m(log(m))) time | O(1) space
		//sort the arrays in place
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		//declare the two pointers for both arrays
		int idxOne = 0;
		int idxTwo = 0;
		// smallest difference that you are keeping track of
		//Initialize to infinity to simplify the line of code to update the smallest difference
		//At the begining, infinity is greater than anything, whatever the first difference you get
		//You will be able to update the smallest accordingly
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		//Initialize the smallest pair that you are keeping track of to an empty array of 2 elements.
		int[] smallestPair = new int[2];
		//while both pointers are valid and pointing at indeces that are contained 
		//in those arrays, we will do comparisons
		while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				idxOne++;
			} else if (secondNum < firstNum){
				current = firstNum - secondNum;
				idxTwo++;
			} else {
				return new int[] {firstNum, secondNum};
			}
			//we need to check if the current smallest difference is updated
			if (smallest > current){
				smallest = current;
				smallestPair = new int[] {firstNum, secondNum};
			}
		}
    return smallestPair;
  }
}
