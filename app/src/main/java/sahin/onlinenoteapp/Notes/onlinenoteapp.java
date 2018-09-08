package sahin.onlinenoteapp.Notes;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class onlinenoteapp extends Application

{
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
