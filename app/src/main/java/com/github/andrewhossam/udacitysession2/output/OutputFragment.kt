package com.github.andrewhossam.udacitysession2.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.andrewhossam.udacitysession2.R

class OutputFragment : Fragment() {

    private lateinit var viewModel: OutputViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_output, container, false)
    }

}