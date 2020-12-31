package grand.app.akar;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.databinding.ActivityBaseBindingImpl;
import grand.app.akar.databinding.ActivityMainBindingImpl;
import grand.app.akar.databinding.DialogEditOptionBindingImpl;
import grand.app.akar.databinding.FragmentAboutBindingImpl;
import grand.app.akar.databinding.FragmentAdDetailsBindingImpl;
import grand.app.akar.databinding.FragmentAdRentDialogBindingImpl;
import grand.app.akar.databinding.FragmentAddFactoryFormBindingImpl;
import grand.app.akar.databinding.FragmentAddFlatFormBindingImpl;
import grand.app.akar.databinding.FragmentAddLandFormBindingImpl;
import grand.app.akar.databinding.FragmentAddOfficeFormBindingImpl;
import grand.app.akar.databinding.FragmentAddRestFormBindingImpl;
import grand.app.akar.databinding.FragmentAddStoreFormBindingImpl;
import grand.app.akar.databinding.FragmentAddVillaHouseFormBindingImpl;
import grand.app.akar.databinding.FragmentAddWarehouseFormBindingImpl;
import grand.app.akar.databinding.FragmentAdsAttachmentsBindingImpl;
import grand.app.akar.databinding.FragmentAdsInfoBindingImpl;
import grand.app.akar.databinding.FragmentAdvertisingFeeBindingImpl;
import grand.app.akar.databinding.FragmentAkarLocationCitiesBindingImpl;
import grand.app.akar.databinding.FragmentAkarLocationsMapBindingImpl;
import grand.app.akar.databinding.FragmentCategoriesBindingImpl;
import grand.app.akar.databinding.FragmentChangePasswordBindingImpl;
import grand.app.akar.databinding.FragmentChatBindingImpl;
import grand.app.akar.databinding.FragmentConfirmCodeBindingImpl;
import grand.app.akar.databinding.FragmentContactBindingImpl;
import grand.app.akar.databinding.FragmentContactFavoritesBindingImpl;
import grand.app.akar.databinding.FragmentConversationsBindingImpl;
import grand.app.akar.databinding.FragmentCurrentAdsBindingImpl;
import grand.app.akar.databinding.FragmentFavoritesBindingImpl;
import grand.app.akar.databinding.FragmentForgetPasswordBindingImpl;
import grand.app.akar.databinding.FragmentHomeBindingImpl;
import grand.app.akar.databinding.FragmentHomeCitiesBindingImpl;
import grand.app.akar.databinding.FragmentLoginBindingImpl;
import grand.app.akar.databinding.FragmentMyAccountBindingImpl;
import grand.app.akar.databinding.FragmentMyAdsMainBindingImpl;
import grand.app.akar.databinding.FragmentMyFavoritesMainBindingImpl;
import grand.app.akar.databinding.FragmentNotificationsBindingImpl;
import grand.app.akar.databinding.FragmentOnboardBindingImpl;
import grand.app.akar.databinding.FragmentPaymentBindingImpl;
import grand.app.akar.databinding.FragmentPreviousAdsBindingImpl;
import grand.app.akar.databinding.FragmentProfileBindingImpl;
import grand.app.akar.databinding.FragmentRegisterBindingImpl;
import grand.app.akar.databinding.FragmentSplashBindingImpl;
import grand.app.akar.databinding.FragmentTermsBindingImpl;
import grand.app.akar.databinding.FragmentUploadSuccessBindingImpl;
import grand.app.akar.databinding.HomeListLayoutBindingImpl;
import grand.app.akar.databinding.HomeMapLayoutBindingImpl;
import grand.app.akar.databinding.HomeSortBindingImpl;
import grand.app.akar.databinding.ItemAdDetailsServicesBindingImpl;
import grand.app.akar.databinding.ItemAdImagesBindingImpl;
import grand.app.akar.databinding.ItemAdsBindingImpl;
import grand.app.akar.databinding.ItemCategoryBindingImpl;
import grand.app.akar.databinding.ItemChatBindingImpl;
import grand.app.akar.databinding.ItemChatImagesBindingImpl;
import grand.app.akar.databinding.ItemCityBindingImpl;
import grand.app.akar.databinding.ItemConversationBindingImpl;
import grand.app.akar.databinding.ItemFavoritesBindingImpl;
import grand.app.akar.databinding.ItemHomeBindingImpl;
import grand.app.akar.databinding.ItemHomeCategoryBindingImpl;
import grand.app.akar.databinding.ItemMyAdsBindingImpl;
import grand.app.akar.databinding.ItemReasonsBindingImpl;
import grand.app.akar.databinding.LayoutActionBarBackBindingImpl;
import grand.app.akar.databinding.LayoutActionBarHomeBindingImpl;
import grand.app.akar.databinding.LayoutGrandBindingImpl;
import grand.app.akar.databinding.NotifyItemBindingImpl;
import grand.app.akar.databinding.ReportDialogBindingImpl;
import grand.app.akar.databinding.ReportWarningDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DIALOGEDITOPTION = 3;

  private static final int LAYOUT_FRAGMENTABOUT = 4;

  private static final int LAYOUT_FRAGMENTADDETAILS = 5;

  private static final int LAYOUT_FRAGMENTADRENTDIALOG = 6;

  private static final int LAYOUT_FRAGMENTADDFACTORYFORM = 7;

  private static final int LAYOUT_FRAGMENTADDFLATFORM = 8;

  private static final int LAYOUT_FRAGMENTADDLANDFORM = 9;

  private static final int LAYOUT_FRAGMENTADDOFFICEFORM = 10;

  private static final int LAYOUT_FRAGMENTADDRESTFORM = 11;

  private static final int LAYOUT_FRAGMENTADDSTOREFORM = 12;

  private static final int LAYOUT_FRAGMENTADDVILLAHOUSEFORM = 13;

  private static final int LAYOUT_FRAGMENTADDWAREHOUSEFORM = 14;

  private static final int LAYOUT_FRAGMENTADSATTACHMENTS = 15;

  private static final int LAYOUT_FRAGMENTADSINFO = 16;

  private static final int LAYOUT_FRAGMENTADVERTISINGFEE = 17;

  private static final int LAYOUT_FRAGMENTAKARLOCATIONCITIES = 18;

  private static final int LAYOUT_FRAGMENTAKARLOCATIONSMAP = 19;

  private static final int LAYOUT_FRAGMENTCATEGORIES = 20;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 21;

  private static final int LAYOUT_FRAGMENTCHAT = 22;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 23;

  private static final int LAYOUT_FRAGMENTCONTACT = 24;

  private static final int LAYOUT_FRAGMENTCONTACTFAVORITES = 25;

  private static final int LAYOUT_FRAGMENTCONVERSATIONS = 26;

  private static final int LAYOUT_FRAGMENTCURRENTADS = 27;

  private static final int LAYOUT_FRAGMENTFAVORITES = 28;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 29;

  private static final int LAYOUT_FRAGMENTHOME = 30;

  private static final int LAYOUT_FRAGMENTHOMECITIES = 31;

  private static final int LAYOUT_FRAGMENTLOGIN = 32;

  private static final int LAYOUT_FRAGMENTMYACCOUNT = 33;

  private static final int LAYOUT_FRAGMENTMYADSMAIN = 34;

  private static final int LAYOUT_FRAGMENTMYFAVORITESMAIN = 35;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 36;

  private static final int LAYOUT_FRAGMENTONBOARD = 37;

  private static final int LAYOUT_FRAGMENTPAYMENT = 38;

  private static final int LAYOUT_FRAGMENTPREVIOUSADS = 39;

  private static final int LAYOUT_FRAGMENTPROFILE = 40;

  private static final int LAYOUT_FRAGMENTREGISTER = 41;

  private static final int LAYOUT_FRAGMENTSPLASH = 42;

  private static final int LAYOUT_FRAGMENTTERMS = 43;

  private static final int LAYOUT_FRAGMENTUPLOADSUCCESS = 44;

  private static final int LAYOUT_HOMELISTLAYOUT = 45;

  private static final int LAYOUT_HOMEMAPLAYOUT = 46;

  private static final int LAYOUT_HOMESORT = 47;

  private static final int LAYOUT_ITEMADDETAILSSERVICES = 48;

  private static final int LAYOUT_ITEMADIMAGES = 49;

  private static final int LAYOUT_ITEMADS = 50;

  private static final int LAYOUT_ITEMCATEGORY = 51;

  private static final int LAYOUT_ITEMCHAT = 52;

  private static final int LAYOUT_ITEMCHATIMAGES = 53;

  private static final int LAYOUT_ITEMCITY = 54;

  private static final int LAYOUT_ITEMCONVERSATION = 55;

  private static final int LAYOUT_ITEMFAVORITES = 56;

  private static final int LAYOUT_ITEMHOME = 57;

  private static final int LAYOUT_ITEMHOMECATEGORY = 58;

  private static final int LAYOUT_ITEMMYADS = 59;

  private static final int LAYOUT_ITEMREASONS = 60;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 61;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 62;

  private static final int LAYOUT_LAYOUTGRAND = 63;

  private static final int LAYOUT_NOTIFYITEM = 64;

  private static final int LAYOUT_REPORTDIALOG = 65;

  private static final int LAYOUT_REPORTWARNINGDIALOG = 66;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(66);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.dialog_edit_option, LAYOUT_DIALOGEDITOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_ad_details, LAYOUT_FRAGMENTADDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_ad_rent_dialog, LAYOUT_FRAGMENTADRENTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_factory_form, LAYOUT_FRAGMENTADDFACTORYFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_flat_form, LAYOUT_FRAGMENTADDFLATFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_land_form, LAYOUT_FRAGMENTADDLANDFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_office_form, LAYOUT_FRAGMENTADDOFFICEFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_rest_form, LAYOUT_FRAGMENTADDRESTFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_store_form, LAYOUT_FRAGMENTADDSTOREFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_villa_house_form, LAYOUT_FRAGMENTADDVILLAHOUSEFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_add_warehouse_form, LAYOUT_FRAGMENTADDWAREHOUSEFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_ads_attachments, LAYOUT_FRAGMENTADSATTACHMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_ads_info, LAYOUT_FRAGMENTADSINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_advertising_fee, LAYOUT_FRAGMENTADVERTISINGFEE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_akar_location_cities, LAYOUT_FRAGMENTAKARLOCATIONCITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_akar_locations_map, LAYOUT_FRAGMENTAKARLOCATIONSMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_categories, LAYOUT_FRAGMENTCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_contact_favorites, LAYOUT_FRAGMENTCONTACTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_conversations, LAYOUT_FRAGMENTCONVERSATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_current_ads, LAYOUT_FRAGMENTCURRENTADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_home_cities, LAYOUT_FRAGMENTHOMECITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_my_account, LAYOUT_FRAGMENTMYACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_my_ads_main, LAYOUT_FRAGMENTMYADSMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_my_favorites_main, LAYOUT_FRAGMENTMYFAVORITESMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_payment, LAYOUT_FRAGMENTPAYMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_previous_ads, LAYOUT_FRAGMENTPREVIOUSADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_terms, LAYOUT_FRAGMENTTERMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_upload_success, LAYOUT_FRAGMENTUPLOADSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.home_list_layout, LAYOUT_HOMELISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.home_map_layout, LAYOUT_HOMEMAPLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.home_sort, LAYOUT_HOMESORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_ad_details_services, LAYOUT_ITEMADDETAILSSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_ad_images, LAYOUT_ITEMADIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_ads, LAYOUT_ITEMADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_chat, LAYOUT_ITEMCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_chat_images, LAYOUT_ITEMCHATIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_city, LAYOUT_ITEMCITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_conversation, LAYOUT_ITEMCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_favorites, LAYOUT_ITEMFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_home_category, LAYOUT_ITEMHOMECATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_my_ads, LAYOUT_ITEMMYADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_reasons, LAYOUT_ITEMREASONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.notify_item, LAYOUT_NOTIFYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.report_dialog, LAYOUT_REPORTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.report_warning_dialog, LAYOUT_REPORTWARNINGDIALOG);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYBASE: {
        if ("layout/activity_base_0".equals(tag)) {
          return new ActivityBaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGEDITOPTION: {
        if ("layout/dialog_edit_option_0".equals(tag)) {
          return new DialogEditOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_edit_option is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTABOUT: {
        if ("layout/fragment_about_0".equals(tag)) {
          return new FragmentAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDETAILS: {
        if ("layout/fragment_ad_details_0".equals(tag)) {
          return new FragmentAdDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_ad_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADRENTDIALOG: {
        if ("layout/fragment_ad_rent_dialog_0".equals(tag)) {
          return new FragmentAdRentDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_ad_rent_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDFACTORYFORM: {
        if ("layout/fragment_add_factory_form_0".equals(tag)) {
          return new FragmentAddFactoryFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_factory_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDFLATFORM: {
        if ("layout/fragment_add_flat_form_0".equals(tag)) {
          return new FragmentAddFlatFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_flat_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDLANDFORM: {
        if ("layout/fragment_add_land_form_0".equals(tag)) {
          return new FragmentAddLandFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_land_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDOFFICEFORM: {
        if ("layout/fragment_add_office_form_0".equals(tag)) {
          return new FragmentAddOfficeFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_office_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDRESTFORM: {
        if ("layout/fragment_add_rest_form_0".equals(tag)) {
          return new FragmentAddRestFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_rest_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDSTOREFORM: {
        if ("layout/fragment_add_store_form_0".equals(tag)) {
          return new FragmentAddStoreFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_store_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDVILLAHOUSEFORM: {
        if ("layout/fragment_add_villa_house_form_0".equals(tag)) {
          return new FragmentAddVillaHouseFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_villa_house_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDWAREHOUSEFORM: {
        if ("layout/fragment_add_warehouse_form_0".equals(tag)) {
          return new FragmentAddWarehouseFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_warehouse_form is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADSATTACHMENTS: {
        if ("layout/fragment_ads_attachments_0".equals(tag)) {
          return new FragmentAdsAttachmentsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_ads_attachments is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADSINFO: {
        if ("layout/fragment_ads_info_0".equals(tag)) {
          return new FragmentAdsInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_ads_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADVERTISINGFEE: {
        if ("layout/fragment_advertising_fee_0".equals(tag)) {
          return new FragmentAdvertisingFeeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_advertising_fee is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAKARLOCATIONCITIES: {
        if ("layout/fragment_akar_location_cities_0".equals(tag)) {
          return new FragmentAkarLocationCitiesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_akar_location_cities is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAKARLOCATIONSMAP: {
        if ("layout/fragment_akar_locations_map_0".equals(tag)) {
          return new FragmentAkarLocationsMapBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_akar_locations_map is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCATEGORIES: {
        if ("layout/fragment_categories_0".equals(tag)) {
          return new FragmentCategoriesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_categories is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
        if ("layout/fragment_change_password_0".equals(tag)) {
          return new FragmentChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHAT: {
        if ("layout/fragment_chat_0".equals(tag)) {
          return new FragmentChatBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONFIRMCODE: {
        if ("layout/fragment_confirm_code_0".equals(tag)) {
          return new FragmentConfirmCodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACT: {
        if ("layout/fragment_contact_0".equals(tag)) {
          return new FragmentContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACTFAVORITES: {
        if ("layout/fragment_contact_favorites_0".equals(tag)) {
          return new FragmentContactFavoritesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contact_favorites is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONVERSATIONS: {
        if ("layout/fragment_conversations_0".equals(tag)) {
          return new FragmentConversationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_conversations is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCURRENTADS: {
        if ("layout/fragment_current_ads_0".equals(tag)) {
          return new FragmentCurrentAdsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_current_ads is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFAVORITES: {
        if ("layout/fragment_favorites_0".equals(tag)) {
          return new FragmentFavoritesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGETPASSWORD: {
        if ("layout/fragment_forget_password_0".equals(tag)) {
          return new FragmentForgetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOMECITIES: {
        if ("layout/fragment_home_cities_0".equals(tag)) {
          return new FragmentHomeCitiesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home_cities is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYACCOUNT: {
        if ("layout/fragment_my_account_0".equals(tag)) {
          return new FragmentMyAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_account is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYADSMAIN: {
        if ("layout/fragment_my_ads_main_0".equals(tag)) {
          return new FragmentMyAdsMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_ads_main is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYFAVORITESMAIN: {
        if ("layout/fragment_my_favorites_main_0".equals(tag)) {
          return new FragmentMyFavoritesMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_favorites_main is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATIONS: {
        if ("layout/fragment_notifications_0".equals(tag)) {
          return new FragmentNotificationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notifications is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTONBOARD: {
        if ("layout/fragment_onboard_0".equals(tag)) {
          return new FragmentOnboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPAYMENT: {
        if ("layout/fragment_payment_0".equals(tag)) {
          return new FragmentPaymentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_payment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPREVIOUSADS: {
        if ("layout/fragment_previous_ads_0".equals(tag)) {
          return new FragmentPreviousAdsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_previous_ads is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSPLASH: {
        if ("layout/fragment_splash_0".equals(tag)) {
          return new FragmentSplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTERMS: {
        if ("layout/fragment_terms_0".equals(tag)) {
          return new FragmentTermsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_terms is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPLOADSUCCESS: {
        if ("layout/fragment_upload_success_0".equals(tag)) {
          return new FragmentUploadSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_upload_success is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMELISTLAYOUT: {
        if ("layout/home_list_layout_0".equals(tag)) {
          return new HomeListLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_list_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMEMAPLAYOUT: {
        if ("layout/home_map_layout_0".equals(tag)) {
          return new HomeMapLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_map_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMESORT: {
        if ("layout/home_sort_0".equals(tag)) {
          return new HomeSortBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_sort is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADDETAILSSERVICES: {
        if ("layout/item_ad_details_services_0".equals(tag)) {
          return new ItemAdDetailsServicesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_ad_details_services is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADIMAGES: {
        if ("layout/item_ad_images_0".equals(tag)) {
          return new ItemAdImagesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_ad_images is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADS: {
        if ("layout/item_ads_0".equals(tag)) {
          return new ItemAdsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_ads is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMCATEGORY: {
        if ("layout/item_category_0".equals(tag)) {
          return new ItemCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCHAT: {
        if ("layout/item_chat_0".equals(tag)) {
          return new ItemChatBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_chat is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCHATIMAGES: {
        if ("layout/item_chat_images_0".equals(tag)) {
          return new ItemChatImagesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_chat_images is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCITY: {
        if ("layout/item_city_0".equals(tag)) {
          return new ItemCityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_city is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONVERSATION: {
        if ("layout/item_conversation_0".equals(tag)) {
          return new ItemConversationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_conversation is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFAVORITES: {
        if ("layout/item_favorites_0".equals(tag)) {
          return new ItemFavoritesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_favorites is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOME: {
        if ("layout/item_home_0".equals(tag)) {
          return new ItemHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOMECATEGORY: {
        if ("layout/item_home_category_0".equals(tag)) {
          return new ItemHomeCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYADS: {
        if ("layout/item_my_ads_0".equals(tag)) {
          return new ItemMyAdsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_ads is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREASONS: {
        if ("layout/item_reasons_0".equals(tag)) {
          return new ItemReasonsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_reasons is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTACTIONBARBACK: {
        if ("layout/layout_action_bar_back_0".equals(tag)) {
          return new LayoutActionBarBackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_action_bar_back is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTACTIONBARHOME: {
        if ("layout/layout_action_bar_home_0".equals(tag)) {
          return new LayoutActionBarHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_action_bar_home is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTGRAND: {
        if ("layout/layout_grand_0".equals(tag)) {
          return new LayoutGrandBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_grand is invalid. Received: " + tag);
      }
      case  LAYOUT_NOTIFYITEM: {
        if ("layout/notify_item_0".equals(tag)) {
          return new NotifyItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for notify_item is invalid. Received: " + tag);
      }
      case  LAYOUT_REPORTDIALOG: {
        if ("layout/report_dialog_0".equals(tag)) {
          return new ReportDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for report_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_REPORTWARNINGDIALOG: {
        if ("layout/report_warning_dialog_0".equals(tag)) {
          return new ReportWarningDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for report_warning_dialog is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(50);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "adDetailsData");
      sKeys.put(3, "baseViewModel");
      sKeys.put(4, "categoriesData");
      sKeys.put(5, "chat");
      sKeys.put(6, "cities");
      sKeys.put(7, "citiesList");
      sKeys.put(8, "conversationsData");
      sKeys.put(9, "createAdRequest");
      sKeys.put(10, "createRequest");
      sKeys.put(11, "dealingType");
      sKeys.put(12, "defaultImg");
      sKeys.put(13, "docType");
      sKeys.put(14, "fileObjectVideo");
      sKeys.put(15, "furniture");
      sKeys.put(16, "garage");
      sKeys.put(17, "homeData");
      sKeys.put(18, "hospital");
      sKeys.put(19, "itemChatViewModel");
      sKeys.put(20, "itemHomeViewModel");
      sKeys.put(21, "itemViewModel");
      sKeys.put(22, "lift");
      sKeys.put(23, "loginStatus");
      sKeys.put(24, "manager");
      sKeys.put(25, "mosque");
      sKeys.put(26, "myAdsAdapter");
      sKeys.put(27, "myFavoritesAdapter");
      sKeys.put(28, "notificationsData");
      sKeys.put(29, "notifyItemViewModels");
      sKeys.put(30, "notifyViewModel");
      sKeys.put(31, "onBoardAdapter");
      sKeys.put(32, "onBoardViewModels");
      sKeys.put(33, "orderImages");
      sKeys.put(34, "passingObject");
      sKeys.put(35, "paymentMethod");
      sKeys.put(36, "policeStation");
      sKeys.put(37, "pool");
      sKeys.put(38, "profileData");
      sKeys.put(39, "reasonsItem");
      sKeys.put(40, "school");
      sKeys.put(41, "selected");
      sKeys.put(42, "settingsData");
      sKeys.put(43, "sliderItem");
      sKeys.put(44, "string");
      sKeys.put(45, "type");
      sKeys.put(46, "updateRequest");
      sKeys.put(47, "userDocuments");
      sKeys.put(48, "viewModel");
      sKeys.put(49, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(66);

    static {
      sKeys.put("layout/activity_base_0", grand.app.akar.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", grand.app.akar.R.layout.activity_main);
      sKeys.put("layout/dialog_edit_option_0", grand.app.akar.R.layout.dialog_edit_option);
      sKeys.put("layout/fragment_about_0", grand.app.akar.R.layout.fragment_about);
      sKeys.put("layout/fragment_ad_details_0", grand.app.akar.R.layout.fragment_ad_details);
      sKeys.put("layout/fragment_ad_rent_dialog_0", grand.app.akar.R.layout.fragment_ad_rent_dialog);
      sKeys.put("layout/fragment_add_factory_form_0", grand.app.akar.R.layout.fragment_add_factory_form);
      sKeys.put("layout/fragment_add_flat_form_0", grand.app.akar.R.layout.fragment_add_flat_form);
      sKeys.put("layout/fragment_add_land_form_0", grand.app.akar.R.layout.fragment_add_land_form);
      sKeys.put("layout/fragment_add_office_form_0", grand.app.akar.R.layout.fragment_add_office_form);
      sKeys.put("layout/fragment_add_rest_form_0", grand.app.akar.R.layout.fragment_add_rest_form);
      sKeys.put("layout/fragment_add_store_form_0", grand.app.akar.R.layout.fragment_add_store_form);
      sKeys.put("layout/fragment_add_villa_house_form_0", grand.app.akar.R.layout.fragment_add_villa_house_form);
      sKeys.put("layout/fragment_add_warehouse_form_0", grand.app.akar.R.layout.fragment_add_warehouse_form);
      sKeys.put("layout/fragment_ads_attachments_0", grand.app.akar.R.layout.fragment_ads_attachments);
      sKeys.put("layout/fragment_ads_info_0", grand.app.akar.R.layout.fragment_ads_info);
      sKeys.put("layout/fragment_advertising_fee_0", grand.app.akar.R.layout.fragment_advertising_fee);
      sKeys.put("layout/fragment_akar_location_cities_0", grand.app.akar.R.layout.fragment_akar_location_cities);
      sKeys.put("layout/fragment_akar_locations_map_0", grand.app.akar.R.layout.fragment_akar_locations_map);
      sKeys.put("layout/fragment_categories_0", grand.app.akar.R.layout.fragment_categories);
      sKeys.put("layout/fragment_change_password_0", grand.app.akar.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_chat_0", grand.app.akar.R.layout.fragment_chat);
      sKeys.put("layout/fragment_confirm_code_0", grand.app.akar.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contact_0", grand.app.akar.R.layout.fragment_contact);
      sKeys.put("layout/fragment_contact_favorites_0", grand.app.akar.R.layout.fragment_contact_favorites);
      sKeys.put("layout/fragment_conversations_0", grand.app.akar.R.layout.fragment_conversations);
      sKeys.put("layout/fragment_current_ads_0", grand.app.akar.R.layout.fragment_current_ads);
      sKeys.put("layout/fragment_favorites_0", grand.app.akar.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_forget_password_0", grand.app.akar.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", grand.app.akar.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_cities_0", grand.app.akar.R.layout.fragment_home_cities);
      sKeys.put("layout/fragment_login_0", grand.app.akar.R.layout.fragment_login);
      sKeys.put("layout/fragment_my_account_0", grand.app.akar.R.layout.fragment_my_account);
      sKeys.put("layout/fragment_my_ads_main_0", grand.app.akar.R.layout.fragment_my_ads_main);
      sKeys.put("layout/fragment_my_favorites_main_0", grand.app.akar.R.layout.fragment_my_favorites_main);
      sKeys.put("layout/fragment_notifications_0", grand.app.akar.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_onboard_0", grand.app.akar.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_payment_0", grand.app.akar.R.layout.fragment_payment);
      sKeys.put("layout/fragment_previous_ads_0", grand.app.akar.R.layout.fragment_previous_ads);
      sKeys.put("layout/fragment_profile_0", grand.app.akar.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", grand.app.akar.R.layout.fragment_register);
      sKeys.put("layout/fragment_splash_0", grand.app.akar.R.layout.fragment_splash);
      sKeys.put("layout/fragment_terms_0", grand.app.akar.R.layout.fragment_terms);
      sKeys.put("layout/fragment_upload_success_0", grand.app.akar.R.layout.fragment_upload_success);
      sKeys.put("layout/home_list_layout_0", grand.app.akar.R.layout.home_list_layout);
      sKeys.put("layout/home_map_layout_0", grand.app.akar.R.layout.home_map_layout);
      sKeys.put("layout/home_sort_0", grand.app.akar.R.layout.home_sort);
      sKeys.put("layout/item_ad_details_services_0", grand.app.akar.R.layout.item_ad_details_services);
      sKeys.put("layout/item_ad_images_0", grand.app.akar.R.layout.item_ad_images);
      sKeys.put("layout/item_ads_0", grand.app.akar.R.layout.item_ads);
      sKeys.put("layout/item_category_0", grand.app.akar.R.layout.item_category);
      sKeys.put("layout/item_chat_0", grand.app.akar.R.layout.item_chat);
      sKeys.put("layout/item_chat_images_0", grand.app.akar.R.layout.item_chat_images);
      sKeys.put("layout/item_city_0", grand.app.akar.R.layout.item_city);
      sKeys.put("layout/item_conversation_0", grand.app.akar.R.layout.item_conversation);
      sKeys.put("layout/item_favorites_0", grand.app.akar.R.layout.item_favorites);
      sKeys.put("layout/item_home_0", grand.app.akar.R.layout.item_home);
      sKeys.put("layout/item_home_category_0", grand.app.akar.R.layout.item_home_category);
      sKeys.put("layout/item_my_ads_0", grand.app.akar.R.layout.item_my_ads);
      sKeys.put("layout/item_reasons_0", grand.app.akar.R.layout.item_reasons);
      sKeys.put("layout/layout_action_bar_back_0", grand.app.akar.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", grand.app.akar.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", grand.app.akar.R.layout.layout_grand);
      sKeys.put("layout/notify_item_0", grand.app.akar.R.layout.notify_item);
      sKeys.put("layout/report_dialog_0", grand.app.akar.R.layout.report_dialog);
      sKeys.put("layout/report_warning_dialog_0", grand.app.akar.R.layout.report_warning_dialog);
    }
  }
}
