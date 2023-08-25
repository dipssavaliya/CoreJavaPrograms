package CoreJava;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromnum(1234321));
	}

	private static boolean palindromnum(int i) {
		// TODO Auto-generated method stub
		String s = Integer.toString(i);
		int[] num = new int[s.length()];
		for(int a=0;a<s.length();a++)
		{
			num[a]=s.charAt(a);
		}
		int k = num.length - 1;
		boolean flag = true;
		for (int j = 0; j <= (num.length) / 2; j++) {
			if (num[j] == num[k]) {
				k--;

			} else {
				System.out.println("not a palindrom number");
				flag = false;
				break;
			}
		}
		return flag;
	}

}
