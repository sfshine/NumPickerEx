package com.example.testspinner;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.hzy.tvmao.view.lib.picker.NumberPicker;

public class MainActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String[] test = new String[100];
        for (int i = 0; i < test.length; i++) {
            test[i] = "山东 " + i;
        }
        NumberPicker numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        NumberPicker numberPicker3 = (NumberPicker) findViewById(R.id.numberPicker3);
        //        numberPicker1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        //        numberPicker2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        //        numberPicker3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        numberPicker1.setSelectColor(Color.RED);
        numberPicker1.setUnSelectColor(Color.BLUE);
        
        numberPicker1.setMaxValue(test.length - 1);
        numberPicker1.setMinValue(0);
        
        numberPicker1.setDisplayedValues(test);
        
        numberPicker2.setMaxValue(test.length - 1);
        numberPicker2.setMinValue(0);
        numberPicker2.setDisplayedValues(test);
        
        numberPicker3.setMaxValue(test.length - 1);
        numberPicker3.setMinValue(0);
        numberPicker3.setDisplayedValues(test);
        
    }
    
}
