String value="Hello world";
Intent i = new Intent(CurrentActivity.this, NewActivity.class);    
i.putExtra("key",value);
startActivity(i);