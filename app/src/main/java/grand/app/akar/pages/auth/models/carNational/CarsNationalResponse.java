package grand.app.akar.pages.auth.models.carNational;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class CarsNationalResponse extends StatusMessage {

	@SerializedName("data")
	private CarsNationals data;

	public CarsNationals getData(){
		return data;
	}

}