package com.app.hellolibrary;

import android.content.Context;
import android.widget.Toast;

public class HelloToast {
    public static void showHelloToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
