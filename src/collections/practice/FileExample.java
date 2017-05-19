package collections.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FileExample {

	public static void main(String[] args) throws Exception {
		/*File f = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeUTF("hai iam dhilip is is and and dont");	
FileInputStream fis = new FileInputStream(f);
DataInputStream dis= new DataInputStream(fis);
//dis.readUTF();*/
String s="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
System.out.println("Actual String is :"+s);
Map<String,Integer> mp= new HashMap<String,Integer>();
String s1[]=s.split(" ");

for(int i=0;i<s1.length; i++)
{
	if(mp.containsKey(s1[i])){
		int k=mp.get(s1[i]);
		mp.put(s1[i], ++k);}
	else
		mp.put(s1[i], 1);	
}
	Set<String> st =mp.keySet();
for(String s3: st)
	System.out.println("key : "+s3+"   value : "+mp.get(s3));
}
	}

