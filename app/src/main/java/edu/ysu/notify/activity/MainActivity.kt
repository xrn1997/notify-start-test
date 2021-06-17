package edu.ysu.notify.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.ysu.notify.R
import edu.ysu.notify.databinding.ActivityMainBinding

/**
 * @author xrn1997
 * @date 2021/6/17
 */
class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView: View = binding.root
        setContentView(rootView)
    }
}