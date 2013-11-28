package com.example.swengtutorial;

/**
 * @author kasikci
 */
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class ShowMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_message);
		Intent startingIntent = getIntent();
		String userText = startingIntent.getStringExtra(MainActivity.class.getName());
		TextView textView = (TextView) findViewById(R.id.displayed_text);
		textView.setText(userText);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_message, menu);
		return true;
	}

}
