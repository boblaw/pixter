package org.example.sudoku;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.example.sudoku.image;

public class StartupBroadcastRecevie extends BroadcastReceiver {

@Override
public void onReceive(Context context, Intent intent) {
Intent startupIntent = new Intent(context, image.class); // substitute with your launcher class
startupIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
context.startActivity(startupIntent);
}

}
