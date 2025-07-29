class ElementSearch{
	public static void main(String[] args){
		int num = 22;
		int[] a = new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = i + 20;
			System.out.println(a[i]);
		}
		for(int i=0; i<a.length; i++){
			if(a[i] == num){
				System.out.println("Element " + num + " found at index:" + i);
			}
		}
		float num1 = 18.0f;
		float[] b = new float[10];
		for(int i = 0; i<b.length; i++){
			b[i] = i +10.0f;
			System.out.println(b[i]);
		}
		for(int i = 0; i<b.length; i++){
			if(b[i] == num1){
				System.out.println("Element " +num1+ " found at index:" +i);
			}
		}
		double num2 = 25.2;
		double[] c = new double[6];
		for(int i = 0; i<c.length; i++){
			c[i] = i + 20.2;
			System.out.println(c[i]);
		}
		for(int i = 0; i<c.length; i++){
			if(c[i] == num2){
				System.out.println("Element " +num2+ " found at index:" +i);
			}
		}
		byte num3 = 2;
		byte[] d = new byte[5];
		for(int i=0;i<d.length;i++){
			d[i] = (byte)(i + 1);
			System.out.println(d[i]);
		}
		for(int i=0; i<d.length; i++){
			if(d[i] == num3){
				System.out.println("Element " + num3 + " found at index:" + i);
			}
		}
		short num4 = 12;
		int[] e = new int[5];
		for(int i=0;i<e.length;i++){
			e[i] = i + 10;
			System.out.println(e[i]);
		}
		for(int i=0; i<e.length; i++){
			if(e[i] == num4){
				System.out.println("Element " + num4 + " found at index:" + i);
			}
		}
		long num5 = 8000L;
		int[] f = new int[5];
		for(int i=0;i<f.length;i++){
			f[i] = (int)(i * 2000L);
			System.out.println(f[i]);
		}
		for(int i=0; i<f.length; i++){
			if(f[i] == num5){
				System.out.println("Element " + num5 + " found at index:" + i);
			}
		}
		char letter = 'C';
		char[] g = {'A','B','C','D'};
		for(int i=0;i<g.length;i++){
			System.out.println(g[i]);
		}
		for(int i=0; i<g.length; i++){
			if(g[i] == letter){
				System.out.println("Element " + letter + " found at index:" + i);
			}
		}
		boolean isTrue = true;
		boolean[] h = {true,false};
		for(int i=0;i<h.length;i++){
			System.out.println(h[i]);
		}
		for(int i=0; i<h.length; i++){
			if(h[i] == isTrue){
				System.out.println("Element " + isTrue + " found at index:" + i);
			}
		}
	}
}