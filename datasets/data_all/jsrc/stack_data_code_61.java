RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)button.getLayoutParams();
params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
params.addRule(RelativeLayout.LEFT_OF, R.id.id_to_be_left_of);

button.setLayoutParams(params); //causes layout update