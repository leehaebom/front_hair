package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Front_hairActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
    ImageButton imgBtn=(ImageButton)findViewById(R.id.imgBtn);
    
    imgBtn.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				
				Intent intent=new Intent(Front_hairActivity.this, two.class);//this는 onClick이다 그래서 메인.this를 씀
				startActivity(intent);
			}
		});
   }
        
    }
