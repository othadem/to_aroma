//Remove title bar
this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//set content view AFTER ABOVE sequence (to avoid crash)
this.setContentView(R.layout.your_layout_name_here);