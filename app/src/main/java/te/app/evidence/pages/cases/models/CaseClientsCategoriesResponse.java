package te.app.evidence.pages.cases.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class CaseClientsCategoriesResponse extends StatusMessage {
	@SerializedName("data")
	private CaseClientsCategoriesData data;

	public CaseClientsCategoriesData getData(){
		return data;
	}

}