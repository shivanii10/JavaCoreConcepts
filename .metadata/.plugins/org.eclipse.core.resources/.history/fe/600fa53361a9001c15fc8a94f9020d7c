package fisglobal;

interface Shop {       // interface
	
	public void order(); // abstract method
	void delivery(); // abstract method .. by default public abstract
}

class Garments implements Shop{
	
	public void order() {
		System.out.println("Place order for Garments.");
	}

	public void delivery() {
		System.out.println("Items will be delivered in a day.");
	}
	
}


class Fruit implements Shop{
	
	public void order() {
		System.out.println("Place order for Fruits required.");
	}

	public void delivery() {
		System.out.println("Items will be delivered in a 4-5 day.");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit();
		f.order();
		f.delivery();
		
		Garments g =new Garments();
		g.order();
		g.delivery();
	}

}

