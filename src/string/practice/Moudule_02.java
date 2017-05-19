package string.practice;

public class Moudule_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String org="this is demo to replace the character using index";
String replace="is";
String sub="was";
String result="";
int i;

i=org.indexOf(replace);	
result=org.substring(0,i);
System.out.println(result);
result=result+sub;
System.out.println(result);
result=result+" "+org.substring(i+sub.length());
org=result;
System.out.println(org);


	}

}
