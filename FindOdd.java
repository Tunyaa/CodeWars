public class FindOdd {
	public static int findIt(int[] a) {
    int r = 0;
    for(int n:a)r^=n;
  	return r;
  }
}
