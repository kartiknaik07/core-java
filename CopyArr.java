class CopyArr{
	public static void main(String[] args){
		int[] a = new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = i + (i * 20/2+i );
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int[] copyArray = new int[a.length];
		for(int i=0;i<a.length;i++){
			copyArray[i] = a[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray.length;i++){
			System.out.println(copyArray[i]);
		}
		float[] b = new float[5];
		for(int i=0;i<b.length;i++){
			b[i] = i + (i * 19f/2f+i );
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		float[] copyArray1 = new float[b.length];
		for(int i=0;i<b.length;i++){
			copyArray1[i] = b[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray.length;i++){
			System.out.println(copyArray1[i]);
		}
		long[] c = new long[5];
		for(int i=0;i<c.length;i++){
			c[i] = i + (i * 170000L);
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		long[] copyArray2 = new long[c.length];
		for(int i=0;i<c.length;i++){
			copyArray2[i] = c[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray2.length;i++){
			System.out.println(copyArray2[i]);
		}
		double[] d = new double[5];
		for(int i=0;i<d.length;i++){
			d[i] = i + (i * 19d/2d+i );
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		}
		double[] copyArray3 = new double[d.length];
		for(int i=0;i<d.length;i++){
			copyArray3[i] = d[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray3.length;i++){
			System.out.println(copyArray3[i]);
		}
		byte[] e = new byte[5];
		for(int i=0;i<e.length;i++){
			e[i] = (byte)(i + 1);
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<e.length;i++){
			System.out.println(e[i]);
		}
		byte[] copyArray4 = new byte[e.length];
		for(int i=0;i<e.length;i++){
			copyArray4[i] = e[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray4.length;i++){
			System.out.println(copyArray4[i]);
		}
		short[] f = new short[5];
		for(int i=0;i<f.length;i++){
			f[i] = (short)(i + 10);
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		short[] copyArray5 = new short[f.length];
		for(int i=0;i<f.length;i++){
			copyArray5[i] = f[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray5.length;i++){
			System.out.println(copyArray5[i]);
		}
		char[] letter = {'A','B','C','D'};
		for(int i=0;i<letter.length;i++){
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<letter.length;i++){
			System.out.println(letter[i]);
		}
		char[] copyArray6 = new char[letter.length];
		for(int i=0;i<letter.length;i++){
			copyArray6[i] = letter[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray6.length;i++){
			System.out.println(copyArray6[i]);
		}
		boolean[] isTrue = {true,false};
		for(int i=0;i<isTrue.length;i++){
		}
		System.out.println("Before copying to another array");
		for(int i=0;i<isTrue.length;i++){
			System.out.println(isTrue[i]);
		}
		boolean[] copyArray7 = new boolean[isTrue.length];
		for(int i=0;i<isTrue.length;i++){
			copyArray7[i] = isTrue[i];
		}
		System.out.println("After Copying to anothre array");
		for(int i=0;i<copyArray7.length;i++){
			System.out.println(copyArray7[i]);
		}
	}
}