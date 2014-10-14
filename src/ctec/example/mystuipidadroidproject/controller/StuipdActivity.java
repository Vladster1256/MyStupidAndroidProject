package ctec.example.mystuipidadroidproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Stupid activity controls the app for StuipdAndroidProject
 * @author Vladster1256
 * @version 1.0
 */
public class StuipdActivity extends Activity
{
	private Button appButton;
	private Button appButton1;
	private TextView appText;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList; 
	
	/**
	 * onCreate is the constructor, we construct what our buttons are!!!!!!!!!!!!1
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stuipd);
		
		//Gives you access to a button or any view object
		appButton = (Button) findViewById(R.id.firstButton);
		appButton1 = (Button) findViewById(R.id.secondButton);
		appText = (TextView) findViewById(R.id.stupidTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		//Created an array list called colorList
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
	}
	
	/**
	 * We add colors to colorList with fillTheColorList Object
	 */
	private void fillTheColorList()
	{
		colorList.add(R.color.uglyRed);	
		colorList.add(R.color.black);
		colorList.add(R.color.otherBlack);
		colorList.add(R.color.uglyGreen);
	}
	
	/**
	 * our listeners that listens to activity
	 */
	private void setupListeners()
	{
		/**
		 * our appButton(firstButton) is what is listening to clicks
		 */
		appButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			/**
			 * When we click the button, we set the background as a random color in the array list
			 */
			public void onClick(View v)
			{
				int randomPosition=(int) (Math.random()*colorList.size());
				appLayout.setBackgroundResource(colorList.get(randomPosition));
				
			}
			
		});
		appButton1.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				appLayout. setBackgroundResource(R.color.uglyGreen);
			}
					
				
		});
	}
}
