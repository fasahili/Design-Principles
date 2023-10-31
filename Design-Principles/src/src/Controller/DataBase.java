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
    public User getUserById(int userId) {
        return userMap.get(userId);
    }

}
