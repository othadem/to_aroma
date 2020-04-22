activity.runOnUiThread(new Runnable() {
  public void run() {
    Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show();
  }
});