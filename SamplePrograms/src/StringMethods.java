
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Raja";
		String s="Esakki";
		int num=10;

		System.out.println(name.charAt(2));
		System.out.println(name.concat("Ramya"));
		System.out.println(name.compareTo(s));
		System.out.println(name.equals(s));
		System.out.println(name.hashCode());
		System.out.println(name.indexOf("a"));
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.length());
		System.out.println(name.substring(3));
		System.out.println(s.substring(0, 6));
		System.out.println(s.replace("Esakki", "Ramya"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(String.valueOf(num));
		System.out.println(String.join("/", "13","08","1992"));
		System.out.println(String.join("_","Learn","Automation","Online" ));
		System.out.println(s.trim());

		String r="i,am,super,man";
		String[] split=	r.split(",");
		for (String string : split) {
			System.out.println(string);
			
		}
		
		String n="Ramya";
		String a="";
		for (int i = split.length; i >=0; i--) {
			
		char c=n.charAt(i);
		a= a+c;
		System.out.println(a);
			
			
		}
	}

}
