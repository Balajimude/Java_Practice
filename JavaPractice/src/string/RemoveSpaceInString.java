package string;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  balaji  ";
		String s1="  b al aji  ";
		s=s.trim();
		System.out.println(s);
		s1=s1.strip();
		System.out.println(s1);

	}

}

