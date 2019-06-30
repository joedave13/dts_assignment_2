package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    // Deklarasi EditText


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Binding EditText
    }

    public void postSendRequest(View view) {
        // Validasi email kosong

        // Validasi format email

        Intent i = new Intent(ForgotPassword.this, ResetPassword.class);
        startActivity(i);
    }

    /**
     * Email validation
     *
     * @param email : email input from editText
     * @return
     */

}
