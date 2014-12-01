package com.example.meurancho;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Spinner;

public class ItemsListActivity extends Activity {
	Spinner categoria;
	GridView gridItens;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_items_list);
		
		categoria = (Spinner) findViewById(R.id.spinnerCategoria);
		gridItens=  (GridView) findViewById(R.id.grid_list);
		
		
		String[] nomeCategoria = {"Categoria", "teste1", "teste2"};
		List<Dados> itens = new ArrayList<Dados>();
		itens.add(new Dados("feijão", false));
		itens.add(new Dados("arroz", false));
		itens.add(new Dados("pudim", false));
	    
		Adapter adapter1 = new Adapter(this, itens);
//		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nomeCategoria);
		categoria.setAdapter(adapter);
		
		gridItens.setAdapter(adapter1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.items_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
