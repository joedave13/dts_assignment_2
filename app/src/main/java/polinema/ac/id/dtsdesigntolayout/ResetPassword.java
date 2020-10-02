package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText edtResetCode, edtPassword, edtConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        edtResetCode = (EditText) findViewById(R.id.edt_txt_code);
        edtPassword = (EditText) findViewById(R.id.edt_new_password);
        edtConfirmPassword = (EditText) findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        String resetCode = edtResetCode.getText().toString().trim();
        String newPassword = edtPassword.getText().toString().trim();
        String confirmPassword = edtConfirmPassword.getText().toString().trim();

        // Validasi kosong
        if (TextUtils.isEmpty(resetCode) && TextUtils.isEmpty(newPassword) && TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(view.getContext(), "Tidak boleh ada field yang kosong!", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(resetCode)) {
            Toast.makeText(view.getContext(), "Reset code tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(newPassword)) {
            Toast.makeText(view.getContext(), "New password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(view.getContext(), "Confirm password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if (!newPassword.equals(confirmPassword)) {
            Toast.makeText(view.getContext(), "New Password dan Confirm Password harus sama!", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
