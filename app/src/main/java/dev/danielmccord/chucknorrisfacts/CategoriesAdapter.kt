package dev.danielmccord.chucknorrisfacts

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.danielmccord.chucknorrisfacts.databinding.TableOfContentListBinding

class CategoriesAdapter(val context: Context, val categories: List<String>): RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {
    private val TAG: String = FactsAdapter::class.java.simpleName

    class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), ListItemClickListener {
        private var binding: TableOfContentListBinding = TableOfContentListBinding.bind(itemView)
        var categoryName: TextView = binding.categories
        var categoryDescription: TextView = binding.descriptions

        override fun onListItemClick(itemNumber: Int, itemView: View) {
            TODO("Not yet implemented")
        }

        fun bind(listIndex: Int) {
            categoryName.text = listIndex.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.table_of_content_list, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        Log.d(TAG, "#$position")
        holder.bind(position)
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}