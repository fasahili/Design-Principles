package src.Controller;

import src.Report.Factory.BudgetFactory;
import src.Report.Factory.ReportFactory;

import java.util.ArrayList;
import java.util.List;

public class Director extends User {

    private List<Manager> managerList ;
    private List<Staff> directorStaffList ;
    public Director(int id, String name, int age, int hourlyRate, int numHoursPerMonthCompleted) {
        super(id, name, age, hourlyRate, numHoursPerMonthCompleted);
        this.managerList = new ArrayList<>();
        this.directorStaffList =new ArrayList<>();
    }
    public List<Manager> getManagerList() {
        return managerList;
    }
    public List<Staff> getDirectorStaffList() {
        return directorStaffList;
    }
    public void addManger(Manager manager){
        managerList.add(manager);
    }
    public void addStaff(Staff staff){
        directorStaffList.add(staff);
    }
    public void reportBudgetStaff(User user) {
        BudgetFactory.getReport("src.DataBase.Director").generateReportBudget(user);
    }
     public void reportStaff(User user){
        ReportFactory.getReport("src.DataBase.Director").generateStaffReport(user);
    }


}
