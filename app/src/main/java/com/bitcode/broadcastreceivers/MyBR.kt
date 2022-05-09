package com.bitcode.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBR : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if(intent!!.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            var status = intent.getBooleanExtra("state", false)
            Toast.makeText(context, intent!!.action + " " + status, Toast.LENGTH_LONG).show()
        }
        else {
            if(intent!!.action.equals("in.bitcode.download.COMPLETE")) {
                Toast.makeText(context, intent!!.action  + " " + intent.getStringExtra("path"), Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(context, intent!!.action, Toast.LENGTH_LONG).show()
            }
        }
    }

}