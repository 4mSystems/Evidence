package te.app.evidence.pages.publicFiles.models;

import com.google.gson.annotations.SerializedName;

public class PublicFilesData {

	@SerializedName("file")
	private String file;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	public String getFile(){
		return file;
	}

	public String getUpdatedAt(){
		return updatedAt;
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

	public String getType(){
		return type;
	}
}