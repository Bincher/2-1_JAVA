package vector_num;

import java.util.Random;
import java.util.Vector;

public class vector_num {
	/*
	public static void print(Vector<Integer> v) {
		for (int n = 0; n < v.size(); n++)
		{
			int val = v.elementAt(n);
			System.out.print(val + " ");
		}
		System.out.println();
	}
	*/
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>(12);
		Random r = new Random();
		int sum = 0;
		System.out.println("before removing...");
		for (int i = 0 ; i < 12; i++)
		{
			v.addElement(r.nextInt(101));
			System.out.print(v.get(i) + " ");
		}
		System.out.println("\nafter removing...");
		v.remove(5);
		v.remove(2);
		for (int i = 0 ; i < 10; i++)
		{
			System.out.print(v.get(i) + " ");
		}
		System.out.println("\nafter removing...");
		v.set(0, r.nextInt(100));
		v.set(7, r.nextInt(100));
		for (int i = 0 ; i < 10; i++)
		{
			System.out.print(v.get(i) + " ");
			sum += v.get(i);
		}
		System.out.println("\nÇÕ: " + sum);
		System.out.println("Æò±º: " + (float)sum / v.size());
	}
}
