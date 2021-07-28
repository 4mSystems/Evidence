package te.app.evidence.pages.attachments.models;

import com.google.gson.annotations.SerializedName;

public class Attachment {

	@SerializedName("img_Description")
	private String imgDescription;

	@SerializedName("img_Url")
	private String imgUrl;

	@SerializedName("id")
	private int id;

	public String getImgDescription(){
		return imgDescription;
	}

	public String getImgUrl(){
		return imgUrl;
	}

	public int getId(){
		return id;
	}
}