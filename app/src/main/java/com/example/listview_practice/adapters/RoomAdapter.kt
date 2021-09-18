package com.example.listview_practice.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview_practice.R
import com.example.listview_practice.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext) //이 화면을 기반으로

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        convertView > 재사용성을 위한 장치

        var temprow = convertView
        if (temprow == null){
            temprow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = temprow!! // !! <절대 null이 아니다!!

        val roomData = mList[position]

//        row. 으로 들어가는 이유 ↑저기 실제 결과로 나갈  row 안에서 찾아봐라!

        val roomImg = row.findViewById<ImageView>(R.id.roomImage)
        val roomPrice = row.findViewById<TextView>(R.id.roomPriceTxt)
        val roomLocation = row.findViewById<TextView>(R.id.roomLocationTxt)
        val roomIntroduction = row.findViewById<TextView>(R.id.roomExplainTxt)
        val roomType1 = row.findViewById<TextView>(R.id.roomType1Txt)
        val roomType2 = row.findViewById<TextView>(R.id.roomType2Txt)
        val roomType3 = row.findViewById<TextView>(R.id.roomType3Txt)

//        val resourceId = context.resources.getIdentifier(roomData., "drawable", context.packageName)

//        roomImg.setImageResource(resourceId)
        roomPrice.text = roomData.price
        roomLocation.text = roomData.location
        roomIntroduction.text = roomData.introduction
        roomType1.text = roomData.roomType1
        roomType2.text = roomData.roomType2
        roomType3.text = roomData.roomType3

        return row
    }

}