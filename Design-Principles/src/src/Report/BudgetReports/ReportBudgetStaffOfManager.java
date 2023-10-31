package src.Report.BudgetReports;

import src.Controller.Manager;
import src.Controller.Staff;
import src.Controller.User;
import src.Report.Interface.IBudgetReport;

import java.util.List;

public class ReportBudgetStaffOfManager implements IBudgetReport {
    @Override
    public void generateReportBudget(User user) {
        if (user instanceof Manager manager) {
            List<Staff> managerStaff = manager.getMangerStaffList();
            double budget = 0;
            for (Staff staff : managerStaff) {
                budget += staff.getHourlyRate() * staff.getNumHoursPerMonthCompleted();
            }
            System.out.println("Budget from " +"(" +user.getName()+") staff " + " = "+ budget );
        } else System.out.println("Error");
        System.out.println(" ");
    }
}
