class Substraction{
	public static void main(String[] args){
		substraction();
	    substraction1();
		substraction2();
	    substraction3();
		substraction4();
		substraction5();
	}
public static void substraction(){
    int a=10;
    int b=20;
    int c = a-  b;
    System.out.println(c);
    }
	public static void substraction1(){   
		float d = 2.5f;
		float e = 2.5f;
		float f = d - e;
		System.out.println(f);
	}
	public static void substraction2(){
		double g = 8.562;
		double h = 9.568;
		double i = g - h;
		System.out.println(i);
	}
	public static void substraction3(){
		long j = 80000;
		long k = 90000;
		long l = j - k;
		System.out.println(l);
	}
	public static void substraction4(){
		short m = 325;
		short n = 256;
		short o = (short)(m - n);
		System.out.println(o);
	}
	public static void substraction5(){
		byte p = 120;
		byte q = 5;
		byte r = (byte)(p - q);
		System.out.println(r);
	}
}