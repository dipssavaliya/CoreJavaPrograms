package ArraysStrings;

public class FirstOccurenceString {

	public static void main(String[] args) {
		System.out.println(strStr("aaa", "aaaa"));

	}

	public static int strStr(String haystack, String needle) {
		char[] needleArray = needle.toCharArray();
		char[] haystackArray = haystack.toCharArray();
		int i=0;
		String test="";
		int ans=-1;
		do { 
			if(needleArray[0]==haystackArray[i])
			{
				//System.out.println("haystackArray of i"+haystackArray[i]);
				//System.out.println("needleArray length "+needleArray.length);
				test=haystack.substring(i, i+needleArray.length);
				//System.out.println("test = "+test);
				ans=i;
				break;
			}
			else
			{
			i++;
			}
		}
		while(i < haystack.length());
		if(test.equals(needle))
		{
			return ans;
		}
		return -1;
	}
}