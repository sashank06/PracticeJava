package samples;

public class compareInterface {
public static void main(String[] args) {
	Fruit f = new Fruit("hello",5);
	Fruit l = new Fruit("waste",5);
	System.out.println(f.compareTo(l));
}
}
