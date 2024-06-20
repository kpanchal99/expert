
// ===================================================================================================

/*<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/alert"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Show Cities"
        android:layout_marginBottom="20dp" />

    <TextView
        android:id="@+id/output"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Cities will be displayed here"
        android:layout_marginBottom="20dp" />

</LinearLayout>
*/
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertDialogBox extends AppCompatActivity {

    Button alert;
    AlertDialog alertDialog;
    TextView output;
    StringBuilder sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_box);

        Resources res = getResources();
        String[] cities = res.getStringArray(R.array.city);

        sb = new StringBuilder();

        alert = findViewById(R.id.alert);
        output = findViewById(R.id.output);

        for (String city : cities) {
            sb.append("\n").append(city);
        }

        output.setText(sb.toString());

        alertDialog = new AlertDialog.Builder(this).create();

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setTitle("ALERT BOX-");
                alertDialog.setMessage(sb.toString());
                alertDialog.setCancelable(true);

                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertDialog.dismiss();
                    }
                });

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onStart();
                    }
                });
                alertDialog.show();
            }
        });
    }
}
// Calculator===================================================================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Calculator">


    <EditText
        android:id="@+id/num1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.307" />

    <EditText
        android:id="@+id/num2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/operation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:ems="10"
        android:inputType="text"
        android:hint="operation"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.4" />

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.704" />
</androidx.constraintlayout.widget.ConstraintLayout>
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button btn;
    EditText num1, num2, operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn = findViewById(R.id.btn);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        operation = findViewById(R.id.operation);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op = operation.getText().toString();
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                if(op.equals("+")){
                    Toast.makeText(getApplicationContext(), "Addition of num " + ( n1 + n2),Toast.LENGTH_LONG).show();
                } else if (op.equals("-")) {
                    Toast.makeText(getApplicationContext(), "Addition of num " + ( n1 - n2),Toast.LENGTH_LONG).show();
                } else if (op.equals("%")) {
                    Toast.makeText(getApplicationContext(), "Addition of num " + ( n1 % n2),Toast.LENGTH_LONG).show();
                } else if (op.equals("*")) {
                    Toast.makeText(getApplicationContext(), "Addition of num " + ( n1 * n2),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Select correct operator",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}


// Data helper===================================================================================================
package com.example.sem2project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mca202325.db";
    private static final String TABLE_NAME = "MCAFY";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase database;

    public DataHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        database = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                "rollno INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "email TEXT, " +
                "password TEXT, " +
                "cid TEXT, " +
                "course TEXT, " +
                "city TEXT)";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // Handle database upgrade as needed
    }

    public boolean insertUser(String email, String pwd, String cid, String course, String city) {
        ContentValues cv = new ContentValues();
        cv.put("email", email);
        cv.put("password", pwd);
        cv.put("cid", cid);
        cv.put("course", course);
        cv.put("city", city);
        long res = database.insert(TABLE_NAME, null, cv);
        return res != -1;
    }

    public Cursor showRecords() {
        return database.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }

    public Cursor searchRecord(int rollno) {
        return database.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE rollno=" + rollno, null);
    }

    public boolean updateRecord(int rollno, String email, String pwd, String cid, String course, String city) {
        ContentValues cv = new ContentValues();
        cv.put("email", email);
        cv.put("password", pwd);
        cv.put("cid", cid);
        cv.put("course", course);
        cv.put("city", city);
        long res = database.update(TABLE_NAME, cv, "rollno=?", new String[]{String.valueOf(rollno)});
        return res != -1;
    }

    public boolean deleteRecord(int rollno) {
        long res = database.delete(TABLE_NAME, "rollno=?", new String[]{String.valueOf(rollno)});
        return res != -1;
    }
}
// Email Intent===================================================================================================
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class EmailIntent extends AppCompatActivity {

    EditText to, cc, subject, body;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_intent);

        to = findViewById(R.id.to);
        cc = findViewById(R.id.cc);
        subject = findViewById(R.id.subject);
        body = findViewById(R.id.body);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{to.getText().toString()});
                mail.putExtra(Intent.EXTRA_CC, new String[]{cc.getText().toString()});
                mail.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                mail.putExtra(Intent.EXTRA_TEXT, body.getText().toString());

                mail.setType("message/rfc822");
                startActivity(Intent.createChooser(mail, "Select email client"));
            }
        });
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/to"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="To"
        android:inputType="textEmailAddress"
        android:layout_marginBottom="10dp"/>

    <EditText
        android:id="@+id/cc"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="CC"
        android:inputType="textEmailAddress"
        android:layout_marginBottom="10dp"/>

    <EditText
        android:id="@+id/subject"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Subject"
        android:inputType="text"
        android:layout_marginBottom="10dp"/>

    <EditText
        android:id="@+id/body"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Body"
        android:inputType="textMultiLine"
        android:gravity="top"
        android:minLines="5"
        android:layout_marginBottom="20dp"/>

    <Button
        android:id="@+id/send"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Send Email" />

