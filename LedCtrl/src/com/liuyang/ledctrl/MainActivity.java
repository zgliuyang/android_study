package com.liuyang.ledctrl;

<<<<<<< HEAD
import android.R.bool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {
	
	private Button button = null;
	private CheckBox checkBoxLed1 = null;
	private CheckBox checkBoxLed2 = null;
	private CheckBox checkBoxLed3 = null;
	private CheckBox checkBoxLed4 = null;
	private boolean ledon = false;
=======
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
>>>>>>> 84b6759ef3e9dd3b8f25d9572bf6285cdff8f952

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        
        button = (Button)findViewById(R.id.BUTTON);
        checkBoxLed1 = (CheckBox)findViewById(R.id.LED1);
        checkBoxLed2 = (CheckBox)findViewById(R.id.LED2);
        checkBoxLed3 = (CheckBox)findViewById(R.id.LED3);
        checkBoxLed4 = (CheckBox)findViewById(R.id.LED4);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ledon = !ledon;
				if(ledon)
				{
					button.setText("LED ALL OFF");
					checkBoxLed1.setChecked(ledon);
					checkBoxLed2.setChecked(ledon);
					checkBoxLed3.setChecked(ledon);
					checkBoxLed4.setChecked(ledon);
				}
				else
					button.setText("LED ALL ON");
					checkBoxLed1.setChecked(ledon);
					checkBoxLed2.setChecked(ledon);
					checkBoxLed3.setChecked(ledon);
					checkBoxLed4.setChecked(ledon);
			}
		});
=======
>>>>>>> 84b6759ef3e9dd3b8f25d9572bf6285cdff8f952
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
