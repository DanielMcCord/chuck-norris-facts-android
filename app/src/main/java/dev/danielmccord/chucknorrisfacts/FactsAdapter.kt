package dev.danielmccord.chucknorrisfacts

import android.content.Context
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FactsAdapter(val context: Context, val facts: List<ChuckFact>) : RecyclerView.Adapter<FactsAdapter.FactViewHolder>() {
    private val TAG: String = FactsAdapter::class.java.simpleName

    class FactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), ListItemClickListener {
        override fun onListItemClick(itemNumber: Int, itemView: View) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return facts.size
    }
}