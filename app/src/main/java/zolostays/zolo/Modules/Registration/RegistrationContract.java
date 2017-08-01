package zolostays.zolo.Modules.Registration;

import zolostays.zolo.BasePresenter;
import zolostays.zolo.BaseView;

/**
 * Created by mallikapriyakhullar on 01/08/17.
 */

public interface RegistrationContract {

    interface View extends BaseView<Presenter> {
        //errors
        void showErrorOnPhone();
        void showErrorOnPassword();
        void showErrorOnName();
        void showErrorOnEmail();

        //dialogs
        void showDialog();
        void dismissDialog();

        //flow
        void openLoginPage();
    }

    interface Presenter extends BasePresenter {
        //click events
        void registerClicked(String phone, String email, String name, String pass);
        void loginClicked();

        //input modification
        void inputModified(String phone, String email, String name, String pass);

    }
}