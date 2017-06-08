package comkeetasri.github.chatfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import comkeetasri.github.chatfriends.model.ChatMessage;

/**
 * Created by 8.1 on 5/6/2560.
 */

public class ChatRoom extends AppCompatActivity {

    ArrayAdapter<ChatMessage> listadapter;

    FloatingActionButton fab;
    EditText input;
    ListView chatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_room);

        fab = (FloatingActionButton)findViewById(R.id.fab);
        input = (EditText)findViewById(R.id.input);
        chatList = (ListView) findViewById(R.id.listMessage);

        listadapter = new ArrayAdapter<ChatMessage>(this, android.R.layout.simple_list_item_1, CreateRoom.myRoom.getMylist());
        chatList.setAdapter(listadapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
