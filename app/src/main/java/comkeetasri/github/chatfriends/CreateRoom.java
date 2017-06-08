package comkeetasri.github.chatfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import comkeetasri.github.chatfriends.model.Chat;

/**
 * Created by 8.1 on 5/6/2560.
 */

public class CreateRoom extends AppCompatActivity {

    public static Chat myRoom ;

    EditText inputName, inputPass;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_room);

        inputName = (EditText) findViewById(R.id.input_room_text);
        inputPass = (EditText) findViewById(R.id.room_password_input);
        done = (Button) findViewById(R.id.done_create_button);

        done.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myRoom = new Chat();
                Intent i = new Intent(getApplicationContext(), ChatRoom.class);
                startActivity(i);

            }
        });

    }

}
