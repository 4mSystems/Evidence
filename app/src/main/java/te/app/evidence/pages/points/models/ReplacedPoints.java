package te.app.evidence.pages.points.models;

import com.google.gson.annotations.SerializedName;

public class ReplacedPoints {

	@SerializedName("points_num")
	private String pointsNum;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	public String getPointsNum(){
		return pointsNum;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getType(){
		return type;
	}
}