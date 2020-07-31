package com.example.tabapp.presenters

import com.example.tabapp.views.DiceView

import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.MvpView
import java.util.*

@InjectViewState
class DicePresenter: MvpPresenter<DiceView> (){
    fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        viewState.showDice(randomInt)
    }
}