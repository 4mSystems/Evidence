package te.app.evidence.pages.clients.models.clientProfile;

import com.google.gson.annotations.SerializedName;

public class Cases {

	@SerializedName("inventation_type")
	private String inventationType;

	@SerializedName("first_session_date")
	private String firstSessionDate;

	@SerializedName("circle_num")
	private String circleNum;

	@SerializedName("id")
	private int id;

	@SerializedName("court")
	private String court;

	@SerializedName("invetation_num")
	private String invetationNum;

	public String getInventationType(){
		return inventationType;
	}

	public String getFirstSessionDate(){
		return firstSessionDate;
	}

	public String getCircleNum(){
		return circleNum;
	}

	public int getId(){
		return id;
	}

	public String getCourt(){
		return court;
	}

	public String getInvetationNum(){
		return invetationNum;
	}
}