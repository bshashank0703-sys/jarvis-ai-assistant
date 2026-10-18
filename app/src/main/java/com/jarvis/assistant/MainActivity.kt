
package com.jarvis.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(3, 12, 32)
        window.navigationBarColor = Color.rgb(3, 12, 32)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(3, 12, 32))
        }

        val title = TextView(this).apply {
            text = "J.A.R.V.I.S"
            textSize = 36f
            setTextColor(Color.rgb(0, 220, 255))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "\nPERSONAL AI ASSISTANT\n\nSystem initialized.\nYour assistant is ready."
            textSize = 17f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)
        setContentView(layout)
    }
}
