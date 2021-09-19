package com.example.listview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_practice.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

//        Serializable로 받은 정보를 다시 RoomData로 풀어주기

        val room = intent.getSerializableExtra("roomData") as RoomData

//        각 화면에 실제로 부여될 텍스트 설정
//        여기서는 findViewById 안 해도 되네...  <<당연하지 그 페이지 엑티비티니까 이게 필요한 건 어댑터고

        roomPriceTxt.text = room.getFormattedPrice()
        explainTxt.text = room.introduction
        addressTxt.text = room.location
        floorTxt.text = room.getFormattedFloor()

    }
}