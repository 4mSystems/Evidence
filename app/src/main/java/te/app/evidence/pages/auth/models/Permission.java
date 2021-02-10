package te.app.evidence.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class Permission{

	@SerializedName("monthly_report")
	private String monthlyReport;

	@SerializedName("clients")
	private String clients;

	@SerializedName("search_case")
	private String searchCase;

	@SerializedName("addcases")
	private String addcases;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("mohdreen")
	private String mohdreen;

	@SerializedName("created_at")
	private Object createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("category")
	private String category;

	@SerializedName("users")
	private String users;

	@SerializedName("daily_report")
	private String dailyReport;

	public String getMonthlyReport(){
		return monthlyReport;
	}

	public String getClients(){
		return clients;
	}

	public String getSearchCase(){
		return searchCase;
	}

	public String getAddcases(){
		return addcases;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getUserId(){
		return userId;
	}

	public String getMohdreen(){
		return mohdreen;
	}

	public Object getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getCategory(){
		return category;
	}

	public String getUsers(){
		return users;
	}

	public String getDailyReport(){
		return dailyReport;
	}
}