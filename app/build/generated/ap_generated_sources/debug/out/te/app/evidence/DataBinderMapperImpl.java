package te.app.evidence;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import te.app.evidence.databinding.ActivityBaseBindingImpl;
import te.app.evidence.databinding.ActivityMainBindingImpl;
import te.app.evidence.databinding.DownloadDialogBindingImpl;
import te.app.evidence.databinding.ExitLayoutBindingImpl;
import te.app.evidence.databinding.FragmentAddAttachmentBindingImpl;
import te.app.evidence.databinding.FragmentAddBailiffsBindingImpl;
import te.app.evidence.databinding.FragmentAddCaseBindingImpl;
import te.app.evidence.databinding.FragmentAddCategoryBindingImpl;
import te.app.evidence.databinding.FragmentAddClientBindingImpl;
import te.app.evidence.databinding.FragmentAddClientToCaseBindingImpl;
import te.app.evidence.databinding.FragmentAddNoteBindingImpl;
import te.app.evidence.databinding.FragmentAddSessionBindingImpl;
import te.app.evidence.databinding.FragmentAddUserBindingImpl;
import te.app.evidence.databinding.FragmentAttachmentsBindingImpl;
import te.app.evidence.databinding.FragmentBailiffsBindingImpl;
import te.app.evidence.databinding.FragmentCaseClientsBindingImpl;
import te.app.evidence.databinding.FragmentCaseDetailsBindingImpl;
import te.app.evidence.databinding.FragmentCasesBindingImpl;
import te.app.evidence.databinding.FragmentCategoriesBindingImpl;
import te.app.evidence.databinding.FragmentChangePasswordBindingImpl;
import te.app.evidence.databinding.FragmentClientProfileBindingImpl;
import te.app.evidence.databinding.FragmentClientsBindingImpl;
import te.app.evidence.databinding.FragmentConfirmCodeBindingImpl;
import te.app.evidence.databinding.FragmentContactBindingImpl;
import te.app.evidence.databinding.FragmentDailyReportsBindingImpl;
import te.app.evidence.databinding.FragmentEditCaseBindingImpl;
import te.app.evidence.databinding.FragmentForgetPasswordBindingImpl;
import te.app.evidence.databinding.FragmentHomeBindingImpl;
import te.app.evidence.databinding.FragmentLoginBindingImpl;
import te.app.evidence.databinding.FragmentMonthlyReportsBindingImpl;
import te.app.evidence.databinding.FragmentOnboardBindingImpl;
import te.app.evidence.databinding.FragmentPackagesBindingImpl;
import te.app.evidence.databinding.FragmentPointsBindingImpl;
import te.app.evidence.databinding.FragmentProfileBindingImpl;
import te.app.evidence.databinding.FragmentRegisterBindingImpl;
import te.app.evidence.databinding.FragmentReporterDetailsBindingImpl;
import te.app.evidence.databinding.FragmentSearchClientsBindingImpl;
import te.app.evidence.databinding.FragmentSessionNotesBindingImpl;
import te.app.evidence.databinding.FragmentSessionsBindingImpl;
import te.app.evidence.databinding.FragmentSplashBindingImpl;
import te.app.evidence.databinding.FragmentUserPermissionBindingImpl;
import te.app.evidence.databinding.FragmentUsersBindingImpl;
import te.app.evidence.databinding.ItemAllCaseBindingImpl;
import te.app.evidence.databinding.ItemAttachmentBindingImpl;
import te.app.evidence.databinding.ItemBailiffsBindingImpl;
import te.app.evidence.databinding.ItemCaseBindingImpl;
import te.app.evidence.databinding.ItemCategoryBindingImpl;
import te.app.evidence.databinding.ItemClientSearchBindingImpl;
import te.app.evidence.databinding.ItemClientTagsBindingImpl;
import te.app.evidence.databinding.ItemClientsBindingImpl;
import te.app.evidence.databinding.ItemHomeReporterBindingImpl;
import te.app.evidence.databinding.ItemNoteBindingImpl;
import te.app.evidence.databinding.ItemPackageBindingImpl;
import te.app.evidence.databinding.ItemReplacedPointsBindingImpl;
import te.app.evidence.databinding.ItemReportBindingImpl;
import te.app.evidence.databinding.ItemSessionBindingImpl;
import te.app.evidence.databinding.ItemSessionNoteBindingImpl;
import te.app.evidence.databinding.ItemUserBindingImpl;
import te.app.evidence.databinding.LayoutActionBarBackBindingImpl;
import te.app.evidence.databinding.LayoutActionBarHomeBindingImpl;
import te.app.evidence.databinding.LayoutNavigationDrawerBindingImpl;
import te.app.evidence.databinding.OptionDialogBindingImpl;
import te.app.evidence.databinding.PackageRenewDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DOWNLOADDIALOG = 3;

  private static final int LAYOUT_EXITLAYOUT = 4;

  private static final int LAYOUT_FRAGMENTADDATTACHMENT = 5;

  private static final int LAYOUT_FRAGMENTADDBAILIFFS = 6;

  private static final int LAYOUT_FRAGMENTADDCASE = 7;

  private static final int LAYOUT_FRAGMENTADDCATEGORY = 8;

  private static final int LAYOUT_FRAGMENTADDCLIENT = 9;

  private static final int LAYOUT_FRAGMENTADDCLIENTTOCASE = 10;

  private static final int LAYOUT_FRAGMENTADDNOTE = 11;

  private static final int LAYOUT_FRAGMENTADDSESSION = 12;

  private static final int LAYOUT_FRAGMENTADDUSER = 13;

  private static final int LAYOUT_FRAGMENTATTACHMENTS = 14;

  private static final int LAYOUT_FRAGMENTBAILIFFS = 15;

  private static final int LAYOUT_FRAGMENTCASECLIENTS = 16;

  private static final int LAYOUT_FRAGMENTCASEDETAILS = 17;

  private static final int LAYOUT_FRAGMENTCASES = 18;

  private static final int LAYOUT_FRAGMENTCATEGORIES = 19;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 20;

  private static final int LAYOUT_FRAGMENTCLIENTPROFILE = 21;

  private static final int LAYOUT_FRAGMENTCLIENTS = 22;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 23;

  private static final int LAYOUT_FRAGMENTCONTACT = 24;

  private static final int LAYOUT_FRAGMENTDAILYREPORTS = 25;

  private static final int LAYOUT_FRAGMENTEDITCASE = 26;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 27;

  private static final int LAYOUT_FRAGMENTHOME = 28;

  private static final int LAYOUT_FRAGMENTLOGIN = 29;

  private static final int LAYOUT_FRAGMENTMONTHLYREPORTS = 30;

  private static final int LAYOUT_FRAGMENTONBOARD = 31;

  private static final int LAYOUT_FRAGMENTPACKAGES = 32;

  private static final int LAYOUT_FRAGMENTPOINTS = 33;

  private static final int LAYOUT_FRAGMENTPROFILE = 34;

  private static final int LAYOUT_FRAGMENTREGISTER = 35;

  private static final int LAYOUT_FRAGMENTREPORTERDETAILS = 36;

  private static final int LAYOUT_FRAGMENTSEARCHCLIENTS = 37;

  private static final int LAYOUT_FRAGMENTSESSIONNOTES = 38;

  private static final int LAYOUT_FRAGMENTSESSIONS = 39;

  private static final int LAYOUT_FRAGMENTSPLASH = 40;

  private static final int LAYOUT_FRAGMENTUSERPERMISSION = 41;

  private static final int LAYOUT_FRAGMENTUSERS = 42;

  private static final int LAYOUT_ITEMALLCASE = 43;

  private static final int LAYOUT_ITEMATTACHMENT = 44;

  private static final int LAYOUT_ITEMBAILIFFS = 45;

  private static final int LAYOUT_ITEMCASE = 46;

  private static final int LAYOUT_ITEMCATEGORY = 47;

  private static final int LAYOUT_ITEMCLIENTSEARCH = 48;

  private static final int LAYOUT_ITEMCLIENTTAGS = 49;

  private static final int LAYOUT_ITEMCLIENTS = 50;

  private static final int LAYOUT_ITEMHOMEREPORTER = 51;

  private static final int LAYOUT_ITEMNOTE = 52;

  private static final int LAYOUT_ITEMPACKAGE = 53;

  private static final int LAYOUT_ITEMREPLACEDPOINTS = 54;

  private static final int LAYOUT_ITEMREPORT = 55;

  private static final int LAYOUT_ITEMSESSION = 56;

  private static final int LAYOUT_ITEMSESSIONNOTE = 57;

  private static final int LAYOUT_ITEMUSER = 58;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 59;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 60;

  private static final int LAYOUT_LAYOUTNAVIGATIONDRAWER = 61;

  private static final int LAYOUT_OPTIONDIALOG = 62;

  private static final int LAYOUT_PACKAGERENEWDIALOG = 63;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(63);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.download_dialog, LAYOUT_DOWNLOADDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.exit_layout, LAYOUT_EXITLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_attachment, LAYOUT_FRAGMENTADDATTACHMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_bailiffs, LAYOUT_FRAGMENTADDBAILIFFS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_case, LAYOUT_FRAGMENTADDCASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_category, LAYOUT_FRAGMENTADDCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_client, LAYOUT_FRAGMENTADDCLIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_client_to_case, LAYOUT_FRAGMENTADDCLIENTTOCASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_note, LAYOUT_FRAGMENTADDNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_session, LAYOUT_FRAGMENTADDSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_add_user, LAYOUT_FRAGMENTADDUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_attachments, LAYOUT_FRAGMENTATTACHMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_bailiffs, LAYOUT_FRAGMENTBAILIFFS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_case_clients, LAYOUT_FRAGMENTCASECLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_case_details, LAYOUT_FRAGMENTCASEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_cases, LAYOUT_FRAGMENTCASES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_categories, LAYOUT_FRAGMENTCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_client_profile, LAYOUT_FRAGMENTCLIENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_clients, LAYOUT_FRAGMENTCLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_daily_reports, LAYOUT_FRAGMENTDAILYREPORTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_edit_case, LAYOUT_FRAGMENTEDITCASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_monthly_reports, LAYOUT_FRAGMENTMONTHLYREPORTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_packages, LAYOUT_FRAGMENTPACKAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_points, LAYOUT_FRAGMENTPOINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_reporter_details, LAYOUT_FRAGMENTREPORTERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_search_clients, LAYOUT_FRAGMENTSEARCHCLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_session_notes, LAYOUT_FRAGMENTSESSIONNOTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_sessions, LAYOUT_FRAGMENTSESSIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_user_permission, LAYOUT_FRAGMENTUSERPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.fragment_users, LAYOUT_FRAGMENTUSERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_all_case, LAYOUT_ITEMALLCASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_attachment, LAYOUT_ITEMATTACHMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_bailiffs, LAYOUT_ITEMBAILIFFS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_case, LAYOUT_ITEMCASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_client_search, LAYOUT_ITEMCLIENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_client_tags, LAYOUT_ITEMCLIENTTAGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_clients, LAYOUT_ITEMCLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_home_reporter, LAYOUT_ITEMHOMEREPORTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_note, LAYOUT_ITEMNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_package, LAYOUT_ITEMPACKAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_replaced_points, LAYOUT_ITEMREPLACEDPOINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_report, LAYOUT_ITEMREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_session, LAYOUT_ITEMSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_session_note, LAYOUT_ITEMSESSIONNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.item_user, LAYOUT_ITEMUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.layout_navigation_drawer, LAYOUT_LAYOUTNAVIGATIONDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.option_dialog, LAYOUT_OPTIONDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.evidence.R.layout.package_renew_dialog, LAYOUT_PACKAGERENEWDIALOG);
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
      case  LAYOUT_DOWNLOADDIALOG: {
        if ("layout/download_dialog_0".equals(tag)) {
          return new DownloadDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for download_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_EXITLAYOUT: {
        if ("layout/exit_layout_0".equals(tag)) {
          return new ExitLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for exit_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDATTACHMENT: {
        if ("layout/fragment_add_attachment_0".equals(tag)) {
          return new FragmentAddAttachmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_attachment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDBAILIFFS: {
        if ("layout/fragment_add_bailiffs_0".equals(tag)) {
          return new FragmentAddBailiffsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_bailiffs is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDCASE: {
        if ("layout/fragment_add_case_0".equals(tag)) {
          return new FragmentAddCaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_case is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDCATEGORY: {
        if ("layout/fragment_add_category_0".equals(tag)) {
          return new FragmentAddCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_category is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDCLIENT: {
        if ("layout/fragment_add_client_0".equals(tag)) {
          return new FragmentAddClientBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_client is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDCLIENTTOCASE: {
        if ("layout/fragment_add_client_to_case_0".equals(tag)) {
          return new FragmentAddClientToCaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_client_to_case is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDNOTE: {
        if ("layout/fragment_add_note_0".equals(tag)) {
          return new FragmentAddNoteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_note is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDSESSION: {
        if ("layout/fragment_add_session_0".equals(tag)) {
          return new FragmentAddSessionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_session is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDUSER: {
        if ("layout/fragment_add_user_0".equals(tag)) {
          return new FragmentAddUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_user is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTATTACHMENTS: {
        if ("layout/fragment_attachments_0".equals(tag)) {
          return new FragmentAttachmentsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_attachments is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBAILIFFS: {
        if ("layout/fragment_bailiffs_0".equals(tag)) {
          return new FragmentBailiffsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bailiffs is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCASECLIENTS: {
        if ("layout/fragment_case_clients_0".equals(tag)) {
          return new FragmentCaseClientsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_case_clients is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCASEDETAILS: {
        if ("layout/fragment_case_details_0".equals(tag)) {
          return new FragmentCaseDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_case_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCASES: {
        if ("layout/fragment_cases_0".equals(tag)) {
          return new FragmentCasesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_cases is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTCLIENTPROFILE: {
        if ("layout/fragment_client_profile_0".equals(tag)) {
          return new FragmentClientProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_client_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCLIENTS: {
        if ("layout/fragment_clients_0".equals(tag)) {
          return new FragmentClientsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_clients is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTDAILYREPORTS: {
        if ("layout/fragment_daily_reports_0".equals(tag)) {
          return new FragmentDailyReportsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_daily_reports is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITCASE: {
        if ("layout/fragment_edit_case_0".equals(tag)) {
          return new FragmentEditCaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_case is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTMONTHLYREPORTS: {
        if ("layout/fragment_monthly_reports_0".equals(tag)) {
          return new FragmentMonthlyReportsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_monthly_reports is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTONBOARD: {
        if ("layout/fragment_onboard_0".equals(tag)) {
          return new FragmentOnboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPACKAGES: {
        if ("layout/fragment_packages_0".equals(tag)) {
          return new FragmentPackagesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_packages is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPOINTS: {
        if ("layout/fragment_points_0".equals(tag)) {
          return new FragmentPointsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_points is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTREPORTERDETAILS: {
        if ("layout/fragment_reporter_details_0".equals(tag)) {
          return new FragmentReporterDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reporter_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCHCLIENTS: {
        if ("layout/fragment_search_clients_0".equals(tag)) {
          return new FragmentSearchClientsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search_clients is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSESSIONNOTES: {
        if ("layout/fragment_session_notes_0".equals(tag)) {
          return new FragmentSessionNotesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_session_notes is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSESSIONS: {
        if ("layout/fragment_sessions_0".equals(tag)) {
          return new FragmentSessionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sessions is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSPLASH: {
        if ("layout/fragment_splash_0".equals(tag)) {
          return new FragmentSplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUSERPERMISSION: {
        if ("layout/fragment_user_permission_0".equals(tag)) {
          return new FragmentUserPermissionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_user_permission is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUSERS: {
        if ("layout/fragment_users_0".equals(tag)) {
          return new FragmentUsersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_users is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMALLCASE: {
        if ("layout/item_all_case_0".equals(tag)) {
          return new ItemAllCaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_all_case is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMATTACHMENT: {
        if ("layout/item_attachment_0".equals(tag)) {
          return new ItemAttachmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_attachment is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMBAILIFFS: {
        if ("layout/item_bailiffs_0".equals(tag)) {
          return new ItemBailiffsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_bailiffs is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCASE: {
        if ("layout/item_case_0".equals(tag)) {
          return new ItemCaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_case is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCATEGORY: {
        if ("layout/item_category_0".equals(tag)) {
          return new ItemCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCLIENTSEARCH: {
        if ("layout/item_client_search_0".equals(tag)) {
          return new ItemClientSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_client_search is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCLIENTTAGS: {
        if ("layout/item_client_tags_0".equals(tag)) {
          return new ItemClientTagsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_client_tags is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCLIENTS: {
        if ("layout/item_clients_0".equals(tag)) {
          return new ItemClientsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_clients is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMHOMEREPORTER: {
        if ("layout/item_home_reporter_0".equals(tag)) {
          return new ItemHomeReporterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home_reporter is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTE: {
        if ("layout/item_note_0".equals(tag)) {
          return new ItemNoteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_note is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPACKAGE: {
        if ("layout/item_package_0".equals(tag)) {
          return new ItemPackageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_package is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPLACEDPOINTS: {
        if ("layout/item_replaced_points_0".equals(tag)) {
          return new ItemReplacedPointsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_replaced_points is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPORT: {
        if ("layout/item_report_0".equals(tag)) {
          return new ItemReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_report is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSESSION: {
        if ("layout/item_session_0".equals(tag)) {
          return new ItemSessionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_session is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSESSIONNOTE: {
        if ("layout/item_session_note_0".equals(tag)) {
          return new ItemSessionNoteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_session_note is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUSER: {
        if ("layout/item_user_0".equals(tag)) {
          return new ItemUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
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
      case  LAYOUT_LAYOUTNAVIGATIONDRAWER: {
        if ("layout/layout_navigation_drawer_0".equals(tag)) {
          return new LayoutNavigationDrawerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_navigation_drawer is invalid. Received: " + tag);
      }
      case  LAYOUT_OPTIONDIALOG: {
        if ("layout/option_dialog_0".equals(tag)) {
          return new OptionDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for option_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_PACKAGERENEWDIALOG: {
        if ("layout/package_renew_dialog_0".equals(tag)) {
          return new PackageRenewDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for package_renew_dialog is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(48);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "attachment");
      sKeys.put(3, "attachmentsAdapter");
      sKeys.put(4, "bailiffsAdapter");
      sKeys.put(5, "bailiffsData");
      sKeys.put(6, "baseViewModel");
      sKeys.put(7, "caseDetails");
      sKeys.put(8, "cases");
      sKeys.put(9, "casesAdapter");
      sKeys.put(10, "categoriesAdapter");
      sKeys.put(11, "categoriesData");
      sKeys.put(12, "clientCasesAdapter");
      sKeys.put(13, "clientProfileData");
      sKeys.put(14, "clients");
      sKeys.put(15, "clientsAdapter");
      sKeys.put(16, "clientsMainData");
      sKeys.put(17, "comingSessionsAdapter");
      sKeys.put(18, "contactUsRequest");
      sKeys.put(19, "homeData");
      sKeys.put(20, "homeReportersAdapter");
      sKeys.put(21, "itemViewModel");
      sKeys.put(22, "mainData");
      sKeys.put(23, "menuModel");
      sKeys.put(24, "menuViewModel");
      sKeys.put(25, "message");
      sKeys.put(26, "notes");
      sKeys.put(27, "notesAdapter");
      sKeys.put(28, "onBoardAdapter");
      sKeys.put(29, "onBoardViewModels");
      sKeys.put(30, "packagesAdapter");
      sKeys.put(31, "passingObject");
      sKeys.put(32, "prevSessionsAdapter");
      sKeys.put(33, "reportersData");
      sKeys.put(34, "reportsAdapter");
      sKeys.put(35, "reportsData");
      sKeys.put(36, "reportsMain");
      sKeys.put(37, "request");
      sKeys.put(38, "searchReportRequest");
      sKeys.put(39, "selectedBtn");
      sKeys.put(40, "sessionItem");
      sKeys.put(41, "sessionsAdapter");
      sKeys.put(42, "systemUserData");
      sKeys.put(43, "type");
      sKeys.put(44, "userPermissionsData");
      sKeys.put(45, "usersAdapter");
      sKeys.put(46, "usersMainData");
      sKeys.put(47, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(63);

    static {
      sKeys.put("layout/activity_base_0", te.app.evidence.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", te.app.evidence.R.layout.activity_main);
      sKeys.put("layout/download_dialog_0", te.app.evidence.R.layout.download_dialog);
      sKeys.put("layout/exit_layout_0", te.app.evidence.R.layout.exit_layout);
      sKeys.put("layout/fragment_add_attachment_0", te.app.evidence.R.layout.fragment_add_attachment);
      sKeys.put("layout/fragment_add_bailiffs_0", te.app.evidence.R.layout.fragment_add_bailiffs);
      sKeys.put("layout/fragment_add_case_0", te.app.evidence.R.layout.fragment_add_case);
      sKeys.put("layout/fragment_add_category_0", te.app.evidence.R.layout.fragment_add_category);
      sKeys.put("layout/fragment_add_client_0", te.app.evidence.R.layout.fragment_add_client);
      sKeys.put("layout/fragment_add_client_to_case_0", te.app.evidence.R.layout.fragment_add_client_to_case);
      sKeys.put("layout/fragment_add_note_0", te.app.evidence.R.layout.fragment_add_note);
      sKeys.put("layout/fragment_add_session_0", te.app.evidence.R.layout.fragment_add_session);
      sKeys.put("layout/fragment_add_user_0", te.app.evidence.R.layout.fragment_add_user);
      sKeys.put("layout/fragment_attachments_0", te.app.evidence.R.layout.fragment_attachments);
      sKeys.put("layout/fragment_bailiffs_0", te.app.evidence.R.layout.fragment_bailiffs);
      sKeys.put("layout/fragment_case_clients_0", te.app.evidence.R.layout.fragment_case_clients);
      sKeys.put("layout/fragment_case_details_0", te.app.evidence.R.layout.fragment_case_details);
      sKeys.put("layout/fragment_cases_0", te.app.evidence.R.layout.fragment_cases);
      sKeys.put("layout/fragment_categories_0", te.app.evidence.R.layout.fragment_categories);
      sKeys.put("layout/fragment_change_password_0", te.app.evidence.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_client_profile_0", te.app.evidence.R.layout.fragment_client_profile);
      sKeys.put("layout/fragment_clients_0", te.app.evidence.R.layout.fragment_clients);
      sKeys.put("layout/fragment_confirm_code_0", te.app.evidence.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contact_0", te.app.evidence.R.layout.fragment_contact);
      sKeys.put("layout/fragment_daily_reports_0", te.app.evidence.R.layout.fragment_daily_reports);
      sKeys.put("layout/fragment_edit_case_0", te.app.evidence.R.layout.fragment_edit_case);
      sKeys.put("layout/fragment_forget_password_0", te.app.evidence.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", te.app.evidence.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", te.app.evidence.R.layout.fragment_login);
      sKeys.put("layout/fragment_monthly_reports_0", te.app.evidence.R.layout.fragment_monthly_reports);
      sKeys.put("layout/fragment_onboard_0", te.app.evidence.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_packages_0", te.app.evidence.R.layout.fragment_packages);
      sKeys.put("layout/fragment_points_0", te.app.evidence.R.layout.fragment_points);
      sKeys.put("layout/fragment_profile_0", te.app.evidence.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", te.app.evidence.R.layout.fragment_register);
      sKeys.put("layout/fragment_reporter_details_0", te.app.evidence.R.layout.fragment_reporter_details);
      sKeys.put("layout/fragment_search_clients_0", te.app.evidence.R.layout.fragment_search_clients);
      sKeys.put("layout/fragment_session_notes_0", te.app.evidence.R.layout.fragment_session_notes);
      sKeys.put("layout/fragment_sessions_0", te.app.evidence.R.layout.fragment_sessions);
      sKeys.put("layout/fragment_splash_0", te.app.evidence.R.layout.fragment_splash);
      sKeys.put("layout/fragment_user_permission_0", te.app.evidence.R.layout.fragment_user_permission);
      sKeys.put("layout/fragment_users_0", te.app.evidence.R.layout.fragment_users);
      sKeys.put("layout/item_all_case_0", te.app.evidence.R.layout.item_all_case);
      sKeys.put("layout/item_attachment_0", te.app.evidence.R.layout.item_attachment);
      sKeys.put("layout/item_bailiffs_0", te.app.evidence.R.layout.item_bailiffs);
      sKeys.put("layout/item_case_0", te.app.evidence.R.layout.item_case);
      sKeys.put("layout/item_category_0", te.app.evidence.R.layout.item_category);
      sKeys.put("layout/item_client_search_0", te.app.evidence.R.layout.item_client_search);
      sKeys.put("layout/item_client_tags_0", te.app.evidence.R.layout.item_client_tags);
      sKeys.put("layout/item_clients_0", te.app.evidence.R.layout.item_clients);
      sKeys.put("layout/item_home_reporter_0", te.app.evidence.R.layout.item_home_reporter);
      sKeys.put("layout/item_note_0", te.app.evidence.R.layout.item_note);
      sKeys.put("layout/item_package_0", te.app.evidence.R.layout.item_package);
      sKeys.put("layout/item_replaced_points_0", te.app.evidence.R.layout.item_replaced_points);
      sKeys.put("layout/item_report_0", te.app.evidence.R.layout.item_report);
      sKeys.put("layout/item_session_0", te.app.evidence.R.layout.item_session);
      sKeys.put("layout/item_session_note_0", te.app.evidence.R.layout.item_session_note);
      sKeys.put("layout/item_user_0", te.app.evidence.R.layout.item_user);
      sKeys.put("layout/layout_action_bar_back_0", te.app.evidence.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.evidence.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_navigation_drawer_0", te.app.evidence.R.layout.layout_navigation_drawer);
      sKeys.put("layout/option_dialog_0", te.app.evidence.R.layout.option_dialog);
      sKeys.put("layout/package_renew_dialog_0", te.app.evidence.R.layout.package_renew_dialog);
    }
  }
}
