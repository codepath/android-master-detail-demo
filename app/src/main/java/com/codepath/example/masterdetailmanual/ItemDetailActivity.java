package com.codepath.example.masterdetailmanual;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class ItemDetailActivity extends FragmentActivity {
	ItemDetailFragment fragmentItemDetail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_detail);
		Item item = (Item) getIntent().getSerializableExtra("item");
		if (savedInstanceState == null) {
			fragmentItemDetail = ItemDetailFragment.newInstance(item);
			FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
			ft.replace(R.id.flDetailContainer, fragmentItemDetail);
			ft.commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.item_detail, menu);
		return true;
	}

}
