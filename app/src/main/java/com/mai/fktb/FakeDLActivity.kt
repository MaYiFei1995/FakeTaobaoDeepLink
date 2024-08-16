package com.mai.fktb

import android.app.Activity
import android.os.Bundle

class FakeDLActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }

}
