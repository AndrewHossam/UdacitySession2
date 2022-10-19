package com.github.andrewhossam.udacitysession2.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.github.andrewhossam.udacitysession2.databinding.FragmentOutputBinding
import com.github.andrewhossam.udacitysession2.input.InputViewModel

class OutputFragment : Fragment() {

    private val viewModel: OutputViewModel by viewModels()
    private val inputViewModel: InputViewModel by viewModels()

    private lateinit var binding: FragmentOutputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOutputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        inputViewModel.helloInputViewModel()
    }
}