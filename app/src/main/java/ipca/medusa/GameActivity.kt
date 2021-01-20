package ipca.medusa

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_view.*

class GameActivity : AppCompatActivity() {

     var mediaPlayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_view)

        mediaPlayer = MediaPlayer.create(this,R.raw.worm)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()

        //instanciar classe
        val story = Story(this)

        story.startPoint()

        button1.setOnClickListener {
            story.selectPath(story.nextPath1)
        }
        button2.setOnClickListener {
            story.selectPath(story.nextPath2)
        }
        button3.setOnClickListener {
            story.selectPath(story.nextPath3)
        }
    }

    fun splashScreen(){
        val title = Intent(this,SplashScreen::class.java)
        startActivity(title)
    }
    // Termina a musica quando sai da activity
    override fun onPause() {
        super.onPause()
        mediaPlayer?.release()
        mediaPlayer= null
    }
}