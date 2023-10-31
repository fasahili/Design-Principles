package src.Report.StaffReports;

import src.Controller.Director;
import src.Controller.Staff;
import src.Controller.User;
import src.Report.Interface.IStaffReport;

import java.util.List;

public class ReportStaffOfDirector implements IStaffReport {

    @Override
    public void generateStaffReport(User user) {

        if (user instanceof Director director) {
            List<Staff> directorStaff = director.getDirectorStaffList();

            System.out.println("Director : "+director.getName());
            int i=0;
            for (Staff staff : directorStaff) {
                i++;
                System.out.print(i+") ");
                System.out.println( staff.getName()+ " - " + staff.getId());
            }
        } else {
            System.out.println("Error massage");

        }
        System.out.println(" ");




    }
}
