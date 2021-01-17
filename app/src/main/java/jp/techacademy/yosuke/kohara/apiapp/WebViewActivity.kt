package jp.techacademy.yosuke.kohara.apiapp
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView.loadUrl(intent.getStringExtra(KEY_URL).toString())


        //課題対応　追記3
        supportActionBar!!.hide()

        val shopid =intent.getStringExtra("id")
        val shopname =intent.getStringExtra("name")
        val shopaddress =intent.getStringExtra("address")
        val shoplogoimage =intent.getStringExtra("imageUrl")
        val shopurl =intent.getStringExtra("url")

        button2.setOnClickListener {
            //追加の指示
            FavoriteShop.insert(FavoriteShop().apply {
                id = shopid
                name = shopname
                //課題対応　追記2　address2
                address = shopaddress
                imageUrl = shoplogoimage
                url = shopurl
            })

            button2.setEnabled(false)
            button3.setEnabled(true)
        }
        button3.setOnClickListener {
            //削除の指示
            FavoriteShop.delete(shopid)
            button3.setEnabled(false)
            button2.setEnabled(true)
        }
    }

    //課題対応
    companion object {
        private const val KEY_URL = "key_url"
        fun start(activity: Activity, shop2: FavoriteShop) {
            activity.startActivity(Intent(activity, WebViewActivity::class.java)
                .putExtra("shop",shop2))

        }
    }
}