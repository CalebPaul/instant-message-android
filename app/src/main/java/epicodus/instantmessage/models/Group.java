package epicodus.instantmessage.models;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Guest on 12/7/16.
 */

@Parcel
public class Group {
    String name;
    List<User> users;
    String groupId;

    public Group(){}


    public Group(String name, List<User> users, String groupId) {
        this.name = name;
        this.users = users;
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getGroupId() {
        return groupId;
    }
}
