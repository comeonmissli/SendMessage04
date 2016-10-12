package com.example.sendmessage04;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText mess,num;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn=(Button) this.findViewById(R.id.btn);
		num=(EditText) this.findViewById(R.id.num);
		mess=(EditText) this.findViewById(R.id.mess);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String mobile=num.getText().toString();
				String content=mess.getText().toString();
				Intent intent =new Intent();
				intent.setData(Uri.parse("smsto£º"+mobile));
				intent.putExtra("sma_body", content);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
