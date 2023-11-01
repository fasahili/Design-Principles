# Company Management From User 

## Overview
This project provides a user management system. It allows you to manage different user roles, including Directors, managers and staff, and create different types of reports.

## Project Structure

### Controller
- `Controller.App`: The main class for the application, responsible for managing users and generating reports.
- `Controller.DataBase`: Manages the storage and retrieval of user objects in a database-like structure.
- `Controller.Director`: Represents a Director and includes methods for managing staff and generating reports.
- `Controller.Manager`: Represents a Manager and includes methods for managing staff and generating reports.
- `Controller.Staff`: Represents a Staff member with basic attributes.
- `Controller.User`: Represents a common user with shared attributes.

### Report

#### BudgetReports
- `Report.BudgetReports.ReportBudgetStaffOfDirector`: Generates budget reports for Directors.
- `Report.BudgetReports.ReportBudgetStaffOfManager`: Generates budget reports for Managers.

#### StaffReports
- `Report.StaffReports.ReportStaffOfDirector`: Generates staff reports for Directors.
- `Report.StaffReports.ReportStaffOfManager`: Generates staff reports for Managers.

#### Factory
- `Report.Factory.BudgetFactory`: Factory for creating instances of budget report generators.
- `Report.Factory.ReportFactory`: Factory for creating instances of staff report generators.

#### Interface
- `Report.Interface.IBudgetReport`: Defines the interface for generating budget reports.
- `Report.Interface.IStaffReport`: Defines the interface for generating staff reports.

## Notes
1) Director, Manager and staff classes extend user (inheritance) because user is a common class.
2) In a DataBase class there is a two function return Director and manager, To use in the app class only dataBase object.
3) BudgetFactory, ReportFactory They generated down to avoid make a concrete object at Director, Manager if want make report and  to avoid broken dependency inversion principle.
4) IBudgetReport, IStaffReport They generated down to avoid broken single responsibility principle.
5) ReportStaffOfDirector, ReportStaffOfManager, ReportBudgetStaffOfDirector, ReportBudgetStaffOfManager They generated down to avoid broken single responsibility principle.
6) (BudgetFactory, ReportFactory) and (IBudgetReport, IStaffReport) They generated and Worked and interact together to avoid broken open-closed principle.
