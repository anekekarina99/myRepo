package com.teamacodechallenge6.ui.profileteman

interface TemanView {
    fun onSuccessTeman(msg:String)
    fun onFailedTeman(msg:String)
    fun nameEmail(username:String,email:String)

}