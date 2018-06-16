package cn.xyiio.fuck

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import cn.xyiio.fuckprogress.FuckProgress

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var fuckProgressA : FuckProgress? = null
    private var fuckProgressB : FuckProgress? = null
    private var fuckProgressC : FuckProgress? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.simple_1_show).setOnClickListener(this)
        findViewById<Button>(R.id.simple_2_show).setOnClickListener(this)
        findViewById<Button>(R.id.simple_3_show).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {

            R.id.simple_1_show -> {
                fuckProgressA = FuckProgress(this)
                fuckProgressA?.light("Loading...")

                Handler().postDelayed( {
                    fuckProgressA?.dismiss()
                }, 3000)
            }

            R.id.simple_2_show -> {
                fuckProgressB = FuckProgress(this)
                fuckProgressB?.dark("Loading...")

                Handler().postDelayed( {
                    fuckProgressB?.dismiss()
                }, 3000)
            }

            R.id.simple_3_show -> {
                fuckProgressC = FuckProgress(this)
                fuckProgressC?.backgroundColor = Color.parseColor("#FF5722")
                fuckProgressC?.progressColor = Color.WHITE
                fuckProgressC?.messageTextColor = Color.WHITE
                fuckProgressC?.messageText = "Loading..."
                fuckProgressC?.show()

                Handler().postDelayed( {
                    fuckProgressC?.dismiss()
                }, 3000)
            }
        }
    }
}
