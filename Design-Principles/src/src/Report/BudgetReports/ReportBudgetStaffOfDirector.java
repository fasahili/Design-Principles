package src.Report.BudgetReports;

import src.Controller.Director;
import src.Controller.Manager;
import src.Controller.Staff;
import src.Controller.User;
import src.Report.Interface.IBudgetReport;

import java.util.List;

public class ReportBudgetStaffOfDirector implements IBudgetReport {

    @Override
    public void generateReportBudget(User user) {

        if (user instanceof Director director) {
            List<Staff> directorStaff = director.getDirectorStaffList();
            List<Manager> directorManager = director.getManagerList();
            double budgetStaff = 0;
            double budgetMangers = 0;
            for (Staff staff : directorStaff) {
                budgetStaff += staff.getHourlyRate() * staff.getNumHoursPerMonthCompleted();
            }
            for (Manager manager : directorManager) {
                budgetMangers += manager.getHourlyRate() * manager.getNumHoursPerMonthCompleted();
            }
            System.out.println("Budget from " +"(" +user.getName()+") staff " + " = " + budgetStaff );
            System.out.println("Budget from " +"(" +user.getName()+") Managers " + " = " + budgetMangers );
        }
        System.out.println(" ");



    }
}
