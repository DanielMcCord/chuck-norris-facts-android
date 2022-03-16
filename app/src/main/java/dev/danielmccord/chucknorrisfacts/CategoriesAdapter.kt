package dev.danielmccord.chucknorrisfacts

import android.content.Context
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CategoriesAdapter(val context: Context, val categories: List<String>): RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {
    private val TAG: String = FactsAdapter::class.java.simpleName

    class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), ListItemClickListener {
        override fun onListItemClick(itemNumber: Int, itemView: View) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}