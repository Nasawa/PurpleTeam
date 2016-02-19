package com.anigeek.purpleteam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Christopher on 2/19/2016.
 */
public class Poly extends AppCompatActivity
{
	Context context;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		context = this;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		int id = item.getItemId();

		Intent intent;

		switch(id)
		{
			case R.id.action_home:
				intent = new Intent(context, MainActivity.class);
				break;
			case R.id.action_alarm:
				intent = new Intent(context, AlarmActivity.class);
				break;
			case R.id.action_calendar:
				intent = new Intent(context, CalendarActivity.class);
				break;
			case R.id.action_gps:
				intent = new Intent(context, GPSActivity.class);
				break;
			default:
				intent = null;
		}
		if(intent != null && intent.getComponent().compareTo(getComponentName()) != 0)
		{
			startActivity(intent);
			finish();
		}

		return super.onOptionsItemSelected(item);
	}
}
