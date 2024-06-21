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



⇧ SCROLL TO TOP
SubmitJavatpoint Logo
Search on javatpoint...
home Home
interview questions Interview Questions
Java Interview Questions Java
SQL Interview Questions SQL
Python Interview Questions Python
JavaScript Interview Questions JavaScript
Angular Interview Questions Angular
Selenium Interview Questions Selenium
Spring Boot Interview Questions Spring Boot
HR Interview Questions HR
C Interview Questions C
Data Structure Interview Questions Data Structure
DBMS Interview Questions DBMS
HTML Interview Questions HTML
C# Interview Questions C#
C++ Interview Questions C++

ADVERTISEMENT

Android Interview Questions
Android Interview Questions
ADVERTISEMENT

Android programming is growing day by day. The questions asked by interviewers in android is given below. A list of top android interview questions and answers:

1) What is Android?
ADVERTISEMENT

Android is an open-source, Linux-based operating system used in mobiles, tablets, televisions, etc.

2) Who is the founder of Android?
Andy Rubin.

3) Explain the Android application Architecture.
Following is a list of components of Android application architecture:

ADVERTISEMENT
Services: Used to perform background functionalities.
Intent: Used to perform the interconnection between activities and the data passing mechanism.
Resource Externalization: strings and graphics.
Notification: light, sound, icon, notification, dialog box and toast.
Content Providers: It will share the data between applications.
4) What are the code names of android?
ADVERTISEMENT

Aestro
Blender
Cupcake
Donut
Eclair
Froyo
Gingerbread
Honeycomb
Ice Cream Sandwich
Jelly Bean
KitKat
Lollipop
Marshmallow
More details...
5) What are the advantages of Android?
ADVERTISEMENT
Open-source: It means no license, distribution and development fee.

Platform-independent: It supports Windows, Mac, and Linux platforms.

Supports various technologies: It supports camera, Bluetooth, wifi, speech, EDGE etc. technologies.

Highly optimized Virtual Machine: Android uses a highly optimized virtual machine for mobile devices, called DVM (Dalvik Virtual Machine).

ADVERTISEMENT
6) Does android support other languages than java?
Yes, an android app can be developed in C/C++ also using android NDK (Native Development Kit). It makes the performance faster. It should be used with Android SDK.


ADVERTISEMENT
7) What are the core building blocks of android?
ADVERTISEMENT
The core building blocks of Android are:

Activity
View
Intent
Service
Content Provider
Fragment etc.
More details...
8) What is activity in Android?
ADVERTISEMENT
Activity is like a frame or window in java that represents GUI. It represents one screen of android.

9) What are the life cycle methods of android activity?
There are 7 life-cycle methods of activity. They are as follows:

onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()
ADVERTISEMENT
More details...
10) What is intent?

It is a kind of message or information that is passed to the components. It is used to launch an activity, display a web page, send SMS, send email, etc. There are two types of intents in android:

Implicit Intent
Explicit Intent
ADVERTISEMENT
11) How are view elements identified in the android program?
View elements can be identified using the keyword findViewById.

12) Define Android toast.
ADVERTISEMENT
An android toast provides feedback to the users about the operation being performed by them. It displays the message regarding the status of operation initiated by the user.

13) Give a list of impotent folders in android
ADVERTISEMENT

The following folders are declared as impotent in android:

AndroidManifest.xml
build.xml
bin/
src/
res/
assets/
14) Explain the use of 'bundle' in android?
ADVERTISEMENT
We use bundles to pass the required data to various subfolders.

15) What is an application resource file?

The files which can be injected for the building up of a process are called as application resource file.

16) What is the use of LINUX ID in android?
A unique Linux ID is assigned to each application in android. It is used for the tracking of a process.

17) Can the bytecode be written in java be run on android?
No

18) List the various storages that are provided by Android.
The various storage provided by android are:

Shared Preferences
Internal Storage
External Storage
SQLite Databases
Network Connection
19) How are layouts placed in Android?

Layouts in Android are placed as XML files.

20) Where are layouts placed in Android?
Layouts in Android are placed in the layout folder.

21) What is the implicit intent in android?
The Implicit intent is used to invoke the system components.

22) What is explicit intent in android?
An explicit intent is used to invoke the activity class.

23) How to call another activity in android?

Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  
startActivity(i);  
24) What is service in android?
A service is a component that runs in the background. It is used to play music, handle network transaction, etc.

More details...
25) What is the name of the database used in android?
SQLite: An opensource and lightweight relational database for mobile devices.

More details...
26) What is AAPT?

AAPT is an acronym for android asset packaging tool. It handles the packaging process.

27) What is a content provider?
A content provider is used to share information between Android applications.

28) What is fragment?
The fragment is a part of Activity by which we can display multiple screens on one activity.

29) What is ADB?
ADB stands for Android Debug Bridge. It is a command line tool that is used to communicate with the emulator instance.

30) What is NDK?

NDK stands for Native Development Kit. By using NDK, you can develop a part of an app using native language such as C/C++ to boost the performance.

31) What is ANR?
ANR stands for Application Not Responding. It is a dialog box that appears if the application is no longer responding.

32) What is the Google Android SDK?
The Google Android SDK is a toolset which is used by developers to write apps on Android-enabled devices. It contains a graphical interface that emulates an Android-driven handheld environment and allows them to test and debug their codes.

33) What is an APK format?
APK is a short form stands for Android Packaging Key. It is a compressed key with classes, UI's, supportive assets and manifest. All files are compressed to a single file is called APK.

34) Which language does Android support to develop an application?
Android applications are written by using the java (Android SDK) and C/C++ (Android NDK).

35) What is ADT in Android?
ADT stands for Android Development Tool. It is used to develop the applications and test the applications.

36) What is View Group in Android?
View Group is a collection of views and other child views. It is an invisible part and the base class for layouts.

37) What is the Adapter in Android?
An adapter is used to create a child view to present the parent view items.

