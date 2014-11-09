package com.dstammb.sneakers.client;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.PopupPanel;

public class VisualizeTable extends Visualization {
	public FlexTable printTable(Visualization v) {
	FlexTable t = new FlexTable();
	int row = 0;
	int column = 0;
	t.setText(row,column,"country");
	t.setText(row, ++column,"region");
	t.setText(row, ++column, "year");
	t.setText(row, ++column, "goods");
	t.setText(row, ++column, "data");
	t.setText(row, ++column, "unit");
	column = 0;
	row = fillRow(t, row, v);
	
	return t;
	}
	public PopupPanel visualizePopup(Visualization v) {
		PopupPanel p = new PopupPanel();
		FlexTable t;
		t = printTable(v);
		p.add(t);
		return p;
	}
	public int fillRow(FlexTable t, int row, Visualization v) {
		int column = 0;
		t.setText(++row, column, v.getCountry());
		t.setText(row, ++column, v.getRegion());
		t.setText(row, ++column, v.getYear());
		t.setText(row, ++column, v.getGoods());
		t.setText(row, ++column, "v.getData()");
		t.setText(row, ++column, v.getUnit());
		return row;
	}
	
	}
	

