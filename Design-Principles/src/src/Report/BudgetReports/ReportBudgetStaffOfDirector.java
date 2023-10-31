package src.Report.BudgetReports;

import src.Controller.Director;
import src.Controller.Staff;
import src.Controller.User;
import src.Report.Interface.IBudgetReport;

import java.util.List;

public class ReportBudgetStaffOfDirector implements IBudgetReport {

    @Override
    public void generateReportBudget(User user) {

        if (user instanceof Director director) {
            List<Staff> directorStaff = director.getDirectorStaffList();
            double budget = 0;
            for (Staff staff : directorStaff) {
                budget += staff.getHourlyRate() * staff.getNumHoursPerMonthCompleted();
            }
            System.out.println("Budget from " +"(" +user.getName()+") staff " + " = " + budget );
        } else System.out.println("Error");
        System.out.println(" ");



    }
}
