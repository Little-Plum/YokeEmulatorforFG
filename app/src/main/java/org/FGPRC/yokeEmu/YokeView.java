package org.FGPRC.yokeEmu;
import android.view.*;
import android.hardware.*;
import android.app.*;
import android.content.*;

public abstract class YokeView extends SurfaceView implements Runnable,SurfaceHolder.Callback,SensorEventListener
	{

		@Override
		public void surfaceCreated ( SurfaceHolder p1 )
			{
				// TODO: Implement this method
			}

		@Override
		public void surfaceChanged ( SurfaceHolder p1, int p2, int p3, int p4 )
			{
				// TODO: Implement this method
			}

		@Override
		public void surfaceDestroyed ( SurfaceHolder p1 )
			{
				// TODO: Implement this method
			}

		@Override
		public void onSensorChanged ( SensorEvent p1 )
			{
				// TODO: Implement this method
			}

		@Override
		public void onAccuracyChanged ( Sensor p1, int p2 )
			{
				// TODO: Implement this method
			}

		@Override
		public void run ( )
			{
				// TODO: Implement this method
			}
		
	public YokeView(Activity activity){
		super(activity);
	}
	public void calibrate(){}
	public void checksensor(Sensor sensor){
		if(sensor==null||sensor.getName()==null){
			AlertDialog.Builder adb=new AlertDialog.Builder(getContext());
			adb.setTitle(R.string.error);
			adb.setMessage("Seemed no matched sensor could be found");
			adb.setPositiveButton(R.string.ok,null);
			adb.create().show();
		}
	}
	
}
