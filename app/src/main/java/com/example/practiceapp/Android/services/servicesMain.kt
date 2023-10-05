package com.example.practiceapp.Android.services/*
package com.example.practiceapp

What is service and types of services ?
----------------------------------------
In the context of Android development, a service is a component of the Android operating system
that performs long-running operations in the background without a user interface. Services are
used to perform tasks that need to continue running even when the app is not in the foreground
or when the device is in a low-power state. There are several types of services in Android:

Foreground Service:
--------------------
A foreground service is a service that has a visible notification associated with it.
This notification informs the user that the service is running, and it's often used for
tasks that are considered important to the user, such as music playback or GPS tracking.
Foreground services have a higher priority and are less likely to be killed by the system.

Background Service:
-------------------
A background service is a service that runs in the background but doesn't have a visible
notification. Background services are used for tasks that are not immediately visible to
the user, such as syncing data or performing periodic checks.

Bound Service:
--------------

A bound service is a service that allows other components (typically activities) to bind to it and
interact with it. Bound services are often used to share data or functionality between different
parts of an app.

Intent Service (Deprecated in Android 10+):
-------------------------------------------
IntentService is a subclass of Service that handles asynchronous requests (Intents) one at a time
in a worker thread. It's often used for performing background tasks in response to Intents, and
it automatically stops itself when it has no more work to do.

JobScheduler (Android 5.0+):
----------------------------
JobScheduler is an API introduced in Android 5.0 (Lollipop) for scheduling background tasks that
require specific conditions, such as network connectivity or device charging. It's used to optimize
power consumption and network usage.

With the use of jobscheduler schedule a job when device met the specific condition
Like :
network connectivity
Device ideal
charging

WorkManager (Android Architecture Components):
----------------------------------------------
WorkManager is an Android library that schedules and runs background tasks. It's part of Android
Jetpack. WorkManager is used for tasks that need to run even if the app exits or the device restarts
Note : Minimum interval of workmanager is 15 min

WorkManager can run tasks:

When the app is not running
When the device is rebooted
When the user is outside the app
When the app is closed
One time only
Many times
Periodically

Link  : https://developer.android.com/courses/pathways/android-basics-compose-unit-7-pathway-1?hl=en


AIDL (Android Interface Definition Language):
---------------------------------------------
AIDL is used to create and communicate with services across different applications. It's
often used in situations where inter-process communication (IPC) is required.
These are some of the main types of services in Android, and each serves a specific purpose
in managing background tasks and providing functionality to Android applications. The choice
of which type of service to use depends on the requirements of your app and the nature of the
task you want to perform in the background.

*/
