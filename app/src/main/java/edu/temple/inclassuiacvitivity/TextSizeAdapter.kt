package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context : Context, _fonts : Array<Int>) : BaseAdapter() {

    private val context = _context
    private val fonts = _fonts


    override fun getCount(): Int {
        return fonts.size
    }

    override fun getItem(position: Int): Any {
        return fonts[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
////        textView.text = fonts[position].toString()
//        textView.setPadding(5,10,0,10)
//        if(convertView  == null     //this implemetns the
            textView.text = fonts[position].toString()
            return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = (getView(position, convertView, parent) as TextView)
        textView.text = fonts[position].toString()
        textView.textSize = fonts[position].toFloat()
        return textView
//        return super.getDropDownView(position, convertView, parent).apply{}
    }

}