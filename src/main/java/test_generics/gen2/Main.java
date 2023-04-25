package test_generics.gen2;

public class Main {
	
	public static void main(String[] args) {
		// параметризируем класс типом String для ключа и значения
		Box<String, String> sample1 = new Box<>("имя", "Нетология");
		System.out.println(sample1);
		// параметризируем класс типом Integer для ключа и Boolean для значения
		Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
		System.out.println(sample2);
	}
	
}

// Box{key=имя; keyType=java.lang.String, obj=Нетология; objType=java.lang.String}
// Box{key=1; keyType=java.lang.Integer, obj=true; objType=java.lang.Boolean}
