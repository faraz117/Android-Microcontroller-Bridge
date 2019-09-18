package com.example.androidcontrollerbridge

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sensor.*

class SensorActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor);
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("WifiSSID");
        Toast.makeText(this, "Trying to connect to the device $msg" , Toast.LENGTH_LONG).show();
        Sensor_WifiSSID.text = msg
    }
}