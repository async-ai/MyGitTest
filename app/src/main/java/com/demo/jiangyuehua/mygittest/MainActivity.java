package com.demo.jiangyuehua.mygittest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		Toast.makeText(this,"111",0).show();

	}



	class baseAdapter extends BaseAdapter{

		private  List list;
		private Context context;
		baseAdapter(Context context,List list){
			this.list=list;
			this.context=context;
		}
		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			if (convertView==null){
				convertView= LayoutInflater.from(context).inflate(R.layout.activity_main,null);

			}

			return convertView;
		}
	}



}
