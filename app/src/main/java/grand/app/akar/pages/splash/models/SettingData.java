package grand.app.akar.pages.splash.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import grand.app.akar.pages.ads.models.CategoriesData;

public class SettingData {

	@SerializedName("reasons")
	private List<ReasonsItem> reasons;

	@SerializedName("categories")
	private List<CategoriesData> categories;

	@SerializedName("banners")
	private List<BannersItem> banners;

	public List<ReasonsItem> getReasons(){
		return reasons;
	}

	public List<CategoriesData> getCategories(){
		return categories;
	}

	public List<BannersItem> getBanners(){
		return banners;
	}
}