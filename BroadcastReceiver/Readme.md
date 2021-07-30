# Broadcast Intent application
Application developed to do one single task that perform receiving broadcast based on the action name.

# Who it works?
- its so simple application has MainActivity.java, MyReceiver.java and modified Manifest.xml files.
1. MyReceiver.java contains a class to handle the broadcast and takes specific action, in our case the action that is taken by the class is to appear a Toast message.
2. Manifest.xml contains reciever configuration and filter based on the action name.
3. MainActivity.java contains IntentFilter object and MyReceiver Object too.

# Note:
1. Application don't pass any values along with broadcasting.

