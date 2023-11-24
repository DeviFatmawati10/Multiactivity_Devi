package com.example.multiactivity_devi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah: Button =findViewById (R.id.btn_pindah)

        btn_pindah.setOnClickListener {
            val intent =Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"Aplikasi Sedang Start",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"Aplikasi Sedang Berhenti", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Aplikasi Sedang Restart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Aplikasi Sedang Resum", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"Aplikasi Sedang Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Aplikasi Sedang Destroy", Toast.LENGTH_SHORT).show()
    }
}