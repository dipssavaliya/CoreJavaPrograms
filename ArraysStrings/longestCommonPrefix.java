package ArraysStrings;

public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));

	}

	public static String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			String currentString = strs[i];
			while (j < prefix.length()) {
				if(currentString.length()<=j||currentString.charAt(j)!=prefix.charAt(j))
				{
					prefix=prefix.substring(0,j);
					break;
				}
				j++;
			}

		}

		return prefix;

	}

}
