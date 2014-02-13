
public class TestEquals {

	public static void main(String[] args){
		TestObject o1 = new TestObject(1,2);
		TestObject o2 = new TestObject(1,2);
		TestObject2 o3 = new TestObject2(1,2,"abc");
		TestObject2 o4 = new TestObject2(1,2,"abc");
		System.out.println("1*****"+(o1==o2));
		System.out.println("2*****"+o1.equals(o2));
		System.out.println("3*****"+o3.equals(o4));
		System.out.println("4*****"+o1.equals(o3));
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("5*****"+(str1==str2));
		System.out.println("6*****"+(str1.equals(str2)));
		System.out.println("7*****"+(str1==str3));
		System.out.println("8*****"+(str1.equals(str3)));
		System.out.println("9*****"+(str4==str3));
		System.out.println("10*****"+(str4.equals(str3)));

		/*System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));
		System.out.println("*****"+(o1==o2));*/
	}
}
