package string.practice;

public class Module_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Dhilip";
		byte b[]=s1.getBytes();
		System.out.println(b[0]);
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}

}
}