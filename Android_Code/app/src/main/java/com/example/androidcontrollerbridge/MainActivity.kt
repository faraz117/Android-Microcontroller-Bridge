package com.example.androidcontrollerbridge

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Service , Broadcast Receiver ,Content Provider and Activities are
    // parts of an android app.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        connectButton.setOnClickListener {
            Log.i("MainActivity", "Button Collect Tapped");
            val ssid: String = deviceSSID.text.toString();
            val pass: String = deviceKey.text.toString();
            Toast.makeText(this, "Trying to connect to the device $ssid", Toast.LENGTH_LONG).show();
        }
        goToSensorData.setOnClickListener {
            Log.i("MainActivity", "Going to sensor data");
            //implicit intent because we do not know our target activity
            //explicit intent because we know our target activity
            val intent = Intent(this,SensorActivity::class.java);
            intent.putExtra("WifiSSID",deviceSSID.text.toString());
            startActivity(intent);

        }
    }
    private fun checkConnectivity(){
        val cm= getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.
    }
}
