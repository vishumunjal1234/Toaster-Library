package com.vishavraj.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by vishavraj on 26/09/18.
 */

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
