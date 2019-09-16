package com.dai1678.sample_circle_ci

import android.text.Editable
import android.text.TextWatcher

class AnswerValidator : TextWatcher {
    internal var isValid = false

    override fun afterTextChanged(editableText: Editable) {
        isValid = isValidAnswer(editableText.toString())
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = Unit

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = Unit

    companion object {

        private const val ANSWER = "robop"

        fun isValidAnswer(answer: CharSequence?): Boolean {
            return answer == ANSWER
        }
    }
}
