package src.Controller;

import java.util.HashMap;
import java.util.Map;

class DataBase {
    private final Map<Integer, User> userMap = new HashMap<>();

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    private User getUserById(int userId) {
        return userMap.get(userId);
    }
    public  Director getDirector(int userId) {
       User user = getUserById(userId);
       return (Director) user;
    }
    public  Manager getManager(int userId) {
        User user = getUserById(userId);
        return (Manager) user;
    }

}
