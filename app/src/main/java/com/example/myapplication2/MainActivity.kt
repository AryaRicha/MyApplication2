package com.example.myapplication2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       b1.setOnClickListener{
           var i = Intent()
           i.action=Intent.ACTION_DIAL
           i.data=Uri.parse("tel:"+et1.text.toString())
        startActivity(i)
    }
        b2.setOnClickListener{
            var i = Intent(this@MainActivity,
                                                            WelcomeActivity::class.java)
            i.putExtra("name",et2.text.toString())
            i.putExtra("qual",et3.text.toString())
            startActivity(i)
        }
        b3.setOnClickListener {
            var i = packageManager.getLaunchIntentForPackage("com.indiabix")
            if (i != null)
                startActivity(i)
            else {
                var i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("https://play.google.com/store/apps/details?id=com.indiabix")
                startActivity(i1)
            }
        }
            b4.setOnClickListener{
                var i = Intent()
                i.action=Intent.ACTION_GET_CONTENT
                i.type="*/*"
                startActivity(i)
            }

         b5.setOnClickListener{
            var i = Intent(this@MainActivity,
                                                            WelcomeActivity::class.java)
            i.putExtra("marks",et4.text.toString())
            startActivity(i)
        }


    }
}
