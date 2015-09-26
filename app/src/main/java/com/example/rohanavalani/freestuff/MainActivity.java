package com.example.rohanavalani.freestuff;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;


public class MainActivity extends ActionBarActivity {
    EditText whatText;
    EditText whereText;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         whatText = (EditText) findViewById(R.id.whatText);
         whereText = (EditText) findViewById(R.id.whereText);
         submit = (Button) findViewById(R.id.buttonsubmit);
         submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String what = MainActivity.this.whatText.getText().toString().trim();
                String where = MainActivity.this.whereText.getText().toString().trim();
                if (what.equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("ERROR!").setMessage("Please enter what item")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else if (where.equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("ERROR!").setMessage("Please enter where item")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else {
//                    Intent intent = new Intent(MainActivity.this, classname.class);
//                    intent.putExtra("What", what);
//                    intent.putExtra("Where", where);
//                    //intent.putExtra("Description", description);
//                    startActivity(intent);
                }
            }
        });
    }

}
