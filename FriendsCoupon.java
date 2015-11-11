import java.util.*;
import java.io.*;

public class FriendsCoupon{

	public static int[][] friends;
	public static int numberOfCoupons;
	public static int numberOfUsers;

	/**
	 *Checks if the given partial solution is complete
	 *@param partial Partial solution
	 *@return True if partial is a complete, valid solution
	 */
	public static boolean isFullSolution(int[] partial){

		return false;
	}

	/**
	 *Checks if partial solution can become a complete solution
	 *@param partial Partial solution
	 *@return True if partial solution can NOT be extended to a complete solution
	 */
	public static boolean reject(int[] partial){
		int i = 0;
		while(i<friends[0].length){
			if (partial[i+1] == 0){
				
				boolean goodCoupon = false;

				for(int testCoupon = 1; !goodCoupon; testCoupon++) 
				{
					goodCoupon = true;
					//Check all friends of i and their 
					for(int k = 0; k < numberOfUsers; k++) {
						if(friends[i][k] == 1) {
							if(partial[k] == testCoupon) {
								goodCoupon = false;
								k = numberOfUsers;
							}
						}
					}
				}
			}
		}
		

		return false;
	}

	/**
	 **Takes in a partial solution and includes an additional step.
	 **@param partial Partial solution
	 *	*@return A partial solution with additional step, or null if no step can be added
	 * */
	public static int[] extend(int[] partial){
		int[] temp = new int[friends[0].length];
		for (int i=0; i<friends[0].length-1; i++){
			if (partial[i] == 0){
				temp[i] = 1;
				return temp;
			} else {
				temp[i] = partial[i] ;
				return temp;			
			}
		}
		return null;
	}

	/**
	 **The most recent step to be added has been changed to its next option
	 **@param partial Partial solution
	 **@return A partial solution with the most recent step to be added has been changed to its next option
	 **/
	public static int[] next(int[] partial){
		int i = 0;
		while(i<friends[0].length){
			if (partial[i+1] == 0){
				partial[i]= partial[i] + 1;
				i = friends[0].length;
			}
			i++;
		}
		return partial;
	}
	
	/**
	*Tests isFullSolution method using several partial solutions.
	*/
	public static void testIsFullSoltuion(){
	
	}
	
	/**
	*Tests reject method using several partial solutions
	*/
	public static void testReject(){
	
	}
	
	/**
	*Tests extend method using several partial solutions
	*/
	public static void testExtend(){
	
	}
	
	/**
	*Tests next method using several partial solutions
	*/
	public static void testNext(){
	
	}
	
	/**
	*Assigns coupons to users such that each user gets one coupon
	*and friends can't receive the same coupon.
	*@param partial The partial solution
	*/
	public static void solve(int[] partial){
	
	}
	
	/**
	*Main method
	*/
	public static void main(String[] args){
       	
		if(args.length == 2) {
			
			File inFile = new File(args[0]);
			Scanner in = new Scanner(System.in);
			try {
				in = new Scanner(inFile);
			} catch (FileNotFoundException exception) {
				System.out.println("File not found");
			}
			
			friends = new int[1000][1000];	
			int i;	
			for(i = 0; in.hasNextLine(); i++) {
				String line = in.nextLine();
				Scanner lineScanner = new Scanner(line);
				for(int j = 0; lineScanner.hasNextInt(); j++) {
					friends[i][j] = lineScanner.nextInt(); 
				}
			}
			
			numberOfUsers = i;
		}
		else {
			System.out.println("Error missing args");
		}
	}
	
}
