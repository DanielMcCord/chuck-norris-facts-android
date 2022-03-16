package dev.danielmccord.chucknorrisfacts

import android.os.Bundle
import dev.danielmccord.chucknorrisfacts.ItemFragment2
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.danielmccord.chucknorrisfacts.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.GridLayoutManager
import dev.danielmccord.chucknorrisfacts.MyItemRecyclerViewAdapter2
import dev.danielmccord.chucknorrisfacts.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class ItemFragment2
/**
 * Mandatory empty constructor for the fragment manager to instantiate the
 * fragment (e.g. upon screen orientation changes).
 */
    : Fragment() {
    // TODO: Customize parameters
    private var mColumnCount = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mColumnCount = requireArguments().getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list2, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            val context = view.getContext()
            val recyclerView = view
            if (mColumnCount <= 1) {
                recyclerView.layoutManager = LinearLayoutManager(context)
            } else {
                recyclerView.layoutManager = GridLayoutManager(context, mColumnCount)
            }
            recyclerView.adapter =
                MyItemRecyclerViewAdapter2(PlaceholderContent.ITEMS)
        }
        return view
    }

    companion object {
        // TODO: Customize parameter argument names
        private const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        fun newInstance(columnCount: Int): ItemFragment2 {
            val fragment = ItemFragment2()
            val args = Bundle()
            args.putInt(ARG_COLUMN_COUNT, columnCount)
            fragment.arguments = args
            return fragment
        }
    }
}