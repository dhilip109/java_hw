package string.practice;

public class DecimalToBinary {

	public static void main(String[] args) {
		//System.out.println(Integer.toBinaryString(10));
		int l =10;
		int k[] = new int [10];
		int j[] = new int[10];
		k[0] = l/2;
		for(int i=1; i<10; i++)
		{
			j[i] = k[i]%2;
			k[i] = k[i]/2;			
			
			
		}
		System.out.println(k[1]);
	}

}
