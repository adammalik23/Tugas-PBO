/* 13020200051, Adam Malik, Jum'at/23-02-2024, 22.40 */

/* Casting menggunakan tipe data Class */
public class Tugas7 {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		int a=8, b=9;
		float d=2, f,e=3.2f;	
		char g='5';
		double k=3.14;
		String n="67", m="45", l="100";

		a = Integer.parseInt(n); /*Konversi String ke Integer */
		k = Double.parseDouble(m); /*Konversi String ke Double */
		d = Float.parseFloat(l); /*Konversi String ke Float */
		System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);
		n = String.valueOf(b); /*Konversi Integer ke String */
		m = String.valueOf(g); /*Konversi karakter ke String */
		l = String.valueOf(e); /*Konversi Float ke String */
		System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
		k = Double.valueOf(a).intValue(); /*Konversi Integer ke Doule */
		double c = Integer.valueOf(b).doubleValue();

		System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);
	}
}