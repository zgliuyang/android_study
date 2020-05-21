package com.liuyang.ledctrl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import com.liuyang.hardlibrary.*;

public class MainActivity extends Activity {
	
	private Button button = null;
	private CheckBox checkBoxLed1 = null;
	private CheckBox checkBoxLed2 = null;
	private CheckBox checkBoxLed3 = null;
	private CheckBox checkBoxLed4 = null;
	private boolean ledon = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button)findViewById(R.id.BUTTON);
        HardControl.ledOpen();
        checkBoxLed1 = (CheckBox)findViewById(R.id.LED1);
        checkBoxLed2 = (CheckBox)findViewById(R.id.LED2);
        checkBoxLed3 = (CheckBox)findViewById(R.id.LED3);
        checkBoxLed4 = (CheckBox)findViewById(R.id.LED4);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				HardControl hardcontrl = new HardControl();
				
				ledon = !ledon;
				if(ledon)
				{
					button.setText("LED ALL OFF");
					checkBoxLed1.setChecked(ledon);
					checkBoxLed2.setChecked(ledon);
					checkBoxLed3.setChecked(ledon);
					checkBoxLed4.setChecked(ledon);
					for (int i = 0; i < 4; i++)
						HardControl.ledCtrl(i, 1);
				}
				else
					button.setText("LED ALL ON");
					checkBoxLed1.setChecked(ledon);
					checkBoxLed2.setChecked(ledon);
					checkBoxLed3.setChecked(ledon);
					checkBoxLed4.setChecked(ledon);
					for (int i = 0; i < 4; i++)
						HardControl.ledCtrl(i, 0);
			}
		});
    }
    
    public void onCheckboxClicked(View view) {
    	boolean checked = ((CheckBox)view).isChecked();
    	switch(view.getId()) {
    	case R.id.LED1:
    		if(checked)
    		{
    			Toast.makeText(getApplicationContext(), "LED1 ON", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(0, 1);
    		}
    		else
    		{
    			Toast.makeText(getApplicationContext(), "LED1 OFF", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(0, 0);
    		}
    		break;
    		
    	case R.id.LED2:
    		if(checked)
    		{
    			Toast.makeText(getApplicationContext(), "LED2 ON", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(1, 1);
    		}
    		else
    		{
    			Toast.makeText(getApplicationContext(), "LED2 OFF", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(1, 0);
    		}
    		break;
    		
    	case R.id.LED3:
    		if(checked)
    		{
    			Toast.makeText(getApplicationContext(), "LED3 ON", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(2, 1);
    		}
    		else
    		{
    			Toast.makeText(getApplicationContext(), "LED3 OFF", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(2, 0);
    		}
    		break;
    		
    	case R.id.LED4:
    		if(checked)
    		{
    			Toast.makeText(getApplicationContext(), "LED4 ON", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(3, 1);
    		}
    		else
    		{
    			Toast.makeText(getApplicationContext(), "LED4 OFF", Toast.LENGTH_SHORT).show();
    			HardControl.ledCtrl(3, 0);
    		}
    		break;
    		
    	}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
