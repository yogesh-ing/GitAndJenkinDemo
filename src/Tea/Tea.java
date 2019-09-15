package Tea;

public class Tea {
	
	static int teaMake;
	Tea(){
		Milk milk = new Milk();
		Water water = new Water();
		TeaLeaf teaLeaf = new TeaLeaf();
		Sugar sugar = new Sugar();
		teaMake = milk.quantity+water.quantity+teaLeaf.quantity+sugar.quantity;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Tea made"+new Tea().teaMake);
	}

}
