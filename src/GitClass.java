import java.util.HashMap;
import java.util.Map;

public class GitClass {
//<<<<<<< HEAD
	private void maha() {
		System.out.println("shivaya");
		}
//=======
	private void kathik() {
		System.out.println("dhuruvan");	
	}
	
//>>>>>>> d15e2655f50d101ca2a037e8799884fcba2e9aa7
		public static void main(String[] args) {
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			System.out.println("Maha");
			System.out.println("Chennai");
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
