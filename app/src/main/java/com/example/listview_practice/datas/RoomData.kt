package com.example.listview_practice.datas

import android.graphics.drawable.Drawable
import android.media.Image
import java.text.NumberFormat
import java.util.*

class RoomData(
    val image : Drawable,
    val price : Int,
    val location : String,
    val floor : Int,
    val introduction : String,
    val roomType1 : String,
    val roomType2 : String,
    val roomType3 : String) {

    fun getFormattedPrice() : String{

        if (this.price >= 10000){

            val uk = this.price / 10000  // **정수와 정수의 나눗셈은 소수점은 버리고 몫만 남긴다
            val rest = this.price % 10000 // %는 나눈 나머지를 구하는 기호

            return "${uk}억 ${NumberFormat.getInstance(Locale.KOREA).format(rest)}"
        }

        else {

            return "${NumberFormat.getInstance(Locale.KOREA).format(this.price)}"
        }

    }

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