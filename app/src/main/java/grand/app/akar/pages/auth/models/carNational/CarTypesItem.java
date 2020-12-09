package grand.app.akar.pages.auth.models.carNational;

import com.google.gson.annotations.SerializedName;

public class CarTypesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}