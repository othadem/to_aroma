Date dt = getSomeDate();
prefs.edit().putLong(dateTimeKey, dt.getTime()).apply();