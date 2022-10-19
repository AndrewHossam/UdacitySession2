package com.github.andrewhossam.udacitysession2.input

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.andrewhossam.udacitysession2.R

class InputFragment : Fragment() {

    private lateinit var viewModel: InputViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }


}