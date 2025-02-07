package org.acme.models;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class message {

    public String message_id;

    @Column(nullable = false)
    public String sender;

    @Column(nullable = false)
    public String receiver;

    public int time_stamp;

    public  String content;

    public message() {}

    public message(String sender, String receiver, String content) {
        this.message_id = message_id;
        this.sender = sender;
        this.receiver = receiver;
        this.time_stamp = time_stamp;
        this.content = content;
    }
}
