package com.example.laba2

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.bottom_navigation_activity.*
import kotlinx.android.synthetic.main.garden_activity.*

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_navigation_activity)
        botnav.setOnNavigationItemSelectedListener(navListener)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
                GardenFragment()).commit()
        }
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            botnav.visibility = View.VISIBLE
        }
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            botnav.visibility = View.GONE
        }
    }
    private val navListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.placeBottom -> selectedFragment = GardenFragment()
                R.id.listBottom -> selectedFragment = DirectoryFragment()
                R.id.circleBottom -> selectedFragment = GardenFragment()
                R.id.starBottom -> selectedFragment = GardenFragment()
                R.id.infoBottom -> selectedFragment = GardenFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
                selectedFragment!!).commit()
            true
        }

    //private fun getScreenOrientation(): String? {
    //    return if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) "Портретная ориентация"
    //    else if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) "Альбомная ориентация"
    //    else ""
    //}

    fun showSquirrelDialog(view: View){
        dialogWindowImageView.visibility = View.VISIBLE
        squirrelDialogImageView.visibility = View.VISIBLE
    }
    fun hideSquirrelDialog(view: View){
        dialogWindowImageView.visibility = View.INVISIBLE
        squirrelDialogImageView.visibility = View.INVISIBLE
    }
    fun showSpruceDialog(view: View){
        spruceDialogImageView.visibility = View.VISIBLE
        spruceWindowDialogImageView.visibility = View.VISIBLE
    }
    fun hideSpruceDialog(view: View){
        spruceDialogImageView.visibility = View.INVISIBLE
        spruceWindowDialogImageView.visibility = View.INVISIBLE
    }
    fun GoBack(view: View){
        val intent = Intent(this, BottomNavigationActivity::class.java)
        startActivity(intent)
    }
    fun MoveToDescription(view: View){
        supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
            DescriptionFragment()).commit()
    }
    fun GoBack2(view: View){
        supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
            DirectoryFragment()).commit()
    }

}