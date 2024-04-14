package src.Controller;

public class User {
    private int id;
    private  String name;
    private int age;
    private int hourlyRate;
    private int NumHoursPerMonthCompleted;

    public User(int id, String name, int age, int hourlyRate, int numHoursPerMonthCompleted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        NumHoursPerMonthCompleted = numHoursPerMonthCompleted;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public int getNumHoursPerMonthCompleted() {
        return NumHoursPerMonthCompleted;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setNumHoursPerMonthCompleted(int numHoursPerMonthCompleted) {
        NumHoursPerMonthCompleted = numHoursPerMonthCompleted;
    }

}
