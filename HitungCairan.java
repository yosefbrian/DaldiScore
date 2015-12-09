@@ -0,0 +1,172 @@
package com.example.anakayam.daldiskor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.R.*;


public class HitungCairan extends AppCompatActivity {
    double skor = 0;
    double defisit = 0;
    int BB = 0;
    TextView tvHasil;
    EditText etBB;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_cairan);
        // ReplaceFont.replaceDefaultFont(this, "DEFAULT", "segoeuisl.ttf");
        //setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        etBB = (EditText) findViewById(R.id.editTextBB);
        btn = (Button) findViewById(R.id.ButtonHitung);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung();
            }
        });
    }

    public void selectItems(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.checkBoxHaus:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxTD6090:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxTDkurang60:
                if(checked){
                    skor = skor + 2;
                }
                break;

            case R.id.checkBoxNadi:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxApatis:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxSomnolen:
                if(checked){
                    skor = skor + 2;
                }
                break;

            case R.id.checkBoxNafas:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxFacies:
                if(checked){
                    skor = skor + 2;
                }
                break;

            case R.id.checkBoxVox:
                if(checked){
                    skor = skor + 2;
                }
                break;

            case R.id.checkBoxTurgor:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxWasher:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxEkstrem:
                if(checked){
                    skor = skor + 1;
                }
                break;

            case R.id.checkBoxSianosis:
                if(checked){
                    skor = skor + 2;
                }
                break;

            case R.id.checkBoxUmur50:
                if(checked){
                    skor = skor - 1;
                }
                break;

            case R.id.checkBoxUmur60:
                if(checked){
                    skor = skor - 2;
                }
                break;
        }
    }
    public void  Hitung() {

        BB = Integer.parseInt(etBB.getText().toString());
        defisit = skor/15*BB*100;

        tvHasil.setText(Double.toString(defisit));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hitung_cairan, menu);
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
