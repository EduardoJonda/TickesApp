package tecsup.teoria04.eduardo.jonda.com.tickesapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityAdmi extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admi);

        //bottom

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomadmi_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_consulta:
                        Toast.makeText(MainActivityAdmi.this, "Go home section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_asignar:
                        Toast.makeText(MainActivityAdmi.this, "Go share section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_report:
                        Toast.makeText(MainActivityAdmi.this, "Go share section...", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        //1

        // Setear Toolbar como action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Set drawer toggle icon
        //    final ActionBar ab = getSupportActionBar();
        //    if (ab != null) {
        //      ab.setHomeAsUpIndicator(R.drawable.ic_profile);
        //      ab.setDisplayHomeAsUpEnabled(true);
        //   }

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, android.R.string.ok, android.R.string.cancel);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Set NavigationItemSelectedListener
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                // Do action by menu item id



                switch (menuItem.getItemId()){
                    case R.id.nav_perfil:
                        //   Toast.makeText(this, " ...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_config:
                        //Toast.makeText(HomeActivity.this, " ...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_cerrarsesion:
                        //Toast.makeText(HomeActivity.this, " ...", Toast.LENGTH_SHORT).show();
                        break;
                }

                // Close drawer
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;

            }
        });

        // Change navigation header information
        ImageView photoImage = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.menu_photo);
        photoImage.setBackgroundResource(R.drawable.ic_profile);

        TextView fullnameText = (TextView) navigationView.getHeaderView(0).findViewById(R.id.menu_fullname);
        fullnameText.setText("Admi Name ");

        TextView emailText = (TextView) navigationView.getHeaderView(0).findViewById(R.id.menu_email);
        emailText.setText("admi@tecsup.edu.pe");
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // Option open drawer
                if(!drawerLayout.isDrawerOpen(GravityCompat.START))
                    drawerLayout.openDrawer(GravityCompat.START);   // Open drawer
                else
                    drawerLayout.closeDrawer(GravityCompat.START);    // Close drawer
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}