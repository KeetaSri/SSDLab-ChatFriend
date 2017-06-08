package comkeetasri.github.chatfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import comkeetasri.github.chatfriends.model.Account;

public class MainActivity extends AppCompatActivity {

    public static Account user;

    Button join_button, create_button;
    EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        join_button = (Button) findViewById(R.id.join_button);
        create_button = (Button) findViewById(R.id.create_button);
        inputName = (EditText) findViewById(R.id.inputUsr);

        join_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                user = new Account(inputName.toString());
                Intent intent = new Intent(getApplicationContext(), JoinChat.class);
                startActivity(intent);
            }
        });

        create_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                user = new Account(inputName.toString());
                Intent intent = new Intent(getApplicationContext(), CreateRoom.class);
                startActivity(intent);
            }
        });

    }

}
