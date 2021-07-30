# Deep Linking Intent Application
Application developed to do one single task that perform deep linking intent that allows the application to has an action against specific urls.

# Who it works?
- its so simple application has MainActivity.java and modified Manifest.xml files.
1. MainActivity.java contains code to get the deep link intent data and start to parse the URL parameters
2. AndroidManifest.xml contains a special intent-filter to make deep link intent works against specific url that start with https and the host equal to secranix.com

# Note:
1. Application return back the URL parameter in Toast message.
2. Application has else condition incase the user tries to open it directly.

