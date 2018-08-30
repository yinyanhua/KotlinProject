package cn.com.yyh.kotlinapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() , View.OnClickListener {
    private var myAdapter : MyAdapter? = null

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_submit -> {
                intent = Intent(this, LoginActivity::class.java)
                startActivityForResult(intent, 1)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener(this)

        myAdapter = MyAdapter()
        list_person.adapter = myAdapter

        var listPerson : ArrayList<PersonDto>? = arrayListOf()
        for(i in 1..10){
            var personDto = PersonDto()
            personDto.name = i.toString()
            personDto.age = i
            listPerson!!.add(personDto)
        }

        for(person in listPerson!!){
            Log.i("yinyanhua", "name = " + person.name + " age = " + person.age)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == 100){
            Log.i("yinyanhua", "resultCode = " + resultCode)
        }
    }
}
