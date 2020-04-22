/* put this into your activity class */
  private SensorManager mSensorManager;
  private float mAccel; // acceleration apart from gravity
  private float mAccelCurrent; // current acceleration including gravity
  private float mAccelLast; // last acceleration including gravity

  private final SensorEventListener mSensorListener = new SensorEventListener() {

    public void onSensorChanged(SensorEvent se) {
      float x = se.values[0];
      float y = se.values[1];
      float z = se.values[2];
      mAccelLast = mAccelCurrent;
      mAccelCurrent = (float) Math.sqrt((double) (x*x + y*y + z*z));
      float delta = mAccelCurrent - mAccelLast;
      mAccel = mAccel * 0.9f + delta; // perform low-cut filter
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
  };

  @Override
  protected void onResume() {
    super.onResume();
    mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
  }

  @Override
  protected void onPause() {
    mSensorManager.unregisterListener(mSensorListener);
    super.onPause();
  }