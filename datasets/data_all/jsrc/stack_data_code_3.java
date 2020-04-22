TextView textView = (TextView) view.findViewById(R.id.textview);
SpannableString content = new SpannableString("Content");
content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
textView.setText(content);