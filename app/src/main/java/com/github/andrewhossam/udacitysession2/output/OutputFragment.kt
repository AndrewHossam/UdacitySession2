package com.github.andrewhossam.udacitysession2.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.andrewhossam.udacitysession2.databinding.FragmentOutputBinding

class OutputFragment : Fragment() {

    private lateinit var viewModel: OutputViewModel

    private lateinit var binding: FragmentOutputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOutputBinding.inflate(inflater, container, false)
        return binding.root
    }

}