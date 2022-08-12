package generic_avg;
import java.util.*;

public class generic_avg {
	public static void Print(Vector<? extends Number> Array)
	{
		
		for ( Object num : Array ){        
			System.out.printf( "%s ", num );
         }
	     System.out.println();
	}
	public static double Sum(Vector<? extends Number> Array)
	{
		double result = 0.0;
		for (Number n : Array)
		{
			result += n.doubleValue();		
		}
		return result;
	}
	public static <T> double Avg(Vector<? extends Number> Array)
	{
		double result = 0.0;
		for (Number n : Array)
		{
			result += n.doubleValue();
		}
		return result / Array.size();
	}
	public static void main(String[] args) {
		Vector<Integer> vn = new Vector<Integer>();
		Vector<Double> vd = new Vector<Double>();
		
		Random r = new Random();
		for (int i = 0 ; i < 10; i++)
		{
			vn.addElement(r.nextInt(1,101));
		}
		for (int i = 0 ; i < 5; i++)
		{
			vd.addElement(r.nextDouble(0.0,5.0));
		}
		
		System.out.println("elements in Integer Vector...");
		Print(vn);
		System.out.print("정수 합:" + (int)Sum(vn));
		System.out.print("\n정수 평균:" + Avg(vn));
		
		System.out.println("\n\nelements in Double Vector...");
		Print(vd);
		System.out.print("실수 합:" + Sum(vd));
		System.out.print("\n실수 평균:" + Avg(vd));

	}

}
