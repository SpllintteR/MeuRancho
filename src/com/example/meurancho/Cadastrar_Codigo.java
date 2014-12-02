package com.example.meurancho;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Cadastrar_Codigo extends Activity{
	Spinner categoria;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_cadastro_codigo);
		categoria = (Spinner) findViewById(R.id.spinnerCategoria);
		
		String[] nomeCategoria = {"Categoria", "teste1", "teste2"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nomeCategoria);
		categoria.setAdapter(adapter);
		
	}

}
