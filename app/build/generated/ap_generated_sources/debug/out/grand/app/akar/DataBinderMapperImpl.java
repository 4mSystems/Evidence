package grand.app.akar;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.databinding.ActivityBaseBindingImpl;
import grand.app.akar.databinding.ActivityMainBindingImpl;
import grand.app.akar.databinding.FragmentAboutBindingImpl;
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
import grand.app.akar.databinding.FragmentConversationsBindingImpl;
import grand.app.akar.databinding.FragmentCurrentAdsBindingImpl;
import grand.app.akar.databinding.FragmentForgetPasswordBindingImpl;
import grand.app.akar.databinding.FragmentHomeBindingImpl;
import grand.app.akar.databinding.FragmentLoginBindingImpl;
import grand.app.akar.databinding.FragmentMyAccountBindingImpl;
import grand.app.akar.databinding.FragmentMyAdsMainBindingImpl;
import grand.app.akar.databinding.FragmentNotificationsBindingImpl;
import grand.app.akar.databinding.FragmentOnboardBindingImpl;
import grand.app.akar.databinding.FragmentPaymentBindingImpl;
import grand.app.akar.databinding.FragmentPreviousAdsBindingImpl;
import grand.app.akar.databinding.FragmentProfileBindingImpl;
import grand.app.akar.databinding.FragmentRegisterBindingImpl;
import grand.app.akar.databinding.FragmentSplashBindingImpl;
import grand.app.akar.databinding.FragmentTermsBindingImpl;
import grand.app.akar.databinding.FragmentUploadSuccessBindingImpl;
import grand.app.akar.databinding.ItemCategoryBindingImpl;
import grand.app.akar.databinding.ItemChatBindingImpl;
import grand.app.akar.databinding.ItemCityBindingImpl;
import grand.app.akar.databinding.ItemConversationBindingImpl;
import grand.app.akar.databinding.ItemHomeBindingImpl;
import grand.app.akar.databinding.ItemMyAdsBindingImpl;
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

  private static final int LAYOUT_FRAGMENTABOUT = 3;

  private static final int LAYOUT_FRAGMENTADDFACTORYFORM = 4;

  private static final int LAYOUT_FRAGMENTADDFLATFORM = 5;

  private static final int LAYOUT_FRAGMENTADDLANDFORM = 6;

  private static final int LAYOUT_FRAGMENTADDOFFICEFORM = 7;

  private static final int LAYOUT_FRAGMENTADDRESTFORM = 8;

  private static final int LAYOUT_FRAGMENTADDSTOREFORM = 9;

  private static final int LAYOUT_FRAGMENTADDVILLAHOUSEFORM = 10;

  private static final int LAYOUT_FRAGMENTADDWAREHOUSEFORM = 11;

  private static final int LAYOUT_FRAGMENTADSATTACHMENTS = 12;

  private static final int LAYOUT_FRAGMENTADSINFO = 13;

  private static final int LAYOUT_FRAGMENTADVERTISINGFEE = 14;

  private static final int LAYOUT_FRAGMENTAKARLOCATIONCITIES = 15;

  private static final int LAYOUT_FRAGMENTAKARLOCATIONSMAP = 16;

  private static final int LAYOUT_FRAGMENTCATEGORIES = 17;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 18;

  private static final int LAYOUT_FRAGMENTCHAT = 19;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 20;

  private static final int LAYOUT_FRAGMENTCONTACT = 21;

  private static final int LAYOUT_FRAGMENTCONVERSATIONS = 22;

  private static final int LAYOUT_FRAGMENTCURRENTADS = 23;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 24;

  private static final int LAYOUT_FRAGMENTHOME = 25;

  private static final int LAYOUT_FRAGMENTLOGIN = 26;

  private static final int LAYOUT_FRAGMENTMYACCOUNT = 27;

  private static final int LAYOUT_FRAGMENTMYADSMAIN = 28;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 29;

  private static final int LAYOUT_FRAGMENTONBOARD = 30;

  private static final int LAYOUT_FRAGMENTPAYMENT = 31;

  private static final int LAYOUT_FRAGMENTPREVIOUSADS = 32;

  private static final int LAYOUT_FRAGMENTPROFILE = 33;

  private static final int LAYOUT_FRAGMENTREGISTER = 34;

  private static final int LAYOUT_FRAGMENTSPLASH = 35;

  private static final int LAYOUT_FRAGMENTTERMS = 36;

  private static final int LAYOUT_FRAGMENTUPLOADSUCCESS = 37;

  private static final int LAYOUT_ITEMCATEGORY = 38;

  private static final int LAYOUT_ITEMCHAT = 39;

  private static final int LAYOUT_ITEMCITY = 40;

  private static final int LAYOUT_ITEMCONVERSATION = 41;

  private static final int LAYOUT_ITEMHOME = 42;

  private static final int LAYOUT_ITEMMYADS = 43;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 44;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 45;

  private static final int LAYOUT_LAYOUTGRAND = 46;

  private static final int LAYOUT_NOTIFYITEM = 47;

  private static final int LAYOUT_REPORTDIALOG = 48;

  private static final int LAYOUT_REPORTWARNINGDIALOG = 49;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(49);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
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
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_conversations, LAYOUT_FRAGMENTCONVERSATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_current_ads, LAYOUT_FRAGMENTCURRENTADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_my_account, LAYOUT_FRAGMENTMYACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_my_ads_main, LAYOUT_FRAGMENTMYADSMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_payment, LAYOUT_FRAGMENTPAYMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_previous_ads, LAYOUT_FRAGMENTPREVIOUSADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_terms, LAYOUT_FRAGMENTTERMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.fragment_upload_success, LAYOUT_FRAGMENTUPLOADSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_chat, LAYOUT_ITEMCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_city, LAYOUT_ITEMCITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_conversation, LAYOUT_ITEMCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.item_my_ads, LAYOUT_ITEMMYADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.notify_item, LAYOUT_NOTIFYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.report_dialog, LAYOUT_REPORTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.akar.R.layout.report_warning_dialog, LAYOUT_REPORTWARNINGDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
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
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
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
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYADS: {
          if ("layout/item_my_ads_0".equals(tag)) {
            return new ItemMyAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_ads is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(24);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "baseViewModel");
      sKeys.put(3, "categoriesData");
      sKeys.put(4, "cities");
      sKeys.put(5, "citiesList");
      sKeys.put(6, "homeData");
      sKeys.put(7, "itemChatViewModel");
      sKeys.put(8, "itemHomeViewModel");
      sKeys.put(9, "itemViewModel");
      sKeys.put(10, "loginStatus");
      sKeys.put(11, "manager");
      sKeys.put(12, "myAdsAdapter");
      sKeys.put(13, "notificationsData");
      sKeys.put(14, "notifyItemViewModels");
      sKeys.put(15, "notifyViewModel");
      sKeys.put(16, "onBoardAdapter");
      sKeys.put(17, "onBoardViewModels");
      sKeys.put(18, "passingObject");
      sKeys.put(19, "profileData");
      sKeys.put(20, "settingsData");
      sKeys.put(21, "userDocuments");
      sKeys.put(22, "viewModel");
      sKeys.put(23, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(49);

    static {
      sKeys.put("layout/activity_base_0", grand.app.akar.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", grand.app.akar.R.layout.activity_main);
      sKeys.put("layout/fragment_about_0", grand.app.akar.R.layout.fragment_about);
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
      sKeys.put("layout/fragment_conversations_0", grand.app.akar.R.layout.fragment_conversations);
      sKeys.put("layout/fragment_current_ads_0", grand.app.akar.R.layout.fragment_current_ads);
      sKeys.put("layout/fragment_forget_password_0", grand.app.akar.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", grand.app.akar.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", grand.app.akar.R.layout.fragment_login);
      sKeys.put("layout/fragment_my_account_0", grand.app.akar.R.layout.fragment_my_account);
      sKeys.put("layout/fragment_my_ads_main_0", grand.app.akar.R.layout.fragment_my_ads_main);
      sKeys.put("layout/fragment_notifications_0", grand.app.akar.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_onboard_0", grand.app.akar.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_payment_0", grand.app.akar.R.layout.fragment_payment);
      sKeys.put("layout/fragment_previous_ads_0", grand.app.akar.R.layout.fragment_previous_ads);
      sKeys.put("layout/fragment_profile_0", grand.app.akar.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", grand.app.akar.R.layout.fragment_register);
      sKeys.put("layout/fragment_splash_0", grand.app.akar.R.layout.fragment_splash);
      sKeys.put("layout/fragment_terms_0", grand.app.akar.R.layout.fragment_terms);
      sKeys.put("layout/fragment_upload_success_0", grand.app.akar.R.layout.fragment_upload_success);
      sKeys.put("layout/item_category_0", grand.app.akar.R.layout.item_category);
      sKeys.put("layout/item_chat_0", grand.app.akar.R.layout.item_chat);
      sKeys.put("layout/item_city_0", grand.app.akar.R.layout.item_city);
      sKeys.put("layout/item_conversation_0", grand.app.akar.R.layout.item_conversation);
      sKeys.put("layout/item_home_0", grand.app.akar.R.layout.item_home);
      sKeys.put("layout/item_my_ads_0", grand.app.akar.R.layout.item_my_ads);
      sKeys.put("layout/layout_action_bar_back_0", grand.app.akar.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", grand.app.akar.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", grand.app.akar.R.layout.layout_grand);
      sKeys.put("layout/notify_item_0", grand.app.akar.R.layout.notify_item);
      sKeys.put("layout/report_dialog_0", grand.app.akar.R.layout.report_dialog);
      sKeys.put("layout/report_warning_dialog_0", grand.app.akar.R.layout.report_warning_dialog);
    }
  }
}
