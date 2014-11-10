package com.example.meurancho;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {

	EditText edtUser;
	EditText edtPassword;
	Button btnLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        edtUser = (EditText) findViewById(R.id.edtUser);
    	edtPassword = (EditText) findViewById(R.id.edtPassword);
    	btnLogin = (Button) findViewById(R.id.btnLogin);
    	btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String user = edtUser.getText().toString();
				String password = edtPassword.getText().toString();
				if(isValidLogin(user, password)){
					Intent i = new Intent(LoginActivity.this, MainActivity.class);
					i.putExtra("user", user);
					startActivity(i);
				}else{
					Toast.makeText(LoginActivity.this, "Usuário inválido, favor informar usuário válido", Toast.LENGTH_SHORT).show();
				}
			}
		});
    }
    
    private boolean isValidLogin(String userName, String passoword) {
		return true;
		//TODO: regra do login
	}
}
