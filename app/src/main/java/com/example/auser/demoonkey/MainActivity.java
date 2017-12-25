package com.example.auser.demoonkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview2);

//        editText=(EditText)findViewById(R.id.editText1);
//        textView=(TextView)findViewById(R.id.textView1);
//
//        editText.setOnKeyListener(listener);


    }

    View.OnKeyListener listener=new View.OnKeyListener(){
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction()==KeyEvent.ACTION_DOWN && keyCode==KeyEvent.KEYCODE_NUMPAD_ENTER){
                String text=editText.getText().toString();
                boolean isMultiLine=text.contains("\n");
                if (isMultiLine)
                    text=text.replace("\n","");
                textView.setText(text);
                editText.setText("");
            }
            return false;
        }
    };
}
