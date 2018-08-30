package cn.com.yyh.kotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by yinya on 2018/7/13.
 */
class MyAdapter : BaseAdapter() {
    private var context : Context? = null
    private var mInflater : LayoutInflater? = null
    private var holder : ViewHolder? = null
    private var list : ArrayList<PersonDto>? = null
    private var selectItem : Int = -1

    class ViewHolder {
        var tv_name : TextView? = null
        var tv_age : TextView? = null
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return p1!!
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return 0
    }
}