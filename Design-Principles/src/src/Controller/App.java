package src.Controller;

public class App {
        public static void main(String[] args) {
            System.out.println(" ");

            Director director = new Director(1, "John Doe", 45, 60, 160);

            Manager manager = new Manager(2, "Jane Smith", 35, 40, 150);

            Staff staff1 = new Staff(101, "Alice Johnson", 25, 20, 160);
            Staff staff2 = new Staff(102, "Bob Wilson", 28, 22, 160);
            Staff staff3 = new Staff(103, "Charlie Brown", 30, 25, 160);
            Staff staff4 = new Staff(103, "Naya John", 35, 25, 130);

            director.addStaff(staff1);
            director.addStaff(staff4);

            director.addManger(manager);

            manager.addStaff(staff2);
            manager.addStaff(staff3);


            DataBase dataBase = new DataBase();
            dataBase.addUser(director);
            dataBase.addUser(manager);
            dataBase.addUser(staff1);
            dataBase.addUser(staff2);
            dataBase.addUser(staff3);
            dataBase.addUser(staff4);

            dataBase.getDirector(1).reportBudgetStaff(director);
            dataBase.getDirector(1).reportStaff(director);


        }

}
