package src.Report.Factory;

import src.Report.StaffReports.ReportStaffOfDirector;
import src.Report.Interface.IStaffReport;
import src.Report.StaffReports.ReportStaffOfManager;

public class ReportFactory {
    public static IStaffReport getReport(String name) {

        if (name.equals("src.DataBase.Director")) {
            return new ReportStaffOfDirector();
        } else if (name.equals("src.DataBase.Manager")) {
            return new ReportStaffOfManager();
        }
        return null;
    }

}
