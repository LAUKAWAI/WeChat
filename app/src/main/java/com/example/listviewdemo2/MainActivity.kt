package com.example.listviewdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HeaderViewListAdapter
import android.widget.Toast
import com.example.listviewdemo2.R.layout
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import com.example.listviewdemo2.R.layout.fruit_head as fruit_head1

class MainActivity : AppCompatActivity() {
    //private val data = listOf("苹果", "香蕉", "哈密瓜", "月饼", "荔枝", "桂圆", "毛桃", "腊肠", "肠粉", "芒果", "西瓜")
    private val fruitList= ArrayList<Fruit>()



    fun initFruits(){
        repeat(3){
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
            fruitList.add(Fruit("19移动总群","[动态表情]",R.drawable.touxiang))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        initFruits()
        //上下文，列表子视图，数据源
        //val adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, data)
        val fruitAdapter = FruitAdapter(this, layout.fruit_item, fruitList)

        //绑定到控件
        //listViewTest.adapter = adapter;
        listViewTest.adapter = fruitAdapter;


        listViewTest.setOnItemClickListener { _, _, i, _ ->
            val fruit = fruitList[i]
            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
    }

}
}