</LinearLayout>
// Toolbar===================================================================================================
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".HomePage">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="?attr/colorPrimary"
        app:titleTextColor="@color/white"
        style="@style/BoldTextStyle"
        android:minHeight="?attr/actionBarSize"
        android:theme="?attr/actionBarTheme" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="20dp"
        android:orientation="vertical">
        <androidx.appcompat.widget.SearchView
            android:id="@+id/search_view"
            android:layout_margin="8dp"
            android:layout_width="match_parent"
            android:layout_height="60dp">

        </androidx.appcompat.widget.SearchView>

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/recycler_main"
            android:layout_margin="8dp"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

        </androidx.recyclerview.widget.RecyclerView>
    </LinearLayout>

    <!--    <ListView-->
<!--        android:layout_width="match_parent"-->
<!--        android:layout_height="match_parent"-->
<!--        android:id="@+id/listview"/>-->
</LinearLayout>
package com.example.sem2project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class HomePage extends AppCompatActivity implements SelectListener {


    Toolbar toolbar;
    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomListAdapter customListAdapter;

    SearchView searchView;

    HashMap<String, String> activitiesMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        searchView = findViewById(R.id.search_view);

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String username = settings.getString("username", "defaultUsername");

        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        // Set toolbar title
        getSupportActionBar().setTitle("Welcome, "+username);

        //show list
        displayItems();

        getActivityList();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });
    }

    private void getActivityList() {
        // Get the string array from resources
        String[] activitiesArray = getResources().getStringArray(R.array.activities);

        // Initialize a HashMap to store the key-value pairs
        activitiesMap = new HashMap<>();

        // Parse the string array to fill the HashMap
        for (String activity : activitiesArray) {
            String[] keyValue = activity.split(",");
            if (keyValue.length == 2) {
                activitiesMap.put(keyValue[0], keyValue[1]);
            }
        }

        // Now you can use the HashMap as needed
        // For example, printing the values
//        for (Map.Entry<String, String> entry : activitiesMap.entrySet()) {
//            Log.d("ActivityMap", "Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
        // Get the values from the HashMap
//        List<String> activityValues = new ArrayList<>(activitiesMap.values());
//
//        // Create an ArrayAdapter using the values list
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, activityValues);
//
//        // Assuming you have a ListView with id 'listView'
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(arrayAdapter);
    }

    private void filter(String newText) {
        List<MyModel> filterList = new ArrayList<>();
        for(MyModel item : myModelList){
            if(item.getTitle().toLowerCase().contains(newText.toLowerCase())){
                 filterList.add(item);
            }
        }

        //send to adapter
        customListAdapter.filterList(filterList);
    }

    private void displayItems(){
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myModelList = new ArrayList<>();

        myModelList.add(new MyModel("Change Wallpaper",SetWallpaper.class));
//        myModelList.add(new MyModel("ToastExample","toastExample"));
        myModelList.add(new MyModel("Calculator",Calculator.class));
        myModelList.add(new MyModel("Implicit Intent",ImplicitIntent.class));
        myModelList.add(new MyModel("Multiple Intent",MultipleIntentInOne.class));
        myModelList.add(new MyModel("Email Intent",EmailIntent.class));
        myModelList.add(new MyModel("Explicit Intent",ExplicitIntentExample.class));
        myModelList.add(new MyModel("AlertDialog Box",AlertDialogBox.class));
        myModelList.add(new MyModel("SQLLiteDB - CRUD",SQLLite_CRUD.class));
        myModelList.add(new MyModel("UI Controls",UI_Controls.class));
//        myModelList.add(new MyModel("Menu",MenuExample.class));
//        myModelList.add(new MyModel("Internationalization and Localise","12"));
//        myModelList.add(new MyModel("firebaseExample","firebaseExample"));

        customListAdapter = new CustomListAdapter(this, myModelList, this);
        recyclerView.setAdapter(customListAdapter);
    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, myModel.getTitle(), Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(getApplicationContext(), myModel.getActivityName());
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            // remove preference
            // Handle logout
            startActivity(new Intent(HomePage.this, MainActivity.class));
            finish();
            return true;
        } else if (id == R.id.action_about) {
            // Show about dialog
            showAboutDialog();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    private void showAboutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("About");
        builder.setMessage("This is Learn Android App.\n Android Project - Sem 2\n" +
                "Karan Panchal  \n" +
                "MCA \n" +
                "KJSIM \n");
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
// ===================================================================================================
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_margin="10dp"
    android:orientation="vertical"
    tools:context=".ImplicitIntent">

    <!-- Wallpaper Section -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="50dp"
        android:gravity="center_vertical">

        <TextView
            android:id="@+id/textView2"
            android:layout_width="0dp"
            android:layout_height="60dp"
            android:layout_weight="1"
            android:text="Choose Wallpaper"
            android:textAlignment="center" />

        <ImageButton
            android:id="@+id/wp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:srcCompat="@android:drawable/ic_menu_add" />
    </LinearLayout>

    <!-- URL Section -->
    <EditText
        android:id="@+id/url"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter URL"
        android:inputType="textUri"
        android:layout_marginTop="20dp"/>

    <ImageButton
        android:id="@+id/ws"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:src="@android:drawable/ic_menu_view"
        android:layout_marginTop="10dp"/>

    <!-- Dial Section -->
    <EditText
        android:id="@+id/num"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Phone Number"
        android:inputType="phone"
        android:layout_marginTop="20dp"/>

    <ImageButton
        android:id="@+id/dial"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:src="@android:drawable/ic_menu_call"
        android:layout_marginTop="10dp"/>

    <!-- Map Section -->
    <EditText
        android:id="@+id/loc"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Location"
        android:inputType="text"
        android:layout_marginTop="20dp"/>

    <ImageButton
        android:id="@+id/map"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:src="@android:drawable/ic_menu_mapmode"
        android:layout_marginTop="10dp"/>

</LinearLayout>
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ImplicitIntent extends AppCompatActivity {

    ImageButton wp, ws, dial, map;
    EditText url,num,loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        ws = findViewById(R.id.ws);
        url = findViewById(R.id.url);
        num = findViewById(R.id.num);
        dial =findViewById(R.id.dial);
        map = findViewById(R.id.map);
        loc = findViewById(R.id.loc);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=" + loc.getText().toString()));
                startActivity(mapIntent);
            }
        });
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dialer = new Intent(Intent.ACTION_DIAL);
                dialer.setData(Uri.parse("tel:"+num.getText().toString()));
                startActivity(dialer);
            }
        });
        ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url.getText().toString()));
                startActivity(i);
            }
        });


        wp = findViewById(R.id.wp);
        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changewp = new Intent(Intent.ACTION_SET_WALLPAPER);
                startActivity(Intent.createChooser(changewp,"Select wallpaper"));

            }
        });
    }

}
// Login Localisation===================================================================================================
package com.example.sem2project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button signUpRedirectBtn,loginBtn,languageButton;
    EditText loginEmail,loginPwd;
    FirebaseAuth firebaseAuth;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadLocale();
        alertDialog = new AlertDialog.Builder(this);

        //Button
        loginBtn = findViewById(R.id.loginBtn);
        signUpRedirectBtn = findViewById(R.id.signUpRedirectBtn);
        languageButton = findViewById(R.id.languageButton);
        //EditText
        loginEmail = findViewById(R.id.loginEmail);
        loginPwd = findViewById(R.id.loginPwd);

        firebaseAuth = FirebaseAuth.getInstance();

        signUpRedirectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // redirect to signup activity
                Intent intent = new Intent(MainActivity.this, Sign_Up.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = settings.edit();
//                editor.putString("username", loginEmail.getText().toString().split("@gmail\\.com")[0]);
//                editor.apply(); // Apply the changes (alternatively, you can use commit())
//
//                Intent intent = new Intent(MainActivity.this, HomePage.class);
//                startActivity(intent);
                loginUser();
            }
        });
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] languages = {"English","हिंदी","मराठी","ગુજરાતી"};

                alertDialog.setSingleChoiceItems(languages, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int langId) {
                        if (langId==0){
                            setLocale("en");
                            recreate();
                        }else if (langId==1){
                            setLocale("hi");
                            recreate();
                        } else if (langId==2) {
                            setLocale("mr");
                            recreate();
                        } else if (langId==3) {
                            setLocale("gu");
                        }
                    }
                });
                alertDialog.create();
                alertDialog.show();


            }
        });

    }



    public void loginUser(){

        String email = loginEmail.getText().toString();
        String pwd = loginPwd.getText().toString();

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(pwd)){
            Toast.makeText(this, "Please fill values!!", Toast.LENGTH_SHORT).show();
            return;
        }
        //check password in firebase
        firebaseAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    // redirect to home activity admin123

                    SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("username", loginEmail.getText().toString().split("@gmail\\.com")[0]);
                    editor.apply();


                    Intent intent = new Intent(MainActivity.this, HomePage.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Try Again!!..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    private void setLocale (String lang) {
        Locale locale = new Locale (lang);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());

        SharedPreferences. Editor editor = getSharedPreferences (  "Settings", MODE_PRIVATE).edit();
        editor.putString("mylang", lang);
        editor.apply();
    }

    private void loadLocale(){
        SharedPreferences sharedPreferences = getSharedPreferences ( "Settings", MODE_PRIVATE);
        String lang = sharedPreferences.getString( "mylang", "");
        setLocale (lang);
    }

}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_margin="25dp"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fontFamily="monospace"
        android:text="@string/login_title"
        android:textAlignment="center"
        android:textSize="34sp"
        android:textStyle="bold"
        android:layout_marginVertical="100dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/loginEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="@string/login_email"
        android:layout_marginVertical="20dp"
        android:inputType="textEmailAddress" />

    <EditText
        android:id="@+id/loginPwd"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="@string/login_pwd"
        android:layout_marginVertical="20dp"
        android:inputType="textPassword" />


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginVertical="20dp"
        android:orientation="horizontal"
        android:layout_gravity="center_horizontal">

        <Button
            android:id="@+id/loginBtn"
            android:layout_width="155dp"
            android:layout_height="wrap_content"
            android:text="@string/login" />

        <Button
            android:id="@+id/signUpRedirectBtn"
            android:layout_width="163dp"
            android:layout_height="wrap_content"
            android:text="@string/signup" />


    </LinearLayout>

    <Button
        android:id="@+id/languageButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="@string/choose_language"
        android:layout_marginHorizontal="50dp"/>
