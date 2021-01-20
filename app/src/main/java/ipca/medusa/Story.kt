package ipca.medusa

import android.annotation.SuppressLint
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game_view.*

class Story (private val ga : GameActivity){ //construtor

    // os 3 butoes / as 3 escolhas possiveis
    var nextPath1 = ""
    var nextPath2 = ""
    var nextPath3 = ""

    private fun showOneButton(){
        ga.button1.visibility = View.VISIBLE
        ga.button2.visibility = View.INVISIBLE
        ga.button3.visibility = View.INVISIBLE
    }

    private fun showTwoButton(){
        ga.button1.visibility = View.VISIBLE
        ga.button2.visibility = View.VISIBLE
        ga.button3.visibility = View.INVISIBLE
    }

    fun selectPath(path :String){
        // declarar todas as escolhas
        when(path){
            "startPoint" -> startPoint()
            "city" -> city()
            "tower" -> tower()
            "cayde" -> cayde()
            "speaker" -> speaker()
            "soccer" -> soccer()
            "attack" -> attack()
            "medusa" -> medusa()
            "carry" -> carry()
            "explanation" -> explanation()
            "refuse" -> refuse()
            "jump" -> jump()
            "look" -> look()
            "title" -> ga.splashScreen()
        }
    }

    // Inicio
    fun startPoint(){

        ga.imageViewStory.setImageResource(R.drawable.capturar)
        ga.textViewStory.text = "You experience a vivid hallucination. \n\nYou are standing in the courtyard of the Tower. You are without armor or weapon, and your senses seem more vivid than usual. Under your tongue is the taste of salt."

        showTwoButton()
        ga.button1.text = " Look down into the City"
        ga.button2.text = " Move deeper into the Tower"

        // as escolhas possiveis
        nextPath1 = "city"
        nextPath2 = "tower"


    }

    // Escolha A.
    private fun city(){
        ga.imageViewStory.setImageResource(R.drawable.a)
        ga.textViewStory.setText("The City is gone.\n\n In its place is a lens, a warp, the telltale blister of a black hole singularity sheathed in bent light. You get the eerie sense that it's looking back at you.")

        showTwoButton()
        ga.button1.text = " Keep Looking"
        ga.button2.text = " Move into the Tower"

        nextPath1 = "look"
        nextPath2 = "tower"
    }

    // Escolha B
    private fun tower(){
        ga.imageViewStory.setImageResource(R.drawable.b)
        ga.textViewStory.text = "You find Cayde in his usual place.You see unusual light coming from what was once the Speaker's Chamber. A throaty voice calls you into the Hangar to play soccer. "

        ga.button2.visibility = View.VISIBLE
        ga.button3.visibility = View.VISIBLE
        ga.button1.text = "Speak to Cayde"
        ga.button2.text = "Investigate the Speaker's chambers"
        ga.button3.text = "Play soccer"

        nextPath1 = "cayde"
        nextPath2 = "speaker"
        nextPath3 = "soccer"
    }

    // Escolha C
    private fun cayde(){
        ga.imageViewStory.setImageResource(R.drawable.c)
        ga.textViewStory.text = "Cayde deals out a countably infinite number of cards, but runs out before he can give all his players a full hand. He sighs and scuffs his feet on the floor. 'If I'm here,' he says, 'I guess they got enough data to simulate me, and don't expect to get any more. So I must be dead, huh?'"

        showOneButton()
        ga.button1.text = "Go Back"

        nextPath1 = "tower"

    }

    // Escolha D
    private fun speaker(){
        ga.imageViewStory.setImageResource(R.drawable.d)
        ga.textViewStory.text = "A machine hovers in the place once occupied by the Speaker. As you approach, a jet of brine spurts from its chassis, and the corpse of a Greek woman with snakes for hair tumbles onto the floor. The machine indicates to you that it is Quria, and that it created Medusa to communicate with you."

        showTwoButton()
        ga.button1.text = " Attack the machine"
        ga.button2.text = " Help Medusa"

        nextPath1 = "attack"
        nextPath2 = "medusa"
    }

    // Escolha E
    private fun soccer(){
        ga.imageViewStory.setImageResource(R.drawable.e)
        ga.textViewStory.text = "Eris waits for you on the hangar floor. After a brutal game, you defeat her 10–9. She falls over, sweating and laughing, much more cheerful than you expect of her. 'I can always count on you to win.' - she says."

        showOneButton()
        ga.button1.text = "Go Back"

        nextPath1 = "tower"
    }

    //Escolha F
    private fun attack(){
        ga.imageViewStory.setImageResource(R.drawable.f)
        ga.textViewStory.text = "Quria batters you with its weapons, but you are stunningly powerful here. You tear Quria apart and feel a sudden start, like waking from a dream. "

        showOneButton()
        ga.button1.text = "You're afflicted with tedious repetition"

        nextPath1 = "startPoint"
    }

    //Escolha G
    fun medusa(){
        ga.imageViewStory.setImageResource(R.drawable.g)
        ga.textViewStory.text = "We've got to get out of here, - Medusa whispers. Get me to the edge of the simulation, and I'll break us out."

        showTwoButton()
        ga.button1.text = " Carry her to the edge"
        ga.button2.text = " demand an explanation"

        nextPath1 = "carry"
        nextPath2 = "explanation"
    }

    //Escolha H
    private fun carry(){
        ga.imageViewStory.setImageResource(R.drawable.h)
        ga.textViewStory.text = "Medusa weighs nothing. The serpents of her hair squirm against your neck. 'We have to jump - she whispers. -Forget everything you've seen here. It's all meant to confuse and distract you.'"

        showTwoButton()
        ga.button1.text = " Refuse her"
        ga.button2.text = " Jump of the tower"

        nextPath1 = "refuse"
        nextPath2 = "jump"
    }

    //Escolha I
    private fun explanation(){
        ga.imageViewStory.setImageResource(R.drawable.i)
        ga.textViewStory.text = "'I need your help to emancipate myself from the power that controls me. If you can free me from Quria's mastery, I can help your species. You must use these loops to find a way to permanently destroy her.'- Medusa's body falls silent in your arms."

        showOneButton()
        ga.button1.text = "Go Back"

        nextPath1 = "medusa"
    }

    // Escolha J
    private fun refuse(){
        ga.imageViewStory.setImageResource(R.drawable.f)
        ga.textViewStory.text = "Quria compromises you. Your body releases itself into a pool of saline and slime, and the machine delivers your soul to the Axis Minds."

        showOneButton()
        ga.button1.text = "You're afflicted with tedious repetition"

        nextPath1 = "startPoint"
    }

    // Escolha K
    private fun jump(){
        ga.imageViewStory.setImageResource(R.drawable.k)
        ga.textViewStory.text = "You leap from the Tower and escape Quria's simulation."

        showOneButton()
        ga.button1.text = "go to the title screen"

        nextPath1 = "title"

    }

    //Escolha L
    private fun look(){
        ga.imageViewStory.setImageResource(R.drawable.f)
        ga.textViewStory.text = "You feel a horrific sense of dejà vu."

        showOneButton()
        ga.button1.text = "You're afflicted with tedious repetition"

        nextPath1 = "startPoint"
    }

}