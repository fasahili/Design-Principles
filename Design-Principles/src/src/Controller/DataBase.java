package src.Controller;

import java.util.HashMap;
import java.util.Map;

class DataBase {
    private Map<Integer, User> userMap = new HashMap<>();
    public DataBase() {
        userMap = new HashMap<>();
    }
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    private User getUserById(int userId) {
        return userMap.get(userId);
    }
    public  Director getDirector(int userId) {
       User user = getUserById(userId);
        if (user instanceof Director director){
            return director;
        }
        else return null;
    }
    public  Manager getManager(int userId) {
        User user = getUserById(userId);
       if(user instanceof Manager manager){
            return manager;
       }
        else return null;
    }

}
