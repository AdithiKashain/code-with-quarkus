package org.acme.models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class user {

    public String user_id;

    @Column(nullable = false)
    public String username;

    @Column(nullable = false)
    public String password;

	public List<String> message_ids;


    public user() {}

    public user(String user_id, String username, String password, List<String> message_ids) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.message_ids = message_ids;
    }

	public void add_message(String message_id) {
		this.message_ids.add(message_id);
	}
}
