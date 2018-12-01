/*
 * Library class lab
 * 
 * Author: Tamara Metz
 * Date: 12-1-18
 * 
 * The purpose is this lab is to:
 * Write a class called Library that assigns user IDs.
 * Use a static class variable to keep track of the next user ID that should be assigned,
 * and assign a unique user ID to each new object using that information.
 * 
 */

package library;

public class Library {
	
	private int userId;
	private static int nextUserId = 0;
	
	public Library() {
		userId = nextUserId;
		nextUserId ++;
	}
	public int getUserId() {
		return userId;
	}
	public static void main(String[] args) {
		Library o1 = new Library();
		Library o2 = new Library();
		System.out.println("User ID for o1: " + o1.getUserId());
		System.out.println("User ID for o2: " + o2.getUserId());
	}

}
