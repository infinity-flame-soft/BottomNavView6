package net.apkkothon.bottomnavigationview6;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //---initialize----------------
        bottomNavigationView=findViewById(R.id.bottom_navigation);

        //-----onClick--------------
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.men_fav:

                        Toast.makeText(MainActivity.this,"Clicled FAV",Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.men_music:
                        Toast.makeText(MainActivity.this,"Clicled MUSIC",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.men_sche:
                        Toast.makeText(MainActivity.this,"Clicled SCHEDULES",Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;

            }
        });


    }
}
