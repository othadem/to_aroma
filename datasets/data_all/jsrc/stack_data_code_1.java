// text2 has links specified by putting <a> tags in the string
    // resource.  By default these links will appear but not
    // respond to user input.  To make them active, you need to
    // call setMovementMethod() on the TextView object.

    TextView t2 = (TextView) findViewById(R.id.text2);
    t2.setMovementMethod(LinkMovementMethod.getInstance());