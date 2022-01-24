package steps;

import pages.AddNewEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage; //loginPage object
    public static DashboardPage dash; //dash object
    public  static AddNewEmployeePage addNewEmployeePage;
    public static EmployeeListPage employeeListPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();//i am initializing object
        dash = new DashboardPage();//When we create object with new keyword constructor is automatically been called
        addNewEmployeePage = new AddNewEmployeePage();
        employeeListPage = new EmployeeListPage();
    }
}
