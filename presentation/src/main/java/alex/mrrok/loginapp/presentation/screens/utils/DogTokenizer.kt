package alex.mrrok.loginapp.presentation.screens.utils

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.util.Log
import android.widget.MultiAutoCompleteTextView

class DogTokenizer : MultiAutoCompleteTextView.Tokenizer {
    override fun findTokenEnd(text: CharSequence?, cursor: Int): Int {
        var i = cursor
        while (i > 1 && text!![i - 1] != '@') {
            i--
        }
        while (i < cursor && text!![i] == '@') {
            i++
        }

        return i
    }

    override fun findTokenStart(text: CharSequence?, cursor: Int): Int {
        var i = cursor
        while (i > 1 && text?.get(i - 1) !== '@' && text?.get(i - 1) !== '\n') {
            i--
        }
        while (i < cursor && (text?.get(i) === '@' || text?.get(i) === '\n')) {
            i++
        }

        Log.e("findTokenStart", i.toString())
        return i
    }

    override fun terminateToken(text: CharSequence?): CharSequence {
        Log.e("terminateToken", "WOrk")
        var i = text?.length!!

        while (i > 1 && text[i - 1] == '@') {
            i--
        }
        if (!(i <= 1 || text[i - 1] != '@')) {
            return text;
        } else {
            if (text is Spannable) {
                val sp = SpannableString(text.toString() + " ")
                TextUtils.copySpansFrom(text as Spanned, 0, text.length,
                        Any::class.java, sp, 0)
                return sp
            } else {
                return text.toString() + ""
            }
        }
    }
}