package comkeetasri.github.chatfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 8.1 on 5/6/2560.
 */

public class CreateRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_room);

    }

    public void doneCreateRoom(View view) {
        Intent chat_room_intent = new Intent(this, ChatRoom.class);
        startActivity(chat_room_intent);
    }

}
