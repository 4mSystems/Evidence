package grand.app.akar.pages.splash.models;

import com.google.gson.annotations.SerializedName;

public class ReasonsItem{

	@SerializedName("id")
	private int id;

	@SerializedName("text")
	private String text;

	public int getId(){
		return id;
	}

	public String getText(){
		return text;
	}
}