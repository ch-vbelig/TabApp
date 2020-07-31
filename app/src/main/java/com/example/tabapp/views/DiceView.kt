package com.example.tabapp.views

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

interface DiceView: MvpView {
    @StateStrategyType(AddToEndStrategy::class)
    fun showDice(randomInt: Int)
}