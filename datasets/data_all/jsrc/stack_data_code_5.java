int sdk = android.os.Build.VERSION.SDK_INT;
if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
    setBackgroundDrawable();
} else {
    setBackground();
}