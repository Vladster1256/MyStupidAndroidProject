package ctec.example.mystuipidadroidproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StuipdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stuipd);
		
		//Gives you access to a button or any view object
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.stupidTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		setupListeners();
	}
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.uglyGreen);
				
			}
			
		});
	}
}
