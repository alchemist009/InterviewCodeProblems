import java.util.*;

class IsUnique {

	public static boolean ifUnique(String s) {
		for(int i =0 ; i < s.length(); i++) {
			char anchor = s.charAt(i);
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(j) == anchor)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scn.nextLine();
		if(ifUnique(s))
			System.out.println("A unique string.");
		else
			System.out.println("Not a unique string.");
	}
}


