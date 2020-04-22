FragmentTransaction ft = getFragmentManager().beginTransaction();
ft.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);

DetailsFragment newFragment = DetailsFragment.newInstance();

ft.replace(R.id.details_fragment_container, newFragment, "detailFragment");

// Start the animated transition.
ft.commit();