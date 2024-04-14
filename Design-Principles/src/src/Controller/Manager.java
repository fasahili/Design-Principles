package src.Controller;

import src.Report.Factory.BudgetFactory;
import src.Report.Factory.ReportFactory;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User {

    private List<Staff> mangerStaffList ;

    public Manager(int id, String name, int age, int hourlyRate, int numHoursPerMonthCompleted) {
        super(id, name, age, hourlyRate, numHoursPerMonthCompleted);
        mangerStaffList = new ArrayList<>();
    }
    public List<Staff> getMangerStaffList() {
        return mangerStaffList;
    }

    public void addStaff(Staff staff){
        mangerStaffList.add(staff);
    }

    public void reportBudgetStaff(User user){
        BudgetFactory.getReport("src.DataBase.Manager").generateReportBudget(user);
    }

    public void reportStaff(User user){
        ReportFactory.getReport("src.DataBase.Manager").generateStaffReport(user);

    }





}
