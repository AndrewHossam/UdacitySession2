package com.github.andrewhossam.udacitysession2.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.github.andrewhossam.udacitysession2.SharedViewModel
import com.github.andrewhossam.udacitysession2.databinding.FragmentOutputBinding

class OutputFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentOutputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOutputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sharedViewModel.inputTextLive.observe(viewLifecycleOwner) {
            binding.tvOutput.text = it
        }
    }
}