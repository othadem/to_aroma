import android.provider.Settings.Secure;

private String android_id = Secure.getString(getContext().getContentResolver(),
                                                        Secure.ANDROID_ID);