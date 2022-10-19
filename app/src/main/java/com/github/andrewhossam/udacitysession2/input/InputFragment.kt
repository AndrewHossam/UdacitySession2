package com.github.andrewhossam.udacitysession2.input

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.andrewhossam.udacitysession2.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    private val viewModel: InputViewModel by lazy {
        val factory = InputViewModel.Companion.InputViewModelFactory(requireActivity().application,"anyValue")
        ViewModelProvider(this, factory).get(InputViewModel::class.java)
    }

    //    private val viewModel: InputViewModel by viewModels()
    private lateinit var binding: FragmentInputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.helloInputViewModel()
    }
}