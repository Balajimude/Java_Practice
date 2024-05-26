package string;

public class RemoveJunks 
{

	public static void main(String[] args) 
	{
		String s="$#@%^%%^ selenium 4541";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s="selenium    Balaji   Mude";
		s=s.replaceAll(" ", "");
		System.out.println(s);
	}

}


