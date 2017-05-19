package string.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Module_04 {
public static void main(String[] args) {
		String s1="Nothing is impossible is Nothing is Not  apple Apple dog bat BAat Bat  2333 &233";
//System.out.println(s1.indexOf('t'));
//System.out.println(s1.indexOf('t',10));
		Map <String, Integer> m= new TreeMap<String ,Integer>();
		String s3 =s1.trim().replaceAll(" +"," ");
String s2[] = s3.split(" ");
for(int i=0;i<s2.length;i++)
{
//System.out.println(s2[i]+"==length -->"+s2[i].length());	
}

for(int i=0;i<s2.length;i++){

//System.out.println(m.containsKey(s2[i]));
         if(m.containsKey(s2[i]))
         {
        	 int k=m.get(s2[i]);
        	 m.put(s2[i],k+1);
         }
         /*else if(!m.containsKey(s2[i].equals(null)))
         {
         m.put(s2[i],1);  
         }*/
         else{ m.put(s2[i],1);  }
}

Set<String> keys = m.keySet();
for(String s : keys){
	
System.out.println("key=="+s +"  &&  value=="+m.get(s));
}
Set<Map.Entry<String,Integer>> setmap = m.entrySet();
for(Map.Entry<String,Integer> mpe : setmap ){
	System.out.println(mpe.getKey()+"==>"+mpe.getValue());
	
}
}

}
