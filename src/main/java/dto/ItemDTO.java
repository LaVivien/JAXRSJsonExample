package dto;

import java.time.LocalDateTime;
import java.util.*;
import dao.ItemDAO;
import endpoints.Item;

public class ItemDTO extends Response<Item> {
//	LocalDateTime date;
//	List<String> params=new ArrayList<>();
//	String code;
//	List<Item> response;
	
	public ItemDTO(String name, double price) {
		
		super.date= String.valueOf(LocalDateTime.now());	
		super.params = new ArrayList<>();
        super.params.add(name);
        super.params.add(String.valueOf(price));
        super.code = "OK";
        super.response = new ArrayList<Item>(ItemDAO.getInstance().getAll());
        
	}

}
