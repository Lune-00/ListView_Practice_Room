package com.example.listview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_practice.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("roomData") as RoomData

        roomPriceTxt.text = room.getFormattedPrice()
        explainTxt.text = room.introduction
        addressTxt.text = room.location
        floorTxt.text = room.getFormattedFloor()

    }
}