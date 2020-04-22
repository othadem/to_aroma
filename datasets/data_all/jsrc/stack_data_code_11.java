/**
 * @param context used to check the device version and DownloadManager information
 * @return true if the download manager is available
 */
public static boolean isDownloadManagerAvailable(Context context) {

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
        return true;
    }
    return false;
}