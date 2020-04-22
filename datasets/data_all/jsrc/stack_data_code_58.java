private static class MyHandler extends Handler {}
private final MyHandler mHandler = new MyHandler();

public static class MyRunnable implements Runnable {
    private final WeakReference<Activity> mActivity;

    public MyRunnable(Activity activity) {
        mActivity = new WeakReference<>(activity);
    }

    @Override
    public void run() {
        Activity activity = mActivity.get();
        if (activity != null) {
            Button btn = (Button) activity.findViewById(R.id.button);
            btn.setBackgroundResource(R.drawable.defaultcard);
        }
    }
}

private MyRunnable mRunnable = new MyRunnable(this);

public void onClick(View view) {
    my_button.setBackgroundResource(R.drawable.icon);

    // Execute the Runnable in 2 seconds
    mHandler.postDelayed(mRunnable, 2000);
}