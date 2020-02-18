package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    String username = usernameInput.getText().toString();
    String name = nameInput.getText().toString();
    int age = Integer.parseInt(ageInput.getText().toString());

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
    }
}
