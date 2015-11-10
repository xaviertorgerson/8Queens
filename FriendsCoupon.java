import java.util.Arrays;

public class FriendsCoupon{

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
	
		return false;
	}
	
	/**
	*Takes in a partial solution and includes an additional step.
	*@param partial Partial solution
	*@return A partial solution with additional step, or null if no step can be added
	*/
	public static int[] extend(int[] partial){
	
		return new int[10];
	}
	
	/**
	*The most recent step to be added has been changed to its next option
	*@param partial Partial solution
	*@return A partial solution with the most recent step to be added has been changed to its next option
	*/
	public static int[] next(int[] partial){
	
		return new int[10];
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
	        System.out.println(args[0]);
		}
		else {
			System.out.println("Error");
		}
	}
	
}
