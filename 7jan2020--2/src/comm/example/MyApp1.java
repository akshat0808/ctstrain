package comm.example;

public class MyApp1 {

	public static void main(String[] args) {
		
		// MyCard card1=new MyCard(SUIT.CLUBS);
		// System.out.println("Card Name: "+card1.getSuit().getName()+" Card Rank: "
		// +card1.getSuit().getRank());
		 
		
		//Car car=new Sedan("2019", "Blue", 2000000, true);
		//System.out.println(car);
		Transport t=new Truck();
		t.calculateDistance(2000, 2500);
		t.calculateEfficiency(500, 400);
		Transport w= new HoverCraft();
		w.calculateDistance(400, 450);
		w.calculateEfficiency(300, 100);

	}

}