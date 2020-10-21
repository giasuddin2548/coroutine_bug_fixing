package com.genxmultiplexer.coroutinefundemental

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.genxmultiplexer.coroutinefundemental.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: Model
    private var count: Int = 0

    private val arrayList = ArrayList<Database>()
    private val adapter = Adapter(arrayList)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(Model::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel



        binding.recyclerViewId.setHasFixedSize(false)
        binding.recyclerViewId.layoutManager = GridLayoutManager(this, 1)
        binding.recyclerViewId.adapter = adapter


        CoroutineScope(IO).launch {
            Log.i("MYTAG","Calculation started")
            val stact1=viewModel.getStock1()
            val stact2=viewModel.getStock2()
            val stact3=viewModel.getStock3()
            val stact4=viewModel.getStock4()
            val totalStack=stact1+stact2+stact3+stact4

            Log.i("MYTAG","Total Stack=$totalStack")

        }


/*

        viewModel.downloadData.observe(this, Observer {
            binding.texviewId.text = it
        })

        viewModel.coutData.observe(this, Observer {
            binding.texviewId.text = it.toString()
        })

        viewModel.listData.observe(this, Observer {

            for (index in it) {

                Log.d("MYTAG", "Downloading $index")

            }

        })

        binding.buttonCountId.setOnClickListener {

            viewModel.updateCount()

        }

        binding.buttonListId.setOnClickListener {
            viewModel.updateList()

        }

        binding.buttonDownloadId.setOnClickListener{
            CoroutineScope(Dispatchers.Main).launch {
                viewModel.download()

            }
        }




 */

    }
}








