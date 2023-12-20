package PowerRouterAssignment;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			s1 += ch;
		}
		System.out.println("Input: "+s);
		System.out.println("Output: "+s1);
	}
}
