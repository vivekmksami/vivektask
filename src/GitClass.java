import java.util.HashMap;
import java.util.Map;

public class GitClass {
	
	
		public static void main(String[] args) {
			
			System.out.println("Vivek");
			System.out.println("Greens");
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			map.put("csk",280);
			map.put("kfc",220);
			map.put("hdfc",230);
			map.put("kgf",250);
			map.put("sbi",235);
			
			System.out.println(map);
			
			int size = map.size();
			System.out.println(size);

}
}