38) What is nine-patch images tool in Android?
We can change bitmap images into nine sections with four corners, four edges, and an axis.

39) Which kernel is used in Android?
Android is a customized Linux 3.6 kernel.

40) What is application Widgets in Android?
Application widgets are miniature application views that can be embedded in other applications and receive periodic updates.

41) Which types of flags are used to run an application on Android?
Following are two types of flags to run an application in Android:

FLAG_ACTIVITY_NEW_TASK
FLAG_ACTIVITY_CLEAR_TOP
42) What is a singleton class in Android?
A singleton class is a class which can create only an object that can be shared by all other classes.

43) What is sleep mode in Android?
In sleep mode, CPU is slept and doesn't accept any commands from android device except Radio interface layer and alarm.

44) What do you mean by a drawable folder in Android?
In Android, a drawable folder is compiled a visual resource that can use as a background, banners, icons, splash screen, etc.

45) What is DDMS?
DDMS stands for Dalvik Debug Monitor Server. It gives the wide array of debugging features:

Port forwarding services
Screen capture
Thread and heap information
Network traffic tracking
Location data spoofing
46) Define Android Architecture?
The Android architecture consists of 4 components:

Linux Kernal
Libraries
Android Framework
Android Applications
More details...
47) What is a portable wi-fi hotspot?
The portable wi-fi hotspot is used to share internet connection to other wireless devices.

48) Name the dialog box which is supported by Android?
Alert Dialog
Progress Dialog
Date Picker Dialog
Time picker Dialog
49) Name some exceptions in Android?
Inflate Exception
Surface.OutOfResourceException
SurfaceHolder.BadSurfaceTypeException
WindowManager.BadTokenException
50) What are the basic tools used to develop an Android app?
JDK
Eclipse+ADT plugin
SDK Tools
Java Basics Interview Questions	Java OOPs Interview Questions
Java Multithreading Interview Questions	Java String & Exception Interview Questions
Java Collection Interview Questions	JDBC Interview Questions
Servlet Interview Questions	JSP Interview Questions
Spring Interview Questions	Hibernate Interview Questions
PL/SQL Interview Questions	SQL Interview Questions
Oracle Interview Questions	Android Interview Questions
SQL Server Interview Questions	MySQL Interview Questions
You may also like:
Java Interview Questions
SQL Interview Questions
Python Interview Questions
JavaScript Interview Questions
Angular Interview Questions
Selenium Interview Questions
Spring Boot Interview Questions
HR Interview Questions
C Programming Interview Questions
C++ Interview Questions
Data Structure Interview Questions
DBMS Interview Questions
HTML Interview Questions
IAS Interview Questions
Manual Testing Interview Questions
OOPs Interview Questions
.Net Interview Questions
C# Interview Questions
ReactJS Interview Questions
Networking Interview Questions
PHP Interview Questions
CSS Interview Questions
Node.js Interview Questions
Spring Interview Questions
Hibernate Interview Questions
AWS Interview Questions
Accounting Interview Questions

Learn Latest Tutorials
Splunk tutorial
Splunk

SPSS tutorial
SPSS

Swagger tutorial
Swagger

T-SQL tutorial
Transact-SQL

Tumblr tutorial
Tumblr

React tutorial
ReactJS

Regex tutorial
Regex

Reinforcement learning tutorial
Reinforcement Learning

R Programming tutorial
R Programming

RxJS tutorial
RxJS

React Native tutorial
React Native

Python Design Patterns
Python Design Patterns

Python Pillow tutorial
Python Pillow

Python Turtle tutorial
Python Turtle

Keras tutorial
Keras


Preparation
Aptitude
Aptitude

Logical Reasoning
Reasoning

Verbal Ability
Verbal Ability

Interview Questions
Interview Questions

Company Interview Questions
Company Questions


Trending Technologies
Artificial Intelligence Tutorial
Artificial Intelligence

AWS Tutorial
AWS

Selenium tutorial
Selenium

Cloud Computing tutorial
Cloud Computing

Hadoop tutorial
Hadoop

ReactJS Tutorial
ReactJS

Data Science Tutorial
Data Science

Angular 7 Tutorial
Angular 7

Blockchain Tutorial
Blockchain

Git Tutorial
Git

Machine Learning Tutorial
Machine Learning

DevOps Tutorial
DevOps


B.Tech / MCA
DBMS tutorial
DBMS

Data Structures tutorial
Data Structures

DAA tutorial
DAA

Operating System tutorial
Operating System

Computer Network tutorial
Computer Network

Compiler Design tutorial
Compiler Design

Computer Organization and Architecture
Computer Organization

Discrete Mathematics Tutorial
Discrete Mathematics

Ethical Hacking Tutorial
Ethical Hacking

Computer Graphics Tutorial
Computer Graphics

Software Engineering Tutorial
Software Engineering

html tutorial
Web Technology

Cyber Security tutorial
Cyber Security

Automata Tutorial
Automata

C Language tutorial
C Programming

C++ tutorial
C++

Java tutorial
Java

.Net Framework tutorial
.Net

Python tutorial
Python

List of Programs
Programs

Control Systems tutorial
Control System

Data Mining Tutorial
Data Mining

Data Warehouse Tutorial
Data Warehouse





Experience Scaler

Login to experience InterviewBit
Practice
Improve your coding skills with our resources

Resources
Experience learning
Contests
Compete in popular contests with top coders

Online IDE
Checkout our improved IDE

Free Mock
Assess yourself and prepare for interviews
logo
Events
Attend free live masterclass hosted by top tech professionals
New
Scaler
Explore Offerings by SCALER

/
Interview Guides
/
Android Interview Questions
Android Interview Questions
Last Updated: Jan 03, 2024

Download PDF

Android is an open-sourced operating system founded by Andy Rubin. It is a Linux-based operating system that allows developers to develop and run apps that can perform both basic and advanced functions.

Components of Android application
Android application architecture has the list of components given below. They are as follows:

