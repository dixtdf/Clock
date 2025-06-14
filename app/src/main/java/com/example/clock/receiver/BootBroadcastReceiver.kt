package com.example.clock.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.clock.MainActivity

class BootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            val appIntent = Intent(context, MainActivity::class.java)
            appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(appIntent)
            Log.d("BootReceiver", "App started on boot")
        }
    }
}