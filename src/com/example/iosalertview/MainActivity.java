package com.example.iosalertview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button single_uialertview;
	private Button single_alertdialog;
	private Button double_uialertview;
	private Button double_alertdialog;
	private Button three_uialertview;
	private Button three_alertdialog;
	
	private CustomDialog.Builder ibuilder;
	private AlertDialog.Builder abuilder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		single_uialertview = (Button) findViewById(R.id.single_uialertview);
		single_alertdialog = (Button) findViewById(R.id.single_alertdialog);
		double_uialertview = (Button) findViewById(R.id.double_uialertview);
		double_alertdialog = (Button) findViewById(R.id.double_alertdialog);
		three_uialertview = (Button) findViewById(R.id.three_uialertview);
		three_alertdialog = (Button) findViewById(R.id.three_alertdialog);
		
		single_uialertview.setOnClickListener(this);
		single_alertdialog.setOnClickListener(this);
		double_uialertview.setOnClickListener(this);
		double_alertdialog.setOnClickListener(this);
		three_uialertview.setOnClickListener(this);
		three_alertdialog.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.single_uialertview:
			ibuilder = new CustomDialog.Builder(MainActivity.this);
			ibuilder.setTitle(R.string.prompt);
			ibuilder.setMessage(R.string.exit_app);
			ibuilder.setPositiveButton(R.string.confirm, null);
			ibuilder.create().show();
			break;
		case R.id.single_alertdialog:
			abuilder = new AlertDialog.Builder(MainActivity.this);
			abuilder.setTitle(R.string.prompt);
			abuilder.setMessage(R.string.exit_app);
			abuilder.setPositiveButton(R.string.confirm, null);
			abuilder.create().show();
			break;
		case R.id.double_uialertview:
			ibuilder = new CustomDialog.Builder(MainActivity.this);
			ibuilder.setTitle(R.string.prompt);
			ibuilder.setMessage(R.string.exit_app);
			ibuilder.setPositiveButton(R.string.confirm, null);
			ibuilder.setNegativeButton(R.string.cancel, null);
			ibuilder.create().show();
			break;
		case R.id.double_alertdialog:
			abuilder = new AlertDialog.Builder(MainActivity.this);
			abuilder.setTitle(R.string.prompt);
			abuilder.setMessage(R.string.exit_app);
			abuilder.setPositiveButton(R.string.confirm, null);
			abuilder.setNegativeButton(R.string.cancel, null);
			abuilder.create().show();
			break;
		case R.id.three_uialertview:
			ibuilder = new CustomDialog.Builder(MainActivity.this);
			ibuilder.setTitle(R.string.prompt);
			ibuilder.setMessage(R.string.exit_app);
			ibuilder.setPositiveButton(R.string.confirm, null);
			ibuilder.setNegativeButton(R.string.cancel, null);
			ibuilder.setNeutralButton(R.string.dismiss, null);
			ibuilder.create().show();
			break;
		case R.id.three_alertdialog:
			abuilder = new AlertDialog.Builder(MainActivity.this);
			abuilder.setTitle(R.string.prompt);
			abuilder.setMessage(R.string.exit_app);
			abuilder.setPositiveButton(R.string.confirm, null);
			abuilder.setNegativeButton(R.string.cancel, null);
			abuilder.setNeutralButton(R.string.dismiss, null);
			abuilder.create().show();
			break;

		default:
			break;
		}
	}

}