Services − It will be used to perform background functionalities.
Activities - It is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.
Broadcast receivers - Broadcast receiver is a mechanism used for listening to system-level events like listening for incoming calls, SMS, etc. by the host application.
Content providers − This will share the data between various applications.
Scope of Android
We need Android in the mobile market because it helps smartphone users to download applications that can give different services.

Android developers can publish their apps on different platforms like SlideME, Mobango, Amazon app store, Opera mobile store, etc. Most of these platforms or markets are free. Such platforms are creating a huge market for Android mobile application development in India.

Play
Advantages of Android
Open-source: It means no license, development, and distribution fee.
Platform-independent: Android development platform(Android studio & Android SDK) is platform-independent. Android applications can be developed on any operating system with the help of Android studio & Android SDK.
Highly optimized virtual machine: Android uses a highly optimized virtual machine i.e, DVM (Dalvik Virtual Machine) for mobile devices. Replacing DVM, ART(Android RunTime) virtual machine was introduced to execute android apps from Android lollipop 5.0 version (API level 21).
Supports various technologies: It supports camera, speech, BlueTooth, Wifi, EDGE, etc. technologies.
Millions of available apps: Millions of Android apps are available that you can install on the device from the Google Play store as well as from other alternative stores.
Disadvantages of Android
Fake applications: There are thousands of fake applications available on the market, which when installed may try to steal your data.
Streamlining issues:
There are various kinds of Android devices available in the market with different screen sizes and dimensions, but more importantly, different Android operating systems.
An application that runs smoothly on one version of the Android OS might crash on another Android OS.
Background processes:
In the older version of Android, most applications always run in the background and come to the foreground as they wish. From the Android 8.0 version, apps that are running in the background now have limits on how freely they can access background services.
As few apps run in the background, they consume mobile battery and your device battery vanishes quickly.
Poor data connection: Android phones have a large number of background processes that keep on running in the background and it results in excess usage of data and poor internet speed. Sometimes it can be very annoying.
Android Interview Questions For Freshers
1. What is portable Wi-Fi hotspot?
Portable Wi-Fi Hotspot permits you to share your mobile internet connection with other wireless devices. For example, using your Android phone as a Wi-Fi hotspot, you can use your laptop to connect to the internet using that access point.


Create A FREE Custom Study Plan
Get into your dream companies with expert..
Real-Life Problems
Prep for Target Roles
Custom Plan Duration
Flexible Plans
Create My Plan
2. What are the features of Android architecture?
Android architecture refers to the various layers in the Android stack. It consists of operating systems, middleware, and applications. Each layer in the Android architecture gives different services to the layer just above it.

The five layers present in the Android stack are:

Linux Kernel - It is responsible for device drivers, device management, memory management, power management, and resource access.
Libraries - There are a set of libraries having open-source Web browser engine WebKit, well-known library libc, libraries to play and record audio and video, SQLite database for sharing of application data and storage, SSL libraries for internet security, etc.
Android Runtime - There are core libraries along with DVM (Dalvik Virtual Machine) or ART(Android RunTime) as runtime which is helpful for running an Android application. DVM is optimized for mobile devices. DVM provides fast performance and consumes less memory. Replacing DVM, ART(Android RunTime) virtual machine was introduced to execute android apps from Android lollipop 5.0 version (API level 21).
Android Framework - It consists of Android APIs like UI (User Interface), resources, content providers (data), locations, telephony, and package managers. It provides interfaces and classes for the development of Android applications.
Android Applications - Applications like home, games, contacts, settings, browsers, etc. uses the Android framework that will make use of Android runtime and libraries.

Android Architecture
3. List the languages used to build Android.
The most popular programming languages that can be used to develop applications in Android are:

Java: It has always been a starting point for new developers and used by the majority of people who work with Android development. Eclipse, NetBeans, and IntelliJ IDE are the most popular IDE’s(Integrated Development Environment) used for developing an Android application using java.
Kotlin: Kotlin is a relatively new, modern, safe, and object-oriented cross-platform programming language used in developing an Android application. IDE’s used with kotlin are Android studio, Eclipse IDE, etc.
C#: Developers can build native iOS and Android mobile applications by using the C# language. Visual Studio is the best tool for developing an Android application using C#.
Python: It is a dynamic and object-oriented programming language. It is very popular in machine learning. Pydroid 3, Dcoder, spck code editor is some of the code editors for Python.
Other languages which can be used in Android development are C++, HTML 5. C4droid, CppDroid, AIDE, etc. are IDE’s for C++. Acode, spck code editor, etc. are examples of IDE’s used with HTML.
You can download a PDF version of Android Interview Questions.

Download PDF

4. What is an activity?
Activity in java is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.

For example, the Facebook start page where you enter your email/phone number and password to log in acts as an activity.

5. What is a service in Android?
Service is an application component that facilitates an application to run in the background in order to perform long-running operations without user interaction. A service can run continuously in the background even if the application is closed or even after the user switches to another application.

Learn via our Video Courses
6. Differentiate Activities from Services.
Activities can be terminated or closed anytime the user wishes. On the other hand, services are designed to run in the background, and they can act independently.

Most of the services run continuously, irrespective of whether there are certain or no activities being executed.

Activities	Services
They are designed to run in the foreground.	These are mainly designed to run in the background. Foreground services are also available.
Used when the user interface is necessary.	Used when the user interface is not necessary.
They are dependent.	They act independently.
7. What is Google Android SDK? Which are the tools placed in Android SDK?
The Google Android SDK is a toolset used by developers to write applications on Android-enabled devices.

The tools placed in Android SDK are given below:

Android Emulator - Android Emulator is a software application that simulates Android devices on your computer so that you can test the application on a variety of devices and Android API levels without having each physical device.
DDMS(Dalvik Debug Monitoring Services) - It is a debugging tool from the Android software development kit (SDK) which provides services like message formation, call spoofing, capturing screenshots, etc.
ADB(Android Debug Bridge) - It is a command-line tool used to allow and control communication with the emulator instance.
AAPT(Android Asset Packaging Tool) - It is a build tool that gives the ability to developers to view, create, and update ZIP-compatible archives (zip, jar, and apk).