</LinearLayout>
// Multiple intent===================================================================================================
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Bundle;

public class MultipleIntentInOne extends AppCompatActivity {
    Button actionButton;
    EditText inputField;
    Bundle received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_intent_in_one);

        actionButton = findViewById(R.id.actionButton);
        inputField = findViewById(R.id.inputField);
        received = getIntent().getExtras();

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInputAction(inputField.getText().toString());
            }
        });
    }

    private void handleInputAction(String input) {
        if (TextUtils.isEmpty(input)) {
            Toast.makeText(this, "Input is empty", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isDigitsOnly(input)) {
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
            phoneIntent.setData(Uri.parse("tel:" + input));
            startActivity(phoneIntent);
        } else if (input.startsWith("map:")) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW);
            mapIntent.setData(Uri.parse("geo:0,0?q=" + input.substring(4)));
            startActivity(mapIntent);
        } else if (input.contains("www") || input.contains("http")) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse(input));
            startActivity(webIntent);
        } else {
            Intent webSearchIntent = new Intent(Intent.ACTION_VIEW);
            webSearchIntent.setData(Uri.parse("https://www.google.com/search?q=" + input));
            startActivity(webSearchIntent);
        }
    }

}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <!-- Wallpaper Section -->

    <!-- Input Section -->
    <EditText
        android:id="@+id/inputField"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter input (URL, phone, map:location)"
        android:inputType="text" />

    <Button
        android:id="@+id/actionButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Perform Action"
        android:layout_marginTop="20dp" />

