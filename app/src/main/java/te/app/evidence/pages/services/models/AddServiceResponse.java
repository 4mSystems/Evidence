package te.app.evidence.pages.services.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddServiceResponse extends StatusMessage {

	@SerializedName("data")
	private ServiceData serviceData;

	public ServiceData getServiceData(){
		return serviceData;
	}

}