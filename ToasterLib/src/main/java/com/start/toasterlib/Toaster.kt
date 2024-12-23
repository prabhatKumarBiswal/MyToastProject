package com.start.toasterlib

import android.content.Context
import android.widget.Toast

class Toaster {
    public fun simpleToast(context : Context,msg : String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}