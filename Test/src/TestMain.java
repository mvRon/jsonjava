import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner scanner = new Scanner(System.in);
		JSONArray arrObj = new JSONArray();
		
		JSONObject obj1 = new JSONObject();
		System.out.print("Nhap id sach: ");
		String bId1 = scanner.next();
		obj1.put("book_id", bId1);
		System.out.print("Nhap gia sach: ");
		int cost1 = scanner.nextInt();
		obj1.put("cost", cost1);
		
		
		JSONObject obj2 = new JSONObject();
		System.out.print("Nhap id sach: ");
		String bId2 = scanner.next();
		obj2.put("book_id", bId2);
		System.out.print("Nhap gia sach: ");
		int cost2 = scanner.nextInt();
		obj2.put("cost", cost2);
		
		JSONObject obj3 = new JSONObject();
		System.out.print("Nhap id sach: ");
		String bId3 = scanner.next();
		obj3.put("book_id", bId3);
		System.out.print("Nhap gia sach: ");
		int cost3 = scanner.nextInt();
		obj3.put("cost", cost3);
		
		arrObj.add(obj1);
		arrObj.add(obj2);
		arrObj.add(obj3);
		System.out.println(arrObj.toJSONString());
		
//		System.out.println(obj1.toJSONString());
		
		
		
		
	}
	
	
	
}
