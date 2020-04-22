/// Converts 14 dip into its equivalent px

Resources r = getResources();
float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 14, r.getDisplayMetrics());