Refine Your Coding Skills With Mock Assessments
Real-world coding challenges for top companies
Real-Life Problems
Detailed reports
Attempt Now
8. What is the use of Bundle in Android?
Bundles are used to pass the required data between various Android activities. These are like HashMap that can take trivial data types. Below code shows how to transfer a piece of data by using bundle:

Bundle b=new Bundle();
b.putString("Email","abc@xyz.com");
i.putExtras(b); // where i is intent
9. What is an Adapter in Android?
An adapter in Android acts as a bridge between an AdapterView and the underlying data for that view. The adapter holds the data and sends the data to the adapter view, the view can take the data from the adapter view and shows the data on different views like a spinner, list view, grid view, etc.

10. What is AAPT?
AAPT stands for Android Asset Packaging Tool. It is a build tool that gives the ability to developers to view, create, and update ZIP-compatible archives (zip, jar, and apk). It parses, indexes, and compiles the resources into a binary format that is optimized for the platform of Android.

11. What is Android?
Android is an open-sourced operating system that is used on mobile devices, such as mobiles and tablets. The Android application executes within its own process and its own instance of Dalvik Virtual Machine(DVM) or Android RunTime(ART).

12. What is Android Debug Bridge(ADB)?
Android Debug Bridge is a command-line tool used to allow and control communication with an emulator instance. It gives the power for developers to execute remote shell commands to run applications on an emulator.

13. What is DDMS?
DDMS(Dalvik Debug Monitor Server) is a debugging tool in the Android platform. It gives the following list of debugging features:

Port forwarding services.
Thread and heap information.
Logcat.
Screen capture on the device.
Network traffic tracking.
Incoming call and SMS spoofing.
Location data spoofing.
14. What is AIDL? Which data types are supported by AIDL?
AIDL(Android Interface Definition Language) is a tool that handles the interface requirements between a client and a service for interprocess communication(IPC) to communicate at the same level.

The process involves dividing an object into primitives that are understood by the Android operating system. Data Types supported by AIDL is as follows:

String
List
Map
CharSequence
Java data types (int, long, char, and boolean)
Android Intermediate Questions
1. What is a Toast? Write its syntax.
Toast is a message that pops up on the screen. It is used to display the message regarding the status of the operation initiated by the user and covers only the expanse of space required for the message while the user’s recent activity remains visible and interactive.

Toast notification automatically fades in and out and it does not accept interaction events.

Syntax:

Toast.makeText(ProjectActivity.this, "Your message here", Toast.LENGTH_LONG).show();
2. What is context?
The context in Android is the context of the current state of the application or object. The context comes with services like giving access to databases and preferences, resolving resources, and more.

There are two types of context. They are:

Activity context

This activity context is attached to the lifecycle of an activity.
The activity context can be used when you are passing the context in the scope of an activity or you need the context whose lifecycle is attached to the context of the activity.
Application context:

This application context is attached to the lifecycle of an application.
The application context should be used where you need a context whose lifecycle is separate from the current context or when you are passing a context beyond the scope of activity.

Types of Context
3. Explain the difference between Implicit and Explicit Intent.
The difference between the implicit and explicit Intents are given below:

Explicit Intent:

An Explicit Intent is where you inform the system about which activity should handle this intent. Here target component is defined directly in the intent.

For example,

Intent i = new Intent(this, Activitytwo.class); #ActivityTwo is the target component
i.putExtra("Value1","This is ActivityTwo"); 
i.putExtra("Value2","This Value two for ActivityTwo"); 
startactivity(i);
Implicit Intent:

An Implicit Intent permits you to declare the action you want to carry out. Further, the Android system will check which components are registered to handle that specific action based on intent data. Here target component is not defined in the intent.

For example,

Intent i = new Intent(ACTION_VIEW,Uri.parse("http://www.interview bit.com")); 
startActivity(i);
4. What is ANR in Android? What are the measures you can take to avoid ANR?
ANR(Application is Not Responding) is a dialog box that appears when the application is not responding. This ANR dialogue is displayed whenever the main thread within an application has been unresponsive for a long time under the following conditions:

When there is no response to an input event even after 5 seconds.
When a broadcast receiver has not completed its execution within 10 seconds.
Following measures can be taken to avoid ANR:

An application should perform lengthy database or networking operations in separate threads to avoid ANR.
For background task-intensive applications, you can lessen pressure from the UI thread by using the IntentService.
5. What are the troubleshooting techniques you can follow if an application is crashing frequently?
If an Android application is crashing frequently, you can follow the below-given techniques:

Compatibility Check:

It is not possible to test an application for all kinds of devices and operating systems. There might be a possibility that an application is not compatible with your OS.

Memory Management:

Some apps run perfectly on one mobile device but might crash on other devices. This is where processing power, memory management, and CPU speed are considered.
As there is a limited amount of memory space on mobile devices, you can free up memory space for the application to function properly.
If an application is frequently crashing, you can delete the application’s data, which will clear its cache memory and allow some free space on your device and might boost the app’s performance.
6. Explain different launch modes in Android.
The different launch modes in Android are given below:

Standard:

This launch mode generates an activity’s new instance in the task from which it originated.
It is possible to create several instances for the same activity.
For Example, suppose our current stack is A -> B -> C. Now, if we launch activity B again with the “standard” launch mode, then the new stack will be A -> B -> C -> B.
SingleTop:

This launch mode is similar to the Standard launch mode except if there exists an activity’s previous instance on the top of the stack, then a new instance will not be created.
But the intent will be sent to the activity’s existing instance.
For example, suppose our current stack is A -> B -> C. Now, if we launch the activity B again with “singleTop” launch mode,then the new stack will be A -> B -> C -> B.
Consider another example, where the current stack is A -> B -> C. Now, if we launch activity C again with the “singleTop” launch mode, then the stack will remain the same i.e., A -> B -> C. The intent will be passed to the onNewIntent() method.
SingleTask:

This launch mode will create a new task and push a new instance to the task as the root.
For example, suppose our current stack is A -> B -> C -> D. Now, if we launch activity B again with the “singleTask” launch mode, then the new stack will be A -> B. Here, a callback has been received on the old instance and C and D activities are destroyed.
SingleInstance:

This launch mode is similar to the SingleTask launch mode. But the system doesn’t support launching any new activities in the same task.
In a situation where the new activity is launched, it is launched in a separate task.
For example, Suppose our current stack is A -> B -> C. Now, if we launch the activity D with the “singleInstance” launch mode, then there will be two stacks:
A -> B -> C
D, If you call activity E, then it will be added to the first stack.
A -> B -> C -> E
D
Again if you Call the activity D, then it will call the same activity from the 2nd stack and pass the intent to onNewIntent().

7. What are containers?
Containers carry objects and widgets together, based on which specific items are required and in what particular arrangement is needed. Containers may hold labels, buttons, fields, or even child containers, etc. For example, if you want a form with fields on the left and labels on the right, you will need a container. If you want the OK and Cancel buttons to be below the rest of the form, next to one another, and flush to the right side of the screen, you will need a container. If you have several widgets, you will need a container to have a root element to place the widgets inside.

Android provides a collection of view classes that serve as containers for views. These container classes are called layouts, which are defined in the form of XML files that cannot be changed by our code during execution. The layout managers provided by Android SDK are LinearLayout, RelativeLayout, FrameLayout, AbsoluteLayout, GridLayout, and TableLayout.

8. What is the role of Dalvik in Android development?
Dalvik serves as a virtual machine, and it is responsible for running every Android application. Because of Dalvik, a device will have the ability to execute multiple instances of virtual machines efficiently through better memory management.

9. What is the latest version of Android? List all the versions of Android.
The latest version is Android 11.0 released in September 2020. Most of the Android version has been named after either sweet or desserts. The following table represents the different versions, Android name, API level, and the year of release. Here API level is the integer value that identifies the API framework revision given by the version of the android platform.

Version	Android Name	API Level	Year of Release
Android 1.0	No Codename	1	2008
1.1	No Codename	2	2009
1.5	Cupcake	3	2009
1.6	Donut	4	2009
2.0 - 2.1	Eclair	5 - 7	2009
2.2 – 2.2.3	Froyo	8	2010
2.3 – 2.3.7	Gingerbread	9 - 10	2010
3.0 – 3.2.6	Honeycomb	11 - 13	2011
4.0 – 4.0.4	Ice Cream Sandwich	14 - 15	2011
4.1 – 4.3.1	Jelly Bean	16 - 18	2012
4.4 – 4.4.4	Kitkat	19 - 20	2013
5.0 – 5.1.1	Lollipop	21 - 22	2014
6.0 – 6.0.1	Marshmallow	23	2015
7.0 – 7.1.2	Nougat	24 - 25	2016
8.0 – 8.1	Oreo	26 - 27	2017
9.0	Pie	28	2018
10.0	Android 10	29	2019
11.0	Android 11	30	2020
Android 1.0 (API 1): There were numerous loopholes in this Android version including the necessity of physical keyboards or hardware buttons. Important features are:

Browser, Google maps, and calendar.
Camera and scroll down the notification bar.
Wireless supports Wi-Fi and BlueTooth.
Contacts, Gmail integration, and Google synchronization.
Android 1.1 (API 2): This version was released with API changes and resolved issues found in 1.0. Important features of this version are:

Display details as well as reviews for locations.
Gives detailed information by clicking on the business.
Add save an attachment in the message.
Android 1.5 Cupcake (API 3): It brought the third-party app widgets that were the most distinguishing and valuable feature. Important features of this version are:

Video recordings, copy and paste facility.
Supports MPEG4 and 3GP formats.
Search function and on-screen keyboard.
Uploading images and videos.
Android 1.6 Donut (API 4): It had valuable changes including the ability to operate on various screen resolutions and sizes. Donut provides the text and voice entry search including bookmark history and capacity to select multiple images for deletion. Important features of this version are:

Camera quick toggling features and gallery.
WVGA screen resolution speed.
Power control widget for handling Wi-Fi, GPS, BlueTooth, etc.
Technology support for CDMA/EVDO, VPNs, 802.1x, and a text-to-speech engine.
Searching applications and speed improvements for cameras.
Supports quick search Box.
Android 2.0-2.1 Eclair (API 5-API 7): It was released with multiple email account synchronizations and contacts. Many new features were added including flash support, color effect, scene mode, white balance, macro focus, and digital zoom. Android 2.1 version brought bug fixes and stability improvements. The most valuable feature introduced was real-time traffic information and voice-guided turn by turn navigation. Important features are:

Updated UI.
Minor API changes.
Support Bluetooth 2.1.
Improved Google map.
Supports live and animated Wallpapers.
Has the ability to add contact’s photo and select to call, message or email.
Android 2.2-2.2.3 Froyo (API 8): It was released with memory, speed, and performance improvements. It was introduced with the enhanced Bluetooth functionality and also compatibility with docks, portable Wi-Fi hotspot for 3G connection sharing. Features are:

Upload file support in the browser.
Supports alphanumeric and numeric passwords to enhance security.
Support for animated GIF and multiple keyboard languages.
Increased compatibility with headsets and car kits.
Android 2.3-2.3.7 Gingerbread (API 9-API 10): The main enhanced feature was the introduction of gaming API with improved graphical intense gaming. Features are:

Updated UI.
Support for VP8 and WebM video format.
Improvement in copy and paste facility.
Easier use of keyboard with faster and intuitive typing.
Supports video calling and social networking.
Android 3.0-3.2.6 Honeycomb (API 11-API 13): It was a tablet-only release to launch the Motorola Xoom. It was suitable for those mobiles having a larger view than current smartphones. Features will include:

Updated 3D UI and encrypted storage.
Gmail, camera, contacts, and gallery improvements.
Supports passwords with complex characters.
Supports multiprocessors and recent applications for easy visual multitasking.
Media sync from SD card.
Talk video chat and google eBooks.
Support adobe flashes in the browser.
More sensor support.
High-performance Wi-Fi connections.
Action bar for application control and system bar for global status and notifications
Chinese handwriting and redesigned keyboard.
Android 4.0-4.0.4 Ice Cream Sandwich (API 14-API 15): It is released with many enhanced features to enter the era of modern design. The snapshot was introduced to take screenshots by holding the power and volume button. Ice cream sandwich widgets are more robust and resizable compared to all older versions. Supported features are:

Unlocking with face-fixing.
Card-like appearance for app-switching.
Better camera performance and improved video recording with high resolution.
Spelling check feature, Wi-Fi direct.
On-screen buttons and better camera performance.
Ability to open up to 16 tabs in the web browser.
Android 4.1-4.3.1 Jelly Bean (API 16-API 18): It is released with Google digital assistant technology accessible from the home screen. The spectacular predictive intelligence utility gives expandable and interactive notifications. Users can enjoy multi-user support(Only for tablets). Supported features are:

Power control, support USB audio.
The improved camera app, security improvements.
Voice search and typing, panorama.
Expandable notifications, daydream as a screensaver.
Google displays relevant content based on search history.
Native emoji support, new gestures, and accessibility features
4k resolution support, supporting Bluetooth with low energy.
Bi-directional text and different language support.
Set or adjust the volume of incoming calls and show a message alert as well.
Android 4.4-4.4.4 KitKat (API 19-API 20): It is released with more focus on better user experience. Supported features are:

GPS Support, smarter caller ID.
Offline music support, screen recording.
Contact prioritization.
Cartoonish ideograms and emojis to the Google keyboard.
UI updates for Google map navigations and alarm.
‘OK, Google’ feature allows access to Google to the users without touching your smartphones.
Android 5.0-5.1.1 Lollipop (API 21-API 22): It was released with a redesigned user interface and built with “material design”. It is having many amazing features including support for better notification management. Supported features are:

Support ART, better and improved UI.
Better device protection, built-in battery saver feature.
Notification can be flicked away from the lock screen.
The revamped navigation bar supports multiple SIM cards.
The high definition of a voice call.
Android 6.0-6.0.1 Marshmallow (API 23): Google used “Macadamia Nut Cookie” to describe Android version 6.0 before the official announcement of Marshmallow. Supported features are:

Support for fingerprint readers, type-C USB support.
Multi-window experience, clear permission system.
’Sleep Mode’ for saving the life of the battery.
Custom Google tabs and improved copy-pasting.
Android 7.0-7.1.2 Nougat (API 24-API 25): It was released with a native split-screen mode, data saver functionality, and a “bundled-by-app” system to organize notifications. Supported features are:

Multitasking and split-screen mode.
Storage manager enhancements, quick setting toggles.
Display touch enhancements, better setting application.
Inline reply to message and notification without opening an application.
Android 8.0-8.1 Oreo (API 26-API 27): It is having notification snoozing options, native picture-in-picture mode, and better control over how applications can alert you by notifications. Supported features are:

Password autofill, auto-enable Wi-Fi.
Downloadable fonts, multi-display support.
Support picture-in-picture.
Adaptive icons and smart text selection.
Notification channels and snooze notifications.
Google play support and new emoji styling.
Android 9.0 Pie (API 28): It is having plenty of amazing features according to the user interests and requirements. Supported features are:

HDR, HD audio, multiple Bluetooth connections.
Much more information about notification and easier text selection.
Sound amplifier with select to speak option.
Artificial Intelligence(AI) compatibility.
Adaptive battery and brightness with the background restrictions.
Supports for multi-camera with external camera compatibility.
New shortcut key for screenshot and accessibility menu.
Improved security features for protection.
Android backups, privacy enhancements.
Easier screen rotation, edge-to-edge screens support.
Volume and sound enhancements, selectable dark mode.
Android 10.0 (API 29): It is released with enhanced features and functionalities with higher API levels. Supported features are:

Support for foldable smartphones with a flexible display.
Dark mode for the comfortability of eyes.
Navigation control over gesture quicker and intuitive ever.
Smart reply suggestions for all messaging applications.
Live caption for media playing on a smartphone device.
Undo removal of the app.
Better notification control with many options.
Sound amplifier with much more clear sound.
Android 11.0 (API 30): Android developers are continuously working to provide more advanced applications as per the user requirements. Important features included are:

Native screen recording.
Auto revokes app permission.
Mute notifications during the video.
Increase in touch sensitivity.
Notification history.
10. Mention the difference between class, file and activity in Android?
The difference between them is as follows:

Class is a compiled form of a .java file that Android uses to produce an executable .apk file.
A file is a block of arbitrary information or resources used for storing information. It can be of any file type.
Activity is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.
11. What is the life cycle of Android activity?
OnCreate(): It is called when activity is created. Using this, the views are created and data is collected from bundles.
OnStart(): It is called if the activity is becoming visible to the user. It may be succeeded by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
OnResume(): It is called when the activity will start an interaction with the user.
OnPause(): This is called when the activity is moving to the background but hasn’t been killed yet.
OnStop(): This is called when an activity is no longer visible to the user.
OnDestroy(): This is called when the activity is finished or destroyed.
OnRestart(): This is called after the activity has been stopped, prior to it being started again.

Life Cycle of Android
12. Explain Sensors in Android.
Android-based devices have a collection of built-in sensors in them, which measure certain parameters like motion, orientation, and many more through their high accuracy. The sensors can be both hardware and software based on nature. There are three prominent categories of sensors in Android devices. They are:

Position Sensor: It is used for measuring the physical position of the Android device. This has orientation sensors and magnetometers.
Motion Sensors: These sensors consist of gravity, rotational activity, and acceleration sensors which measure the rotation of the device or the acceleration, etc.
Environmental Sensor: It includes sensors that measure temperature, humidity, pressure, and other environmental factors.
13. Explain the dialog boxes supported on Android.
Android supports four dialog boxes. They are:

AlertDialog:
The AlertDialog supports 0-3 buttons, along with a list of selectable items such as checkboxes and radio buttons.
It is used when you want to ask the user about taking a decision between yes or no in response to any particular action taken by the user, by remaining in the same activity and without changing the screen.
DatePickerDialog:
It is used for selecting the date by the user.
TimePickerDialog:
Used for selecting the time by the user.
ProgressDialog:
It is an extension of the AlertDialog and is used to display a progress bar. It also supports the addition of buttons.
This class was deprecated in API level 26 because it prevents the user from interacting with the application. Instead of this class, we can use a progress indicator such as ProgressBar, which can be embedded in the user interface of your application.
14. What is AndroidManifest.xml file and why do you need this?
The AndroidManifest.xml file contains information regarding the application that the Android system must know before the codes can be executed.
This file is essential in every Android application.
It is declared in the root directory.
This file performs several tasks such as:
Providing a unique name to the java package.
Describing various components of the application such as activity, services, and many more.
Defining the classes which will implement these components.
15. What is an intent?
An intent is a messaging object that is used to request an action from other components of an application. It can also be used to launch an activity, send SMS, send an email, display a web page, etc.

It shows notification messages to the user from within an Android-enabled device. It alerts the user of a particular state that occurred. There are two types of intents in Android:

Implicit Intent- Used to invoke the system components.
Explicit Intent- Used to invoke the activity class.

Types Of Intents
Android Interview Questions For Experienced
1. What are broadcast receivers? How is it implemented?
A broadcast receiver is a mechanism used for listening to system-level events like listening for incoming calls, SMS, etc. by the host application. It is implemented as a subclass of BroadcastReceiver class and each message is broadcasted as an intent object.

public class MyReceiver extends BroadcastReceiver 
{
    public void onReceive(context,intent){}
}
2. Explain in detail about the important file and folders used when you create a new Android application.
App:

It describes the basic characteristics of the application and defines each of its components.

java:

This contains the .java source files and .kt(source code written in Kotlin) source files of your project. By default, it includes a MainActivity.java or MainActivity.kt source file.
You create all the activities which have .java and .kt extensions under this file and also it includes all the code behind the application.
res:

It is used to store the values for the resources that are used in various Android projects to include features of color, styles, dimensions, etc.
It is a directory for files like styles.xml, strings.xml, colors.xml, dimens.xml, etc.
Scripts:

This is an auto-generated file that consists of compileSdkVersion, buildToolsVersion, minSdkVersion, targetSdkVersion, applicationId, versionCode, and versionName. For example, build.gradle is a script file placed in the root project directory, defines build configurations that will be applied to all modules in your project.

3. What is the difference between Serializable and Parcelable? Which is the best approach in Android?
While developing applications usually it needs to transfer data from one activity to another. This data needs to be added into a corresponding intent object. Some additional actions are required to make the data suitable for transfer. For doing that the object should be either serializable or parcelable.

Serializable:

Serializable is a standard Java interface. In this approach, you simply mark a class Serializable by implementing the interface and java will automatically serialize it.
Reflection is used during the process and many additional objects are created. This leads to plenty of garbage collection and poor performance.
Parcelable:

Parcelable is an Android-specific interface. In this approach, you implement the serialization yourself.
Reflection is not used during this process and hence no garbage is created.
Parcelable is far more efficient than Serializable since it gets around some problems with the default Java serialization scheme. Also, it is faster because it is optimized for usage on the development of Android, and shows better results.
4. What database is used in Android? How it is different from client-server database management systems?
SQLite is the open-source relational database used in Android. The SQLite engine is serverless, transactional, and also self-contained. Instead of the client-server relationship of most database management systems, the SQLite engine is integrally linked with the application. The library can be called dynamically and it can make use of simple function calls that reduce latency in database access.

5. What are the differences between Service and Thread?
The main difference between Service and Thread is given below:

Service	Thread
Service is an application component that facilitates an application to run in the background in order to perform long-running operations without user interaction. 	A Thread is a concurrent unit of execution.
It exposes few functionalities to other applications by calling Context.bindService().	Google has brought in handlers and loopers into threads.
When an application is killed, service is not killed.	When an application is killed, the thread is killed.
6. What is the content provider? How it is implemented?
Content provider is one of the primary building blocks of Android applications, which manages access to a central repository of data. It acts as a standard interface that connects data in one process with code running in another process. So it can be used to share the data between different applications.

They are responsible for encapsulating the data and providing mechanisms for defining data security. It is implemented as a subclass of ContentProviderclass and must implement a set of APIs that will enable other applications to perform transactions.

public class MyContentprovider extends ContentProvider 
{
 public void onCreate(){}
}
7. What is the significance of the .dex file?
Android programs are compiled into a .dex file (Dalvik Executable file) by DVM, which are then zipped into a .apk file on the device. .dex files are created by translating compiled applications written in java. .dex is a format that is optimized for effective storage and memory-mappable executions.

8. What is the difference between compileSdkVersion and targetSdkVersion?
compileSdkVersion:

The compileSdkVersion is the version of API the application is compiled against. You can use Android API features involved in that version of the API (as well as all previous versions).
For example, if you try and use API 15 features but set compileSdkVersion to 14, you will get a compilation error. If you set compileSdkVersion to 15 you can still run the app on an API 14 device as long as your app’s execution paths do not attempt to invoke any APIs specific to API 15.
targetSdkVersion:

The targetSdkVersion indicates that you have tested your app on (presumably up to and including) the version you specify. This is like a certification or sign-off you are giving the Android OS as a hint to how it should handle your application in terms of OS features.
For example, setting the targetSdkVersion value to “11” or higher permits the system to apply a new default theme (Holo) to the application when running on Android 3.0 or higher. It also disables screen compatibility mode when running on larger screens (because support for API level 11 implicitly supports larger screens).
9. Explain about java classes related to the use of sensors on Android.
Android sensor API provides many classes and interface for the use of sensors on Android. The important classes and interfaces of sensor API are given below:

Sensor class: This class helps you to create an instance of a specific sensor. It provides methods that let you determine a sensor’s capabilities.
SensorManager class: This class is used to create an instance of the sensor service. It provides methods to access and list sensors, to register and unregister sensor listeners, etc.
SensorEvent class: This Java class is used to create a sensor event object. It provides information about the sensor event including raw sensor data, the accuracy of data, type of sensor, timestamp of event, etc.
SensorEventListener interface: This interface is used to create two callback methods that receive sensor event notifications when sensor value changes or when sensor accuracy changes. Those two methods are void onAccuracyChanged(Sensor sensor, int accuracy) which is called when sensor accuracy is changed and
void onSensorChanged(SensorEvent event) which is called when sensor values are changed.
10. What is JobScheduler?
The JobSchedular API is used for scheduling different types of jobs against the framework that will be executed in your app’s own process. This allows your application to perform the given task while being considerate of the device’s battery at the cost of timing control.

The JobScheduler supports batch scheduling of jobs. The Android system can combine jobs for reducing battery consumption. JobManager automatically handles the network unreliability so it makes handling uploads easier.

Here is some example of a situation where you would use this job scheduler:

Tasks that should be done when the device is connected to a power supply.
Tasks that require a Wi-Fi connection or network access.
Tasks should run on a regular basis as a batch where the timing is not critical.
Conclusion
Android system gives a platform for a developer from which they can display the applications to smartphone users and find potential customers out of them. It also provides paid and free applications for the users that could secure their data serves as a platform for information and gives various services as per the needs of the customers.

Useful Resources:
Android Developer Salary
Android Projects
Android MCQ
Android Developer Resume
Android Developer Skills
Android Frameworks
Mobile Testing
iOS Developer
Android MCQs
1.
After installation on a device, each Android application lives in _____?


External memory

Device memory

Security sandbox

None of the above
2.
Android is based on which kernel?


Windows

Linux

Mac

RedHat
3.
_____ has developed the Android.


Microsoft

Google

Android Inc.

Apple
4.
Which of the following layouts present in Android?


Relative layout

Frame layout

Linear layout

All of the above
5.
XML Layout files are stored in _____ directory.


/src

/res/values

/assets

/res/layout
6.
Which is the JSON exception in Android?


InputNotFoundException

JSONException

JSONNotFoundException

None of the above
7.
API stands for _____


Algorithmic Protocol Interface

Application Programming Interface

Accelerated Programming Interface

None of the above
8.
Which are the important device characteristics that should be considered when you design and develop an Android application?


Screen size and density

Device features

Input configurations

All of the above
9.
What is JNI in Android?


Java Interface

Image Editable Tool

Java Network Interface

Java Native Interface
10.
What does Manifest.xml in Android consist of?


Has the information about activities in an application.

Has information about layout in an application.

Has all of the information about an application.

None of the above.
11.
Android web browser is based on


Safari

Firefox

Open-source webkit

Chrome
12.
What is an interface in Android?


It acts as a bridge between class and the outside world.

Interface is a class.

Interface is a layout file.

All of the above.
13.
How to obtain a response from an Android activity?


Bundle()

startActiivtyForResult()

startActivityToResult()

None of the above
14.
ADB stands for _____.


Android Debug Bridge

Android Drive Bridge

Android Destroy Bridge

Android Delete Bridge.
15.
What is a breakpoint in Android?


Breaks the execution

Breaks the development code

Breaks the application

None of the above

Blog
Community
About Us
FAQ
Contact Us
Terms
Privacy Policy
instagram-icon
instagram-icon
instagram-icon
instagram-icon
Practice Questions
Programming
Scripting
System Design
Databases
Puzzle
Fast Track Courses
Python
Java
C++
Javascript
Online Interviewbit Compilers
Online C Compiler
Online C++ Compiler
Online Java Compiler
Online Javascript Compiler
Online Python Compiler

Interview Preparation
Top Interview Questions
Language, Tools & Technologies
Java Interview Questions
Sql Interview Questions
Python Interview Questions
Javascript Interview Questions
Angular Interview Questions
Networking Interview Questions
Selenium Interview Questions
Data Structure Interview Questions
Data Science Interview Questions
System Design Interview Questions
Hr Interview Questions
Html Interview Questions
C Interview Questions
View All
Companies
Amazon Interview Questions
Facebook Interview Questions
Google Interview Questions
Tcs Interview Questions
Accenture Interview Questions
Infosys Interview Questions
Capgemini Interview Questions
Wipro Interview Questions
Cognizant Interview Questions
Deloitte Interview Questions
Zoho Interview Questions
Hcl Interview Questions
View All
Top Articles
Highest Paying Jobs In India
Exciting C Projects Ideas With Source Code
Top Java 8 Features
Angular Vs React
10 Best Data Structures And Algorithms Books
Exciting C Projects Ideas With Source Code
Best Full Stack Developer Courses
Best Data Science Courses
Python Commands List
Data Scientist Salary
Maximum Subarray Sum Kadane’s Algorithm
View All
Top Cheat Sheet
Python Cheat Sheet
C++ Cheat Sheet
Javascript Cheat Sheet
Git Cheat Sheet
Java Cheat Sheet
View All
Top MCQ
Java Mcq
Data Structure Mcq
Dbms Mcq
C Programming Mcq
C++ Mcq
Python Mcq
Javascript Mcq
View All

Free Mock Assessment
Powered By 
Fill up the details for personalised experience.
+91 *
Phone Number
Graduation Year *
*Enter the expected year of graduation if you're student

By clicking on Start Test, I agree to be contacted by Scaler in the future.
Already have an account? Log in

Free Mock Assessment
Powered By 

Instructions from Interviewbit
Start Test