package sahin.onlinenoteapp.Settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import sahin.onlinenoteapp.MainActivity;
import sahin.onlinenoteapp.R;

public class SettingsActivity extends AppCompatActivity {
    TextView ClickFontSize;
    SharedPreferencesManager mSharedPrefManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ClickFontSize = findViewById(R.id.clickFontSize);
        mSharedPrefManager = new SharedPreferencesManager(this);

        ClickFontSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final PopupMenu popupMenu = new PopupMenu(SettingsActivity.this,v);
                popupMenu.getMenuInflater().inflate(R.menu.font_menu,popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if(item.getItemId() == (R.id.sp15)){
                            mSharedPrefManager.setVariable(15);
                            ClickFontSize.setText("Fontsize: 15");
                        }

                        if (item.getItemId() == (R.id.sp17)){
                            mSharedPrefManager.setVariable(17);
                            ClickFontSize.setText("Fontsize: 17");

                        }

                        if (item.getItemId() == (R.id.sp20)){
                            mSharedPrefManager.setVariable(20);
                            ClickFontSize.setText("Fontsize: 20");

                        }


                        return true;
                    }

                });

            }

        });









    }
}
