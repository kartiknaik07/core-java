class Addition{
	public static void main(String[] args){
		int s = addition();
		System.out.println(s);
	    float t = addition1();
		System.out.println(t);
		double u = addition2();
		System.out.println(u);
	    long v = addition3();
		System.out.println(v);
		short w = addition4();
		System.out.println(w);
		byte x = addition5();
		System.out.println(x);
	}
public static int addition(){
    int a=10;
    int b=20;
    int c = a+b;
    return c;
    }
	public static float addition1(){
		float d = 2.5f;
		float e = 2.5f;
		float f = d + e;
		return f;
	}
	public static double addition2(){
		double g = 8.562;
		double h = 9.568;
		double i = g + h;
		return i;
	}
	public static long addition3(){ 
		long j = 80000;
		long k = 90000;
		long l = j + k;
		return l;
	}
	public static short addition4(){
		short m = 325;
		short n = 256;
		short o = (short)(m + n);
		return o;
	}
	public static byte addition5(){
		byte p = 120;
		byte q = 5;
		byte r = (byte)(p + q);
		return r;
	}
}