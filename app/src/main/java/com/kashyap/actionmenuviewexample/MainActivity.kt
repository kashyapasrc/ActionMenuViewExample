package com.kashyap.actionmenuviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.ActionMenuView

class MainActivity : AppCompatActivity() {

    private lateinit var mActionMenuView: ActionMenuView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mActionMenuView = findViewById(R.id.toolbar_bottom)

        val bottomMenu=mActionMenuView.menu

        menuInflater.inflate(R.menu.menu_actionview,bottomMenu)

        for ( i in 0 until bottomMenu.size()){
            bottomMenu.getItem(i).setOnMenuItemClickListener(object : MenuItem.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {

                    Toast.makeText(applicationContext,item!!.title,Toast.LENGTH_LONG).show()

                    return true
                }

            })

        }


    }
}