package epicodus.instantmessage.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 12/7/16.
 */

@Parcel
public class User {
    String name;
    String email;
    String userId;

    public User(){}

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }
}
