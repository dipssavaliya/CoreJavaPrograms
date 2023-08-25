package ArraysStrings;

public class lastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("java helloui"));
	}

	public static int lengthOfLastWord(String s) {
		String[] s1 = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			s1 = s.split(" ");

		}
		/*for (String s2 : s1) {
			System.out.println(s2);
		}*/
		int find=s1.length-1;
	
		return 	s1[find].length(); 
	}
}