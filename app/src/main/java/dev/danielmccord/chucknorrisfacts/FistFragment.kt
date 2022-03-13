package dev.danielmccord.chucknorrisfacts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import dev.danielmccord.chucknorrisfacts.databinding.FragmentFistBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FistFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FistFragment : Fragment() {
    private var binding: FragmentFistBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFistBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.imageButton.setOnClickListener{
            NavHostFragment.findNavController(this@FistFragment)
                .navigate(R.id.action_FistFragment_to_MenuFragment)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment FistFragment.
         */
        @JvmStatic
        fun newInstance() =
            FistFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}