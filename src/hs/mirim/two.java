package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class two extends Activity{

	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.two);
	        Button btn1=(Button)findViewById(R.id.button1);
	        Button btn2=(Button)findViewById(R.id.button2);
	        Button btn3=(Button)findViewById(R.id.button3);
	        btn1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(two.this, top.class);//this�� onClick�̴� �׷��� ����.this�� ��
					startActivity(intent);
				}
			});
	
	        btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent2=new Intent(two.this, middle.class);//this�� onClick�̴� �׷��� ����.this�� ��
					startActivity(intent2);
				}
			});
	        
	        btn3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent3=new Intent(two.this, bottom.class);//this�� onClick�̴� �׷��� ����.this�� ��
					startActivity(intent3);
				}
			});
	       
	 }//onCreate
	 	
}