</LinearLayout>
// Wallpaper===================================================================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SetWallpaper">

    <ImageButton
        android:id="@+id/wp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@android:drawable/ic_menu_add" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="130dp"
        android:layout_height="60dp"
        android:text="Choose Wallpaper"
        android:textAlignment="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.39" />
</androidx.constraintlayout.widget.ConstraintLayout>
package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SetWallpaper extends AppCompatActivity {

    ImageButton wp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);
        wp = findViewById(R.id.wp);
        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changewp = new Intent(Intent.ACTION_SET_WALLPAPER);
                startActivity(Intent.createChooser(changewp,"Select wallpaper"));

            }
        });
    }
}
// UI Controls===================================================================================================

package com.example.sem2project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class UI_Controls extends AppCompatActivity {

    AutoCompleteTextView cityAutoCompleteTextView;
    MultiAutoCompleteTextView degreeAutoCompleteTextView;
    EditText dobEditText;
    CheckBox sscCheckBox, hscCheckBox, ugCheckBox;
    RadioGroup mealPreferenceRadioGroup;
    Spinner universitySpinner;
    Button registerButton;
    TextView detailsTextView;
    StringBuilder output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_controls);

        cityAutoCompleteTextView = findViewById(R.id.city);
        degreeAutoCompleteTextView = findViewById(R.id.degree);
        dobEditText = findViewById(R.id.dob);
        sscCheckBox = findViewById(R.id.ssc);
        hscCheckBox = findViewById(R.id.hsc);
        ugCheckBox = findViewById(R.id.ug);
        mealPreferenceRadioGroup = findViewById(R.id.rg);
        universitySpinner = findViewById(R.id.university);
        registerButton = findViewById(R.id.register);
        detailsTextView = findViewById(R.id.details);

        // Set up AutoCompleteTextView for cities
        String[] cities = getResources().getStringArray(R.array.city);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cities);
        cityAutoCompleteTextView.setAdapter(cityAdapter);

        // Set up MultiAutoCompleteTextView for degrees
        String[] degrees = getResources().getStringArray(R.array.degree);
        ArrayAdapter<String> degreeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, degrees);
        degreeAutoCompleteTextView.setAdapter(degreeAdapter);
        degreeAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        // Set up Spinner for universities
        String[] universities = getResources().getStringArray(R.array.university);
        ArrayAdapter<String> universityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, universities);
        universityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        universitySpinner.setAdapter(universityAdapter);

        output = new StringBuilder();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerButtonClick();
            }
        });
    }

    private void registerButtonClick() {
        output.setLength(0);
        output.append("Registration Details:\n");

        //  city
        String city = cityAutoCompleteTextView.getText().toString();
        output.append("City: ").append(city).append("\n");

        // degrees
        String degrees = degreeAutoCompleteTextView.getText().toString();
        output.append("Degrees: ").append(degrees).append("\n");

        //  DOB
        String dob = dobEditText.getText().toString();
        output.append("Date of Birth: ").append(dob).append("\n");

        // education
        output.append("Education Levels: ");
        if (sscCheckBox.isChecked()) output.append("SSC ");
        if (hscCheckBox.isChecked()) output.append("HSC ");
        if (ugCheckBox.isChecked()) output.append("UG ");
        output.append("\n");

        // food
        int selectedMealId = mealPreferenceRadioGroup.getCheckedRadioButtonId();
        String mealPreference = "";
        if (selectedMealId == R.id.veg) mealPreference = "Veg";
        else if (selectedMealId == R.id.non_veg) mealPreference = "Non-Veg";
        else if (selectedMealId == R.id.both) mealPreference = "Both";
        output.append("Meal Preference: ").append(mealPreference).append("\n");

        // university
        String university = universitySpinner.getSelectedItem().toString();
        output.append("University: ").append(university).append("\n");

        // show
        detailsTextView.setText(output.toString());
    }
}
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <AutoCompleteTextView
        android:id="@+id/city"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="City" />

    <MultiAutoCompleteTextView
        android:id="@+id/degree"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/city"
        android:hint="Degree"/>

    <EditText
        android:id="@+id/dob"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/degree"
        android:hint="Date of Birth"
        android:inputType="date" />

    <CheckBox
        android:id="@+id/ssc"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/dob"
        android:layout_alignParentStart="true"
        android:layout_marginStart="48dp"
        android:layout_marginTop="2dp"
        android:text="SSC" />

    <CheckBox
        android:id="@+id/hsc"
        android:layout_width="76dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/ssc"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="-50dp"
        android:layout_marginEnd="164dp"
        android:text="HSC" />

    <CheckBox
        android:id="@+id/ug"
        android:layout_width="86dp"
        android:layout_height="37dp"
        android:layout_below="@id/hsc"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="263dp"
        android:layout_marginTop="-52dp"
        android:layout_marginEnd="46dp"
        android:text="UG" />

    <RadioGroup
        android:id="@+id/rg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/ug"
        android:orientation="horizontal"
        android:layout_marginTop="6dp">

        <RadioButton
            android:id="@+id/veg"
            android:layout_width="118dp"
            android:layout_height="wrap_content"
            android:text="Veg" />

        <RadioButton
            android:id="@+id/non_veg"
            android:layout_width="147dp"
            android:layout_height="wrap_content"
            android:text="Non-Veg" />

        <RadioButton
            android:id="@+id/both"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Both" />
    </RadioGroup>

    <Spinner
        android:id="@+id/university"
        android:layout_width="382dp"
        android:layout_height="42dp"
        android:layout_below="@id/rg"
        android:hint="University" />

    <Button
        android:id="@+id/register"
        android:layout_width="136dp"
        android:layout_height="46dp"
        android:layout_below="@id/university"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="128dp"
        android:layout_marginTop="-1dp"
        android:layout_marginEnd="131dp"
        android:text="Register" />

    <TextView
        android:id="@+id/details"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/register"
        android:text="Details"
        android:textAppearance="?android:textAppearanceLarge" />
