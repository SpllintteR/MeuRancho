package com.example.meurancho;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	String user;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		user = getIntent().getStringExtra("user");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.ItemsList) {
			Intent i = new Intent(MainActivity.this, ItemsListActivity.class);
			i.putExtra("user", user);
			startActivity(i);
			return true;
		} else if (id == R.id.Codigo) {
			Intent i = new Intent(MainActivity.this, Cadastrar_Codigo.class);
//			i.putExtra("user", user);
			startActivity(i);
			return true;
		}
		else{
			if (id == R.id.Search) {
				//TODO: call intent Search
				return true;
			}else{
				if (id == R.id.SearchHistory) {
					//TODO: call intent SearchHistory
					return true;
				}else{
					if (id == R.id.SelMarket) {
						Intent i = new Intent(MainActivity.this, SelMarketActivity.class);
						startActivity(i);
						return true;
					}
				}
			}
		}
		return super.onOptionsItemSelected(item);
	}
}
