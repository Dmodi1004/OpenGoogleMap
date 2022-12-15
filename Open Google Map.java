binding.map.setOnClickListener(view -> {
            openMap();
        });
		
		
private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Sardar Patel University, Mota Bazaar, Vallabh Vidyanagar, Anand, Gujarat");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }