package test_generics.gen1;

public class Main {
	public static void main(String a[]) {
		// параметризируем класс типом String
		Box<String> sample1 = new Box<>("Нетология");
		System.out.println(sample1);
		// параметризируем класс типом Integer
		Box<Integer> sample2 = new Box<>(1);
		// Здесь необходимо прописать Integer, потому-что численное значение.
		System.out.println(sample2);
		// параметризируем класс типом Boolean
		Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
		System.out.println(sample3);
	}
}
	
	// Box{obj=Нетология; objType=java.lang.String}
	// Box{obj=1; objType=java.lang.Integer}
	// Box{obj=true; objType=java.lang.Boolean}