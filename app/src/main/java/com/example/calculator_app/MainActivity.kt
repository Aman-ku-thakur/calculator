package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.calculator_app.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
 lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.buttonAllClear.setOnClickListener{
          binding.inputtext.text = " "
          binding.outputtext.text = " "
      }
        binding.buttonC.setOnClickListener{
            binding.inputtext.text = ""
        }
        binding.buttonZero.setOnClickListener{
            binding.inputtext.append("0")
        }
        binding.button1.setOnClickListener{
            binding.inputtext.append("1")
        }
        binding.button2.setOnClickListener{
            binding.inputtext.append("2")
        }
        binding.button3.setOnClickListener{
            binding.inputtext.append("3")
        }
        binding.button4.setOnClickListener{
            binding.inputtext.append("4")
        }
        binding.button5r.setOnClickListener{
            binding.inputtext.append("5")
        }
        binding.button6.setOnClickListener{
            binding.inputtext.append("6")
        }
        binding.button7.setOnClickListener{
            binding.inputtext.append("7")
        }
        binding.button8.setOnClickListener{
            binding.inputtext.append("8")
        }
        binding.button9.setOnClickListener{
            binding.inputtext.append("9")
        }
        binding.buttonDot.setOnClickListener{
            binding.inputtext.append(".")
        }

       binding.buttonAdd.setOnClickListener{
           binding.inputtext.append("+")
       }
        binding.buttonMinus.setOnClickListener{
           binding.inputtext.append("-")
       }
        binding.buttonMultiply.setOnClickListener{
           binding.inputtext.append("*")
       }
        binding.buttonDivide.setOnClickListener{
           binding.inputtext.append("/")
       }
        binding.buttonClose.setOnClickListener{
            binding.inputtext.append(")")
        }
        binding.buttonOpen.setOnClickListener{
            binding.inputtext.append("( ")
        }

binding.buttonEqualto.setOnClickListener{
    val expression =  ExpressionBuilder(binding.inputtext.text.toString()).build()
    val result = expression.evaluate()
    val longresult = result.toLong()  // dot result
if (result === longresult.toDouble()){
    binding.outputtext.text = longresult.toString()
}
    else{
        binding.outputtext.text = result.toString()
    }
}
    }



    }


