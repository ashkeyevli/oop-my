package lab2_4;

public class lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(23,5,6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart());
		Time t2=new Time(4,24,33);
		t.Add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart());
	}

}
