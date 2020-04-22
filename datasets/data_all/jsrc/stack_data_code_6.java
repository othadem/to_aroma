try {
    PackageInfo pInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
    String version = pInfo.versionName;
} catch (PackageManager.NameNotFoundException e) {
    e.printStackTrace();
}