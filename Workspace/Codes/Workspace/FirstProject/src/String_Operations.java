
public class String_Operations {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";

		System.out.println(s.charAt(12));
		System.out.println();

		System.out.println(s.contains("is"));
		System.out.println();

		s = s.concat(" and killed it");
		System.out.println(s);
		System.out.println();

		System.out.println(s.endsWith("dogs"));
		System.out.println();

		String compare1 = "The quick brown Fox jumps over the lazy Dog";
		System.out.println(s.equals(compare1));
		System.out.println();

		String compare2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println(s.equals(compare2));
		System.out.println();

		System.out.println(s.length());
		System.out.println();

		String compare3 = "The quick brown Fox jumps over the lazy Dog";
		System.out.println(s.matches("compare3"));
		System.out.println();

		s = s.replaceAll("The", "A");
		System.out.println(s);
		System.out.println();

		System.out.println("After spliting");
		System.out.println(s.substring(0, 18));
		System.out.println(s.substring(18, (s.length())));
		System.out.println();

		for (String a : s.split(" ")) {
			if (a.equalsIgnoreCase("fox") || a.equalsIgnoreCase("dog")) {
				System.out.println(a);
			}
		}
		System.out.println();

		System.out.println(s.toLowerCase());
		System.out.println();

		System.out.println(s.toUpperCase());
		System.out.println();

		System.out.println(s.indexOf('a'));
		System.out.println();

		System.out.println(s);
		System.out.println(s.lastIndexOf('e'));
	}

}
