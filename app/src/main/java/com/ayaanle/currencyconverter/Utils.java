package com.ayaanle.currencyconverter;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.widget.RemoteViews;

import java.util.ConcurrentModificationException;

public class Utils{
    Context context = null;
    AlertDialog.Builder builder = null;
    NotificationManager notificationManager;
    NotificationChannel notificationChannel;
    public AlertDialog dialog_initializer() {
        Context context = null;
        builder = new AlertDialog.Builder()
        // Set the message show for the Alert time
        builder.setMessage("Do you want to exit ?");

        // Set Alert Title
        builder.setTitle("Alert !");

        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        builder.setCancelable(false);
        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            // When the user click yes button then app will close

        });
        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.

        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            // If user click no then dialog box is canceled.
            dialog.cancel();
        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        return alertDialog;
        // Show the Alert Dialog box
    }


}
