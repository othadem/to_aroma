File imgFile = new  File("/sdcard/Images/test_image.jpg");

if(imgFile.exists()){

    Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

    ImageView myImage = (ImageView) findViewById(R.id.imageviewTest);

    myImage.setImageBitmap(myBitmap);

}