package com.example.listview_practice.datas

import android.graphics.drawable.Drawable
import android.media.Image

class RoomData(
    val image : Drawable,
    val price : String,
    val location : String,
    val floor : Int,
    val introduction : String,
    val roomType1 : String,
    val roomType2 : String,
    val roomType3 : String
) {

    fun getFormattedFloor() : String{

        if (this.floor >= 1){
            return "${this.floor}층"
        }
        else if (this.floor == 0){
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"}
    }

}