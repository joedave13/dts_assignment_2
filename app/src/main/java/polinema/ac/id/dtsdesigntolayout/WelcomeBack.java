package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class WelcomeBack extends AppCompatActivity {

    // Deklarasi variabel editTextEmail dengan tipe EditText

    // Deklarasi variabel editTextPassword dengan tipe EditText


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        // Binding edt_txt_email ke variabel editTextEmail

        // Binding edt_txt_password ke variabel editTextPassword


    }

    public void clickForgot(View view) {
        Intent i = new Intent(WelcomeBack.this, ForgotPassword.class);
        startActivity(i);
    }

    public void postLogin(View view) {
        // Validasi input email dan password kosong

        // Validasi input email kosong

        // Validasi inputan tipe email

        // Validasi password kosong


        Intent i = new Intent(WelcomeBack.this, SuccessActivity.class);
        startActivity(i);

    }

    public void clickSignUp(View view) {
        // Panggil intent sign up
    }

}
