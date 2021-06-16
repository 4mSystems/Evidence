package te.app.evidence.pages.cases.models.caseDetails;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.cases.models.cases.Cases;

public class CaseDetails {

	@SerializedName("case_data")
	private Cases caseData;

	@SerializedName("numbers")
	private CaseStatistics numbers;

	public Cases getCaseData(){
		return caseData;
	}

	public void setCaseData(Cases caseData) {
		this.caseData = caseData;
	}

	public CaseStatistics getNumbers(){
		return numbers;
	}
}