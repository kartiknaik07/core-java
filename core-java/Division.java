class Division{
	public static void main(String[] args){
		division();
	    division1();
		division2();
	    division3();
		division4();
		division5();
	}
public static void division(){
    int a=10;
    int b=20;
    int c = a/b;
    System.out.println(c);
    }
	public static void division1(){
		float d = 2.5f;
		float e = 2.5f;
		float f = d / e;
		System.out.println(f);
	}
	public static void division2(){
		double g = 8.562;
		double h = 4.568;
		double i = g / h;
		System.out.println(i);
	}
	public static void division3(){
		long j = 80000;
		long k = 40000;
		long l = j / k;
		System.out.println(l);
	}
	public static void division4(){
		short m = 325;
		short n = 5;
		short o = (short)(m / n);
		System.out.println(o);
	}
	public static void division5(){
		byte p = 120;
		byte q = 5;
		byte r = (byte)(p /  q);
		System.out.println(r);
	}
}