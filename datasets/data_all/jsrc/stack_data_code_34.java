@Override
public void onMessageReceived(RemoteMessage remoteMessage) { 
     Map<String, String> data = remoteMessage.getData();
     String myCustomKey = data.get("my_custom_key");

     // Manage data
}