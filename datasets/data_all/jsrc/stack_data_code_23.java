// Check if no view has focus:
View view = this.getCurrentFocus();
if (view != null) {  
    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
}