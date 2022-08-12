package vector_sort;
import java.util.Vector;
import java.util.Random;
import java.util.TreeSet;

public class vertor_sort {
	public static void main(String[] args) {
		// 방법 1
		Vector <Integer> v = new Vector <Integer>(10);
		Random r = new Random();
		
		System.out.print("정렬 전: [");
		for (int i = 0; i < 10; i++)
		{
			v.addElement(r.nextInt(-50,51));
			System.out.print(v.get(i) + " ");
		}
		System.out.println("]");
		v.sort(null);
		System.out.print("정렬 후: [");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(v.get(i) + " ");
		}
		System.out.println("]");
	}
	/*
	PriorityQue
	TreeSet<Integer> q = new TreeSet<Integer>();
	for (int n = 0; n < v.size(); n++) {q.add(v.ger(n))};
	*/
}
