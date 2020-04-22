public static MyFragment newInstance(int someInt) {
    MyFragment myFragment = new MyFragment();

    Bundle args = new Bundle();
    args.putInt("someInt", someInt);
    myFragment.setArguments(args);

    return myFragment;
}