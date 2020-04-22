class  C{
    public void m(View v) {
        System.out.println("v is " + v);
        switch (v.getId()) {
        case R.id.btn_yes:
          System.out.println("came into case YES");
          c.finish();
        case R.id.btn_no:
          System.out.println("came into case NO");
          dismiss();
        default:
          break;
        }
        dismiss();
    }
}