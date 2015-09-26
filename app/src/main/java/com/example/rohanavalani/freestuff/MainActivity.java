package com.example.rohanavalani.freestuff;

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
                    builder.setTitle("ERROR!");
                    builder.setMessage("Please enter what item");
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else if (where.equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("ERROR!");
                    builder.setMessage("Please enter where item");
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
