package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import org.jetbrains.annotations.Nullable;

public class user_info extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    TextView name,email,mob;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);
        name = findViewById(R.id.user_name);
        mob = findViewById(R.id.user_no);
        email = findViewById(R.id.user_email);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if(acct != null)
        {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            String personNo = acct.getId();
            name.setText(personName);
            email.setText(personEmail);
            mob.setText(personNo);package com.example.buxnexus;

import androidx.activity.result.contract.ActivityResultContracts;
import org.jetbrains.annotations.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import java.util.Arrays;

            public class login extends AppCompatActivity {



                AppCompatButton btn;

                GoogleSignInOptions gso;
                GoogleSignInClient gsc;
                //CallbackManager callbackManager;
                EditText enrolment;
                EditText password;



                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_login);

                    enrolment=(EditText)findViewById(R.id.Login_ID_NO);
                    password=(EditText)findViewById(R.id.Login_E_Pass);

                    btn = findViewById(R.id.gle_Btn_login);
                    gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
                    gsc = GoogleSignIn.getClient(this,gso);
                    GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);




                    if(acct!=null)
                    {
                        navigate();
                    }

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            signIn();
                        }
                    });









                    btn=findViewById(R.id.Login_Btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (enrolment.getText().toString().equals("2109680069") && password.getText().toString().equals("Soham1234")) {
                                Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                                startActivity(intent);
                            }


                            else if (enrolment.getText().toString().equals("2109680099") && password.getText().toString().equals("Adnan1234")) {
                                Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                                startActivity(intent);
                            }
                            else if (enrolment.getText().toString().equals("2109680073") && password.getText().toString().equals("Pranav1234")) {
                                Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                                startActivity(intent);
                            }
                            else if (enrolment.getText().toString().equals("2109680097") && password.getText().toString().equals("Karan1234")) {
                                Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                                startActivity(intent);
                            }
                            else if (enrolment.getText().toString().equals("2109680043") && password.getText().toString().equals("Atharv1234")) {
                                Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(com.example.buxnexus.login.this, "Please Enter Correct Enrollment No. or Password", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }



                void signIn() {
                    Intent signInIntent = gsc.getSignInIntent();
                    startActivityForResult(signInIntent,1000);

                }

                @Override
                protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
                    super.onActivityResult(requestCode, resultCode, data);
                    if(requestCode == 1000)
                    {
                        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                        try {
                            task.getResult(ApiException.class);
                            navigate();
                        } catch (ApiException e) {
                            Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_SHORT).show();
                        }

                    }


                }


                void navigate(){
                    finish();
                    Intent intent = new Intent(com.example.buxnexus.login.this, HomePage.class);
                    startActivity(intent);
                }




            }
        }

    }
}
