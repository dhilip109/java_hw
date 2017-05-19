package arrayofobjects;

public class ArrOfObj {
int id; 
String name;
	public static void main(String[] args) {
		ArrOfObj ob[] = new ArrOfObj[3];
		ob[0] = new ArrOfObj();
		ob[1] = new ArrOfObj();
		ob[2] = new ArrOfObj();
		ob[0].id=1;
		ob[1].id=2;
		ob[2].id=3;
		ob[0].name="SATHEES";
		ob[1].name="DHILIP";
		ob[2].name="PRAVEEN";
		for(ArrOfObj o : ob)
		System.out.println("ID is :"+o.id+" Name is :"+o.name);
		/*for(int i =0; i<ob.length;i++)
			System.out.println("ID is :  "+ob[i].id+"  Name is :  "+ob[i].name);*/
	}

}
