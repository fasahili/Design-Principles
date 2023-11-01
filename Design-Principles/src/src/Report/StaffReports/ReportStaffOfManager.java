package src.Report.StaffReports;

import src.Controller.Manager;
import src.Controller.Staff;
import src.Controller.User;
import src.Report.Interface.IStaffReport;

import java.util.List;

public class ReportStaffOfManager implements IStaffReport {
    @Override
    public void generateStaffReport(User user) {
        if (user instanceof Manager manager) {
            List<Staff> ManagerStaff = manager.getMangerStaffList();

            System.out.println("Manager : "+manager.getName());
            int i=0;
            for (Staff staff : ManagerStaff) {
                i++;
                System.out.print(i+") ");
                System.out.println( staff.getName()+ " - " + staff.getId());
            }
        }
        System.out.println(" ");
    }
}
