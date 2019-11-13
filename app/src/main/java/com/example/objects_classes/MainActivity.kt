package com.example.objects_classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var name:String? =null;
    var age:Int? = null;
    var position:String? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val mohammed = Players("mohammed" , 19 , "Defense")
//        println(mohammed.name)



    }

    fun makeplayer(view: View){

         name = NameText.text.toString();
         age = AgeText.text.toString().toIntOrNull()
        position = PositionText.text.toString();




        if (name.equals("") && !age.toString().equals("") && !position.equals(""))
        {

            val player = Players(name , age, position)
            textView.text = player.name+""+player.age+""+player.position


        }

        else
        {
            textView.text = "no no no"
        }







    }


}
