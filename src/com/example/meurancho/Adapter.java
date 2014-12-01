package com.example.meurancho;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
	private List<Dados> dados;
	private LayoutInflater inflater;

	public Adapter(Context context, List<Dados> dados) {
		this.dados = dados;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return dados.size();
	}

	@Override
	public Object getItem(int position) {
		return dados.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		Dados item = dados.get(position);

		if (convertView == null)
			convertView = inflater.inflate(R.layout.item_list, parent, false);

		TextView tvText = (TextView) convertView.findViewById(R.id.text);
		CheckBox check = (CheckBox) convertView.findViewById(R.id.checkBox1);

		tvText.setText(item.getNome());

		// TODO: pegar o objeto verificar se esta pago ou não
		check.setChecked(item.isCheck());

		return convertView;
	}

}
