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
