package te.app.evidence.pages.categories.models;

import com.google.gson.annotations.SerializedName;

public class CategoriesData {

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("parent_id")
	private String parentId;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}
}