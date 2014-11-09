package com.dstammb.sneakers.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {


	
	public void onModuleLoad() {
		Button btn = new Button("Hey");
		MenuBar menu = new MenuBar();
		MenuBar visualization = new MenuBar(true);
		Command cmd = new Command(){
				public void execute() {
				Window.alert("Clicked");
				}
		};
		Command visualizeTest = new Command(){
				public void execute() {
					Window.alert("to be implemented");
				}
		
		};
		visualization.addItem("Visualize  Table", visualizeTest);
		visualization.addItem("Visualize Map", cmd);
		menu.addItem("Main", cmd);
		menu.addItem("Settings", cmd);
		menu.addItem("Visualization", visualization);
		menu.addItem("Import/Export", cmd);
		menu.addItem("Help", cmd);
		RootPanel.get().add(menu);
		VisualizeTable test = new VisualizeTable();
		Visualization example = new Visualization();
		FlexTable t = new FlexTable();
		t = test.printTable(example);
		RootPanel.get().add(t);
		PopupPanel p;
		p = test.visualizePopup(example);
		RootPanel.get().add(p);

		
		
	}

}
