package com.example.swengtutorial;

/**
 * @author kasikci
 */
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void displayMessage(View view) {
		Toast.makeText(this, "You clicked Display!", Toast.LENGTH_SHORT).show();
		EditText editText = (EditText) findViewById(R.id.edit_text);
		String userText = editText.getText().toString();
		Intent displayActivityIntent = new Intent(this, ShowMessageActivity.class);
		// Use as key the activity that initiates the new activity
		displayActivityIntent.putExtra(this.getClass().getName(), userText);
		startActivity(displayActivityIntent);
	}
	
}
