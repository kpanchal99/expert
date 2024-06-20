Android Lifecycle Methods
onCreate(): Called once when the activity is first created.
onSaveInstanceState(): Called to save UI state changes before pausing the activity.
onStart(): Called when the activity becomes visible to the user.
onResume(): Called when the activity starts interacting with the user after being paused.
onPause(): Called when the activity is partially obscured or the user leaves it.
onStop(): Called when the activity is no longer visible to the user.
onDestroy(): Called before the activity is destroyed.
onRestart(): Called after the activity has been stopped, just before it is started again.


StringBuilder is non-synchronized and faster, suitable for single-threaded contexts, 
while StringBuffer is synchronized, making it thread-safe and suitable for multi-threaded contexts.


*Internationalization * is the process of designing a software application so that it can be adapted to various languages and regions without engineering changes.
Localization is the process of adapting internationalized software for a specific region or language by translating text and adding locale-specific components.


  Basics of Android
1. How do I change the application name in an Android app?
● Answer: You can change the application name in the strings.xml file
by modifying the app_name string resource.
2. How do I set an icon for my Android app?
● Answer: You can set an icon for your Android app by placing the icon
image in the res/drawable folder and specifying it in the
AndroidManifest.xml file using the android:icon attribute.
Login Application and Activity lifecycle
3. What is the purpose of a StringBuffer in Android?
● Answer: A StringBuffer is used to concatenate strings efficiently in
Android.
4. How do I display a toast message in Android?
● Answer: You can display a toast message using the Toast.makeText()
method.
5. What is the activity lifecycle in Android?
● Answer: The activity lifecycle refers to the stages an activity goes
through, from creation to destruction, including onCreate(),
onStart(), onResume(), onPause(), onStop(), and onDestroy().
6. How do I call a function without event handling in Android?
● Answer: You can call a function without event handling by simply
invoking the function in the activity's onCreate() method or in a
separate thread.
Mapping of activities
7. How do I launch an activity using the manifest file in Android?
● Answer: You can launch an activity using the manifest file by declaring
the activity in the AndroidManifest.xml file and specifying the
intent-filter element.
8. What is the purpose of mapping activities in Android?
● Answer: Mapping activities allows you to navigate between different
activities in an Android app.
Intents
9. How do I use the wallpaper intent in Android?
● Answer: You can use the wallpaper intent to set a wallpaper in Android
by creating an intent with the ACTION_SET_WALLPAPER action and
starting the activity using startActivity().
10.How do I use the web search intent in Android?
● Answer: You can use the web search intent to search the web in
Android by creating an intent with the ACTION_WEB_SEARCH action and
starting the activity using startActivity().
11. How do I use the dialer intent in Android?
● Answer: You can use the dialer intent to make a phone call in Android
by creating an intent with the ACTION_DIAL action and starting the
activity using startActivity().
12.How do I use the map intent in Android?
● Answer: You can use the map intent to display a map in Android by
creating an intent with the ACTION_VIEW action and specifying the map
coordinates.
13.How do I use the email intent in Android?
● Answer: You can use the email intent to send an email in Android by
creating an intent with the ACTION_SEND action and specifying the email
address and subject.
14.How do I use a single textbox for multiple intents in Android?
● Answer: You can use a single textbox for multiple intents by creating
separate intents for each action and using a switch statement to
determine which intent to use based on the user's input.
Alert dialogue interface and arrays
15.How do I create an alert dialogue in Android?
● Answer: You can create an alert dialogue in Android using the
AlertDialog.Builder class and specifying the title, message, and
buttons.
UI Controls
16.What are some common UI controls used in Android?
● Answer: Some common UI controls used in Android include TextView,
EditText, Button, ImageView, and ListView.
SQLite Database CRUD operations
17.How do I insert data into a SQLite database in Android?
● Answer: You can insert data into a SQLite database in Android using
the SQLiteDatabase class and executing an INSERT statement.
18.How do I search for data in a SQLite database in Android?
● Answer: You can search for data in a SQLite database in Android using
the SQLiteDatabase class and executing a SELECT statement with a
WHERE clause.
19.How do I update data in a SQLite database in Android?
● Answer: You can update data in a SQLite database in Android using
the SQLiteDatabase class and executing an UPDATE statement.
20.How do I delete data from a SQLite database in Android?
● Answer: You can delete data from a SQLite database in Android using
the SQLiteDatabase class and executing a DELETE statement.
