import java.util.*;

class Program {
//O(n) time | O(n) space - where n is the length of the input array
  public int[] sortedSquaredArray(int[] array) {
   int[] sortedSquares = new int[array.length];
	 int smallerValueIdx = 0;
	 int largerValueIdx = array.length -1;
	 for (int idx =array.length -1; idx >=0; idx--){
      int smallerValue = array[smallerValueIdx];
			int largerValue = array[largerValueIdx];
			if (Math.abs(smallerValue) > Math.abs(largerValue)){
			sortedSquares[idx] = smallerValue * smallerValue;
			smallerValueIdx++;
			} else {
			sortedSquares[idx] = largerValue * largerValue;
			largerValueIdx --;
			}
	 }
    return sortedSquares;
  }
}
