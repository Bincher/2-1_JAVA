
public class GenericMethodTest {
	public static <E> void printArray(E[] obj)
	{
		for ( E element : obj ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
	}
	
	public static void main( String args[] ) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 5.1, 1.3, 3.7 };
		Character[] charArray = { 'j', 'a', 'v', 'a' };
		System.out.print( "정수 배열: " );
		GenericMethodTest.<Integer>printArray( intArray );
		printArray(intArray);
		System.out.print( "실수 배열: " );
		GenericMethodTest.<Double>printArray( doubleArray );
		printArray(doubleArray);
		System.out.print( "문자 배열: " );
		GenericMethodTest.<Character>printArray( charArray );
		printArray(charArray);
		}

}
