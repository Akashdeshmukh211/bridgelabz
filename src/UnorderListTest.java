
import java.util.*;
public class UnorderListTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
				UnorderedList<String> list = new UnorderedList<>();
				System.out.println("hello");
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter the string to search in a file");
				String str = input.nextLine();
				if(list.search(str)){
					System.out.println("found at index"+list.index(str));
					list.remove(str);
				}else{
					System.out.println("Not found");
					list.add(str);
				}
				
				list.show();
				list.removeAtLast();
				list.show();
				
			

	}

}