</RelativeLayout>
// SQL Lite===================================================================================================


<?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
    tools:context=".SQLLite_CRUD">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="168dp"
            android:layout_marginEnd="166dp"
            android:layout_marginBottom="662dp"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <Button
            android:id="@+id/register"
            android:layout_width="158dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="201dp"
            android:layout_marginBottom="174dp"
            android:text="Register" />

        <EditText
            android:id="@+id/email"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="100dp"
            android:layout_marginBottom="523dp"
            android:ems="10"
            android:hint="Enter Email"
            android:inputType="textEmailAddress" />

        <EditText
            android:id="@+id/pwd"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="98dp"
            android:layout_marginBottom="469dp"
            android:ems="10"
            android:hint="Enter Password"
            android:inputType="textPassword" />

        <Button
            android:id="@+id/show"
            android:layout_width="148dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="41dp"
            android:layout_marginBottom="173dp"
            android:text="Show" />

        <Button
            android:id="@+id/search"
            android:layout_width="161dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="201dp"
            android:layout_marginBottom="117dp"
            android:text="Search" />

        <EditText
            android:id="@+id/rollno"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="101dp"
            android:layout_marginBottom="584dp"
            android:ems="10"
            android:inputType="number"
            android:hint="Enter RollNo"/>

        <Button
            android:id="@+id/clear"
            android:layout_width="146dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="44dp"
            android:layout_marginBottom="113dp"
            android:text="Clear" />

        <EditText
            android:id="@+id/cid"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="93dp"
            android:layout_marginBottom="410dp"
            android:ems="10"
            android:inputType="text"
            android:hint="CourseID" />

        <EditText
            android:id="@+id/course"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="100dp"
            android:layout_marginBottom="345dp"
            android:ems="10"
            android:inputType="text"
            android:hint="Course Name" />

        <EditText
            android:id="@+id/city"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="101dp"
            android:layout_marginBottom="285dp"
            android:ems="10"
            android:inputType="text"
            android:hint="City" />

        <Button
            android:id="@+id/update"
            android:layout_width="152dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="208dp"
            android:layout_marginBottom="57dp"
            android:text="Update" />

        <Button
            android:id="@+id/delete"
            android:layout_width="150dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="41dp"
            android:layout_marginBottom="55dp"
            android:text="Delete" />

    </RelativeLayout>

    package com.example.sem2project;

    import androidx.appcompat.app.AppCompatActivity;
    import android.database.Cursor;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;
    
    public class SQLLite_CRUD extends AppCompatActivity {
        EditText email, pwd, rollno, cid, course, city;
        Button register, show, search, clear, update, delete;
        DataHelper databaseHelper;
        TextView content;
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sqllite_crud);
    
            email = findViewById(R.id.email);
            pwd = findViewById(R.id.pwd);
            register = findViewById(R.id.register);
            show = findViewById(R.id.show);
            search = findViewById(R.id.search);
            rollno = findViewById(R.id.rollno);
            clear = findViewById(R.id.clear);
            cid = findViewById(R.id.cid);
            course = findViewById(R.id.course);
            city = findViewById(R.id.city);
            update = findViewById(R.id.update);
            delete = findViewById(R.id.delete);
    
            databaseHelper = new DataHelper(this);
            Toast.makeText(getApplicationContext(), "DB instance created", Toast.LENGTH_LONG).show();
    
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (allFieldsFilled()) {
                        boolean res = databaseHelper.insertUser(email.getText().toString(), pwd.getText().toString(), cid.getText().toString(), course.getText().toString(), city.getText().toString());
                        showMessage(res ? "Record inserted" : "Insert failed");
                    } else {
                        showMessage("Please fill all fields");
                    }
                }
            });
    
            show.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showAllRecords();
                }
            });
    
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    searchRecord();
                }
            });
    
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clearFields();
                }
            });
    
            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (allFieldsFilled()) {
                        boolean res = databaseHelper.updateRecord(Integer.parseInt(rollno.getText().toString()), email.getText().toString(), pwd.getText().toString(), cid.getText().toString(), course.getText().toString(), city.getText().toString());
                        showMessage(res ? "Record updated" : "Update failed");
                    } else {
                        showMessage("Please fill all fields");
                    }
                }
            });
    
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (rollno.getText().toString() != "") {
                        boolean res = databaseHelper.deleteRecord(Integer.parseInt(rollno.getText().toString()));
                        showMessage(res ? "Record deleted" : "Delete failed");
                    } else {
                        showMessage("Please fill all fields");
                    }
                }
            });
        }
    
        private boolean allFieldsFilled() {
            return !email.getText().toString().isEmpty() && !pwd.getText().toString().isEmpty() && !rollno.getText().toString().isEmpty() && !cid.getText().toString().isEmpty() && !course.getText().toString().isEmpty() && !city.getText().toString().isEmpty();
        }
    
        private void showMessage(String message) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }
    
        private void clearFields() {
            email.setText("");
            pwd.setText("");
            rollno.setText("");
            cid.setText("");
            course.setText("");
            city.setText("");
        }
    
        private void showAllRecords() {
            StringBuilder records = new StringBuilder();
            Cursor result = databaseHelper.showRecords();
            records.append("Table has: ").append(result.getCount()).append(" records!\n");
            while (result.moveToNext()) {
                records.append("user-id: ").append(result.getString(0)).append("\n");
                records.append("user-email: ").append(result.getString(1)).append("\n");
                records.append("user-password: ").append(result.getString(2)).append("\n");
                records.append("user-cid: ").append(result.getString(3)).append("\n");
                records.append("user-course: ").append(result.getString(4)).append("\n");
                records.append("user-city: ").append(result.getString(5)).append("\n");
                records.append("\n");
            }
            Toast.makeText(SQLLite_CRUD.this, records.toString(), Toast.LENGTH_LONG).show();
        }
    
        private void searchRecord() {
            Cursor record = databaseHelper.searchRecord(Integer.parseInt(rollno.getText().toString()));
            if (record.getCount() == 0) {
                Toast.makeText(SQLLite_CRUD.this, "No Record Found !!", Toast.LENGTH_SHORT).show();
            } else {
                while (record.moveToNext()) {
                    email.setText(record.getString(1));
                    pwd.setText(record.getString(2));
                    cid.setText(record.getString(3));
                    course.setText(record.getString(4));
                    city.setText(record.getString(5));
                }
            }
        }
    }

