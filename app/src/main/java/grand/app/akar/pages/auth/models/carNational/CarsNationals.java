package grand.app.akar.pages.auth.models.carNational;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CarsNationals {

	@SerializedName("national_types")
	private List<NationalTypesItem> nationalTypes;

	@SerializedName("car_types")
	private List<CarTypesItem> carTypes;

	public List<NationalTypesItem> getNationalTypes(){
		return nationalTypes;
	}

	public List<CarTypesItem> getCarTypes(){
		return carTypes;
	}
}