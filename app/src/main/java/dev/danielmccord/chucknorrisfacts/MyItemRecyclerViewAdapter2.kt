package dev.danielmccord.chucknorrisfacts

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import dev.danielmccord.chucknorrisfacts.databinding.FragmentItem2Binding
import dev.danielmccord.chucknorrisfacts.placeholder.PlaceholderContent

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter2(private val mValues: List<PlaceholderContent.PlaceholderItem>) :
    RecyclerView.Adapter<MyItemRecyclerViewAdapter2.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentItem2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mIdView.text = mValues[position].id
        holder.mContentView.text = mValues[position].content
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(binding: FragmentItem2Binding) : RecyclerView.ViewHolder(binding.root) {
        val mIdView: TextView
        val mContentView: TextView
        var mItem: PlaceholderContent.PlaceholderItem? = null
        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }

        init {
            mIdView = binding.itemNumber
            mContentView = binding.content
        }
    }
}