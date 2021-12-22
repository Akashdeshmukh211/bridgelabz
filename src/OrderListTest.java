
public class OrderListTest {

	public static void main(String[] args) {
		OrderList<Integer> list = new OrderList<>();
		list.insert(25);
		list.insert(30);
		list.insert(45);
		
		list.show();
		
		System.out.println("index of item ==>> "+list.index(30));
		System.out.println("Empty Checking  " +list.isEmpty());
	
		

	}

}
