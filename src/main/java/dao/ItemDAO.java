package dao;
import java.util.*;
import java.util.Map;
import endpoints.Item;

public class ItemDAO {
	//Map of names to Person instances.
		private Map<String, Item> itemMap = new HashMap<>();
		
		//this class is a singleton and should not be instantiated directly!
		private static ItemDAO instance = new ItemDAO();
		public static ItemDAO getInstance(){
			return instance;
		}

		//private constructor so people know to use the getInstance() function instead
		private ItemDAO(){
			itemMap.put("pencil", new Item("pencil", 0.55));
			itemMap.put("pen", new Item("pen", 1.2));
		}
		
		public List<Item> getAll(){
			return new ArrayList<Item> (itemMap.values());
		}

		public Item getItem(String name) {

			return itemMap.get(name);
		}

		public void putItem(Item item) {
			itemMap.put(item.getName(), item);
		}
}
