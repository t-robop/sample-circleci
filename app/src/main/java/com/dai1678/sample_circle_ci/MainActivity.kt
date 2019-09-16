package com.dai1678.sample_circle_ci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val answerValidator = AnswerValidator()

        answerInput.addTextChangedListener(answerValidator)

        answerButton.setOnClickListener { view ->
            if (answerValidator.isValid) {
                Snackbar.make(view, "正解!", Snackbar.LENGTH_LONG).show()
            } else {
                Snackbar.make(view, "不正解..", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
