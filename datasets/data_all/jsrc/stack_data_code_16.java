LocationListener locationListener = new MyLocationListener();
locationManager.requestLocationUpdates(
LocationManager.GPS_PROVIDER, 5000, 10, locationListener);