// toolbar item  layout > menu > option menu
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/action_about"
        android:title="About us"
        app:showAsAction="never" />
<item
    android:id="@+id/action_logout"
    android:title="Logout"
    app:showAsAction="never" />




</menu>

// # string .xml


<resources>
    <string name="app_name">Learn Android</string>
    <!--    login-->
    <string name="login">Login</string>
    <string name="login_title">Learn Android</string>
    <string name="login_email">Enter Email</string>
    <string name="login_pwd">Enter Password</string>
    <string name="choose_language">Choose Language</string>
    <!--    signup-->

    <string name="signup">Sign Up</string>
    <string name="signup_email">Enter Email</string>
    <string name="signup_pwd">Enter Password</string>
    <string name="signup_cnf_pwd">Confirm Password</string>

    <string-array name="city">
        <item>Mumbai</item>
        <item>Bangalore</item>
        <item>Hyderabad</item>
        <item>Delhi</item>
        <item>Chennai</item>
        <item>Kolkata</item>
        <item>Pune</item>
        <item>Ahmedabad</item>
        <item>Jaipur</item>
    </string-array>

    <string-array name="degree">
        <item>Bachelor of Arts</item>
        <item>Bachelor of Science</item>
        <item>Bachelor of Commerce</item>
        <item>Bachelor of Engineering</item>
        <item>Master of Arts</item>
        <item>Master of Science</item>
        <item>Master of Commerce</item>

        <!-- Add more degrees as needed -->
    </string-array>

    <string-array name="university">
        <item>University of Delhi</item>
        <item>University of Mumbai</item>
        <item>Indian Institute of Technology, Bombay</item>
        <item>Jawaharlal Nehru University</item>
        <item>University of Calcutta</item>
    </string-array>
</resources>
