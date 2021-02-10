package te.app.evidence.pages.clients.models;

import com.google.gson.annotations.SerializedName;

public class Clients {

	@SerializedName("client_Address")
	private String clientAddress;

	@SerializedName("notes")
	private String notes;

	@SerializedName("parent_id")
	private String parentId;

	@SerializedName("cat_id")
	private String catId;

	@SerializedName("id")
	private int id;

	@SerializedName("client_Name")
	private String clientName;

	@SerializedName("type")
	private String type;

	@SerializedName("category")
	private Category category;

	@SerializedName("client_Unit")
	private String clientUnit;

	public String getClientAddress(){
		return clientAddress;
	}

	public String getNotes(){
		return notes;
	}

	public String getParentId(){
		return parentId;
	}

	public String getCatId(){
		return catId;
	}

	public int getId(){
		return id;
	}

	public String getClientName(){
		return clientName;
	}

	public String getType(){
		return type;
	}

	public Category getCategory(){
		return category;
	}

	public String getClientUnit(){
		return clientUnit;
	}
}