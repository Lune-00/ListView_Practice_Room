package com.example.listview_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.listview_practice.adapters.RoomAdapter
import com.example.listview_practice.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData( 8000, "서교동", 1, "망원/홍대역 풀옵션"))
        mRoomList.add(RoomData(28500, "서교동", 0, "신혼부부의 보금자리"))
        mRoomList.add(RoomData(112000, "서교동", 5, "홍대입구역 인근 원룸 전세"))
        mRoomList.add(RoomData(7500, "성산동", 3, "넓고 반듯한 오픈형 원룸"))
        mRoomList.add(RoomData(12000, "망원1동", -1, "풀옵션 원룸 전세"))
        mRoomList.add(RoomData(15000, "망원동", 2, "초역세권★베란다 공간 있는 원룸"))


        val mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)

        roomListView.adapter = mAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

//            몇 번째 칸이 클릭됐는지에 대한 정보를 인텐트에 넘겨줘야 한다...?

            val myIntent = Intent(this, ViewRoomDetail::class.java)
            myIntent.putExtra("roomData", clickedRoom)

            startActivity(myIntent)

        }


    }
}