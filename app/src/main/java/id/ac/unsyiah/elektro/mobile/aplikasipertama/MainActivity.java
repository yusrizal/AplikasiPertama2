package id.ac.unsyiah.elektro.mobile.aplikasipertama;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onCLickBtnTerjemahInd(View view) {
        TextView textView = (TextView) findViewById(R.id.txtTulisan);
        String apaKabar = getString(R.string.apakabar_dunia);
        textView.setText(apaKabar);
    }
    public void onClickBtnTerjemahEng (View view) {
        TextView textView = (TextView) findViewById(R.id.txtTulisan);
        String helloWorld = getString(R.string.hello_world);
        textView.setText(helloWorld);
    }
    public void onClickBtnTerjemahAch(View view) {
        TextView textView = (TextView) findViewById(R.id.txtTulisan);
        String peuHaba = getString(R.string.peuhaba_donya);
        textView.setText(peuHaba);
    }
}


