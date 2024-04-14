package src.Report.Factory;

import src.Report.BudgetReports.ReportBudgetStaffOfDirector;
import src.Report.Interface.IBudgetReport;
import src.Report.BudgetReports.ReportBudgetStaffOfManager;

public class BudgetFactory {
    public static IBudgetReport getReport(String name) {

        if (name.equals("src.DataBase.Director")) {
            return new ReportBudgetStaffOfDirector();
        } else if (name.equals("src.DataBase.Manager")) {
            return new ReportBudgetStaffOfManager();
        }
        return null;
    }
}
