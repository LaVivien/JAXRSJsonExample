package services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import endpoints.*;
import dao.ItemDAO;
import dto.ItemDTO;
import com.google.gson.Gson;

@Path("/items")
public class ItemRestService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Item> getItems()
	{
		return ItemDAO.getInstance().getAll();
	}

	@GET
    @Path("{addItem}")
    @Produces(MediaType.APPLICATION_JSON)
	public String addItem(@QueryParam("name") String name, @QueryParam("price") double price)
	{
		ItemDAO.getInstance().putItem(new Item(name, price));
		ItemDTO response = new ItemDTO(name, price);
		Gson gson = new Gson();
		String json = gson.toJson(response);
		return json;
	}


}
