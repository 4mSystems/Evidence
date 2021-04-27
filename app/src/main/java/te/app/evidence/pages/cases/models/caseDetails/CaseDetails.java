package te.app.evidence.pages.cases.models.caseDetails;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.pages.clients.models.Clients;

public class CaseDetails {

	@SerializedName("case_data")
	private Cases caseData;

	@SerializedName("clients")
	private List<Clients> clients;

	@SerializedName("khesm")
	private List<Clients> khesm;

	@SerializedName("numbers")
	private CaseStatistics numbers;

	public Cases getCaseData(){
		return caseData;
	}

	public List<Clients> getClients(){
		return clients;
	}

	public List<Clients> getKhesm(){
		return khesm;
	}

	public CaseStatistics getNumbers(){
		return numbers;
	}
}