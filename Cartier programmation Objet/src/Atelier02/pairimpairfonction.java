package Atelier02;

/**
 * 
 * @author Virgile
 *
 */

public class pairimpairfonction {
	/**
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		//test de pair et impair
		System.out.println(pair(3));
		System.out.println(impair(4));
		
	}
	/**
	 * 
	 * @param v
	 * @return
	 */
	public static boolean pair (int v) {
		return ((v%2)==0);
	}
	/**
	 * 
	 * @param v
	 * @return
	 */
	public static boolean impair (int v) {
		return !pair(v);
		/**
		 * 
		 */
	}
	
}