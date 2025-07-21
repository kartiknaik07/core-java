class Multiplication{
	public static void main(String[] args){
		multiplication();
	    multiplication1();
		multiplication2();
	    multiplication3();
		multiplication4();
		multiplication5();
	}
public static void multiplication(){
    int a=10;
    int b=20;
    int c = a+b;
    System.out.println(c);
    }
	public static void multiplication1(){
		float d = 2.5f;
		float e = 2.5f;
		float f = d * e;
		System.out.println(f);
	}
	public static void multiplication2(){
		double g = 10.562;
		double h = 5.568;
		double i = g * h;
		System.out.println(i);
	}
	public static void multiplication3(){
		long j = 80000;
		long k = 40000;
		long l = j * k;
		System.out.println(l);
	}
	public static void multiplication4(){
		short m = 325;
		short n = 2;
		short o = (short)(m * n);
		System.out.println(o);
	}
	public static void multiplication5(){
		byte p = 12;
		byte q = 3;
		byte r = (byte)(p * q);
		System.out.println(r);
	}
}