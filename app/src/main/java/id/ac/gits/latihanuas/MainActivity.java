package id.ac.gits.latihanuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Maps(View view) {
        Uri link_map = Uri.parse("google.navigation:q=-5.4062137,105.2399914");
        Intent buka_maps = new Intent(Intent.ACTION_VIEW, link_map);
        startActivity(buka_maps);
    }

    public void Call(View view ) {
        String number = "+629519467617";
        Intent intent4 = new Intent(Intent.ACTION_CALL);
        intent4.setData(Uri.parse("tel:" + number));
        startActivity(intent4);
    }

    public void gotoGmail(View view) {
        String url = "https://mail.google.com/mail/";
        Intent openG = new Intent(Intent.ACTION_VIEW);
        openG.setData(Uri.parse(url));
        startActivity(openG);
    }

    public void gotoMap(View view) {
        String url = "https://www.google.co.id/maps/";
        Intent Maps = new Intent(Intent.ACTION_VIEW);
        Maps.setData(Uri.parse(url));
        startActivity(Maps);
    }

    public void Gmail(View view) {
        String[] TO = {"andiniwahyuningtiyas13@gmail.com"};
        Intent GmaillIntent = new Intent(Intent.ACTION_SEND);

        GmaillIntent.setData(Uri.parse("mailto:"));
        GmaillIntent.setType("message/rfc822");
        GmaillIntent.putExtra(Intent.EXTRA_EMAIL, TO);

        try {
            startActivity(Intent.createChooser(GmaillIntent, "Send mail..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void Console(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}