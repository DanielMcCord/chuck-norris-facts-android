package dev.danielmccord.chucknorrisfacts

import android.view.View

interface ListItemClickListener {
        fun onListItemClick(itemNumber: Int, itemView: View)
}