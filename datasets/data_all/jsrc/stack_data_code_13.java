Intent returnIntent = new Intent();
returnIntent.putExtra("result",result);
setResult(Activity.RESULT_OK,returnIntent);
finish();