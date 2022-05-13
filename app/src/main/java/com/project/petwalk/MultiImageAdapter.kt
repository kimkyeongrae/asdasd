//나중에 해야할부분

//package com.project.petwalk
//
//import android.content.Context
//import android.net.Uri
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//
//class MultiImageAdapter(private val items: ArrayList<Uri>, val context: Context) :
//        RecyclerView.Adapter<MultiImageAdapter.ViewHolder>(){
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): MultiImageAdapter.ViewHolder {
//        TODO("Not yet implemented")
//    }
//
//
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val item = items[position]
//        Glide.with(context).load(item)
//            .override(500,500)
//            .into(holder.image)
//    }
//
//    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
//    }
//
//
//}