package ipca.medusa

import android.annotation.SuppressLint
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game_view.*

class Story (private val gs : GameActivity){ //construtor

    // os 3 butoes / as 3 escolhas possiveis
    var nextPath1 = ""
    var nextPath2 = ""
    var nextPath3 = ""

    private fun showOneButton(){
        gs.button1.setVisibility(View.VISIBLE)
        gs.button2.setVisibility(View.INVISIBLE)
        gs.button3.setVisibility(View.INVISIBLE)
    }

    private fun showTwoButton(){
        gs.button1.setVisibility(View.VISIBLE)
        gs.button2.setVisibility(View.VISIBLE)
        gs.button3.setVisibility(View.INVISIBLE)
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
            "title" -> gs.splashScreen()
        }
    }

    // Inicio
    fun startPoint(){

        gs.imageViewStory.setImageResource(R.drawable.capturar)
        gs.textViewStory.setText("You experience a vivid hallucination. \n\nYou are standing in the courtyard of the Tower. You are without armor or weapon, and your senses seem more vivid than usual. Under your tongue is the taste of salt.")

        showTwoButton()
        gs.button1.setText(" Look down into the City")
        gs.button2.setText(" Move deeper into the Tower")

        // as escolhas possiveis
        nextPath1 = "city"
        nextPath2 = "tower"


    }

    // Escolha A.
    private fun city(){
        gs.imageViewStory.setImageResource(R.drawable.a)
        gs.textViewStory.setText("The City is gone.\n\n In its place is a lens, a warp, the telltale blister of a black hole singularity sheathed in bent light. You get the eerie sense that it's looking back at you.")

        showTwoButton()
        gs.button1.setText(" Keep Looking")
        gs.button2.setText(" Move into the Tower")

        nextPath1 = "look"
        nextPath2 = "tower"
    }

    // Escolha B
    private fun tower(){
        gs.imageViewStory.setImageResource(R.drawable.b)
        gs.textViewStory.setText("You find Cayde in his usual place.You see unusual light coming from what was once the Speaker's Chamber. A throaty voice calls you into the Hangar to play soccer. ")

        gs.button2.setVisibility(View.VISIBLE)
        gs.button3.setVisibility(View.VISIBLE)
        gs.button1.setText("Speak to Cayde")
        gs.button2.setText("Investigate the Speaker's chambers")
        gs.button3.setText("Play soccer")

        nextPath1 = "cayde"
        nextPath2 = "speaker"
        nextPath3 = "soccer"
    }

    // Escolha C
    private fun cayde(){
        gs.imageViewStory.setImageResource(R.drawable.c)
        gs.textViewStory.setText("Cayde sighs and scuffs his feet on the floor. 'If I'm here,' he says,'I guess they figure I'll never do anything new or confusing again. So I must be dead, huh?'")

        showOneButton()
        gs.button1.setText("Go Back")

        nextPath1 = "tower"

    }

    // Escolha D
    private fun speaker(){
        gs.imageViewStory.setImageResource(R.drawable.d)
        gs.textViewStory.setText("A machine hovers in the place once occupied by the Speaker. As you approach, a jet of brine spurts from its chassis, and the corpse of a Greek woman with snakes for hair tumbles onto the floor. The machine indicates to you that it is Quria, and that it created Medusa to communicate with you.")

        showTwoButton()
        gs.button1.setText(" Attack the machine")
        gs.button2.setText(" Help Medusa")

        nextPath1 = "attack"
        nextPath2 = "medusa"
    }

    // Escolha E
    private fun soccer(){
        gs.imageViewStory.setImageResource(R.drawable.e)
        gs.textViewStory.setText("Eris Morn waits for you on the hangar floor. After a brutal game, you defeat her 10–9. She falls over, sweating and laughing, much more cheerful than you expect of her. 'I can always count on you to win.' - she says.")

        showOneButton()
        gs.button1.setText("Go Back")

        nextPath1 = "tower"
    }

    //Escolha F
    private fun attack(){
        gs.imageViewStory.setImageResource(R.drawable.f)
        gs.textViewStory.setText("Quria batters you with its weapons, but you are stunningly powerful here. You tear Quria apart and feel a sudden start, like waking from a dream. ")

        showOneButton()
        gs.button1.setText("You're afflicted with tedious repetition")

        nextPath1 = "city"
    }

    //Escolha G
    fun medusa(){
        gs.imageViewStory.setImageResource(R.drawable.g)
        gs.textViewStory.setText("We've got to get out of here, - Medusa whispers. Get me to the edge of the simulation, and I'll break us out.")

        showTwoButton()
        gs.button1.setText(" Carry her to the edge")
        gs.button2.setText(" demand an explanation")

        nextPath1 = "carry"
        nextPath2 = "explanation"
    }

    //Escolha H
    private fun carry(){
        gs.imageViewStory.setImageResource(R.drawable.h)
        gs.textViewStory.setText("Medusa weighs nothing. The serpents of her hair squirm against your neck. 'We have to jump - she whispers. -Forget everything you've seen here. It's all meant to confuse and distract you.'")

        showTwoButton()
        gs.button1.setText(" Refuse her")
        gs.button2.setText(" Jump")

        nextPath1 = "refuse"
        nextPath2 = "jump"
    }

    //Escolha I
    private fun explanation(){
        gs.imageViewStory.setImageResource(R.drawable.i)
        gs.textViewStory.setText("'I need your help to emancipate myself from the power that controls me. If you can free me from Quria's mastery, I can help your species. You must use these loops to find a way to permanently destroy her.'- Medusa's body falls silent in your arms.")

        showOneButton()
        gs.button1.setText("Go Back")

        nextPath1 = "medusa"
    }

    // Escolha J
    private fun refuse(){
        gs.imageViewStory.setImageResource(R.drawable.f)
        gs.textViewStory.setText("Quria compromises you. Your body releases itself into a pool of saline and slime, and the machine delivers your soul to the Axis Minds.")

        showOneButton()
        gs.button1.setText("You're afflicted with tedious repetition")

        nextPath1 = "city"
    }

    // Escolha K
    private fun jump(){
        gs.imageViewStory.setImageResource(R.drawable.k)
        gs.textViewStory.setText("You leap from the Tower and escape Quria's simulation.")

        showOneButton()
        gs.button1.setText("go to the title screen")

        nextPath1 = "title"

    }

    //Escolha L
    private fun look(){
        gs.imageViewStory.setImageResource(R.drawable.f)
        gs.textViewStory.setText("You feel a horrific sense of dejà vu.")

        showOneButton()
        gs.button1.setText("You're afflicted with tedious repetition")

        nextPath1 = "city"
    }

}