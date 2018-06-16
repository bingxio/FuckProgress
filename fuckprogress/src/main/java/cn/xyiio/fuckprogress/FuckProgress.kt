package cn.xyiio.fuckprogress

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.view.LayoutInflater
import android.widget.TextView

/*
 * author: Turaiiao
 * date: 2018/6/15 20:38
 * email: 1171840237@qq.com
 * ver: 0.0.2
 */
@SuppressLint("InflateParams")
class FuckProgress(context: Context) {

    private var context: Context? = null

    private var view: View? = null
    private var content: TextView? = null
    private var progress: ProgressBar? = null
    private var linear: LinearLayout? = null
    private var builder: AlertDialog.Builder? = null
    private var dialog: Dialog? = null

    var messageText : String? = "FuckProgressText"
    var messageTextColor : Int? = Color.parseColor("#8A000000")
    var messageTextSize : Float? = 15F
    var progressColor : Int? = Color.parseColor("#E91E63")
    var backgroundColor : Int? = Color.parseColor("#FFFFFF")
    var canCancel : Boolean? = true

    init {
        this.context = context

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        view = inflater.inflate(R.layout.progress, null)

        content = view?.findViewById(R.id.content)
        progress = view?.findViewById(R.id.loader)
        linear = view?.findViewById(R.id.linear)
        builder = AlertDialog.Builder(context)
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    fun setContent(msg: String) : FuckProgress {
        messageText = msg
        return this
    }

    fun setContentColor(color: Int) : FuckProgress {
        messageTextColor = color
        return this
    }

    fun setContentTextSize(size: Float) : FuckProgress {
        messageTextSize = size
        return this
    }

    fun setProgressColor(color: Int) : FuckProgress {
        progressColor = color
        return this
    }

    fun setBackgroundColor(color: Int) : FuckProgress {
        backgroundColor = color
        return this
    }

    fun setCancel(canCel: Boolean) : FuckProgress {
        canCancel = canCel
        return this
    }

    fun light(msg: String) {
        messageText = msg
        show()
    }

    fun dark(msg: String) {
        backgroundColor = Color.parseColor("#000000")
        progressColor = Color.parseColor("#FFFFFF")
        messageTextColor = Color.parseColor("#FFFFFF")
        messageText = msg
        show()
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /* The Chinese meaning of this function is "installation worker". >_ !! */
    private fun seter() {
        content?.text = messageText
        content?.setTextColor(messageTextColor!!)
        content?.textSize = messageTextSize!!
        progress?.indeterminateTintList = ColorStateList.valueOf(progressColor!!)
        linear?.setBackgroundColor(backgroundColor!!)
    }

    fun show() {
        seter()

        builder?.setView(view)
        dialog = builder?.create()
        dialog!!.setCancelable(canCancel!!)
        dialog!!.show()
    }

    fun dismiss() {
        dialog!!.dismiss()
    }
}