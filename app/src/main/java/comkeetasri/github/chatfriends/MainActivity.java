package comkeetasri.github.chatfriends;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout activity_main, chat_room, join_room, list_item, setting_room;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void joinRoom(View view) {
        Intent intent = new Intent(this, JoinChat.class);
        startActivity(intent);
    }

    public void createRoom(View view) {
        Intent create_intent = new Intent(this, CreateRoom.class);
        startActivity(create_intent);
    }

}
