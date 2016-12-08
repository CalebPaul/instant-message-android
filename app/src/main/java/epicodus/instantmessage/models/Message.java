package epicodus.instantmessage.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Guest on 12/7/16.
 */

@Parcel
public class Message {
    List<String> messageText = new ArrayList<>();
    String userId; //from firebase auth??
    Date timestamp;
    String messageId;

    public Message(){}


    public Message(List<String> messageText, String userId, Date timestamp, String messageId) {
        this.messageText = messageText;
        this.userId = userId;
        this.timestamp = timestamp;
        this.messageId = messageId;
    }

    public List<String> getMessageText() {
        return messageText;
    }

    public String getUserId() {
        return userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessageId() {
        return messageId;
    }
}
