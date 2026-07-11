package method;

public class LoginDashboardLogoutMethodCalling {
    void login(){
        System.out.println("Login page ");
        dashboard();
        System.out.println("sucessfully log out ");
    }    
    void dashboard(){
        System.out.println("Dash board page ");
        logout();
    }
    void logout(){
        System.out.println("Log out page ");
    }
}
class Test1{
    public static void main(String[] args) {
        LoginDashboardLogoutMethodCalling l=new LoginDashboardLogoutMethodCalling();
        l.login();
    }
}