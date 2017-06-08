package comkeetasri.github.chatfriends.model;

import java.util.ArrayList;
import java.util.List;

public class ChatRepository {
    private List<ChatMessage> chat;
    private static ChatRepository instance = null;

    public static ChatRepository getInstance() {
        if(instance == null) {
            instance = new ChatRepository();

        }

        return instance;

    }

    private ChatRepository() {
        chat = new ArrayList<ChatMessage>();

    }

    private void sendMsg( String msg, String user ) {
        this.chat.add(new ChatMessage(msg, user) );

    }

    public List<ChatMessage> loadChat() {
        return chat;
    }

}
