package comm.example;

public class Tester {

	public static void main(String[] args) {
		Counter c = new Counter();
		Counter.InnerCounter iCounter = c.new InnerCounter();
		iCounter.add(10, 20);
		c.displayMAX();
	}

}
