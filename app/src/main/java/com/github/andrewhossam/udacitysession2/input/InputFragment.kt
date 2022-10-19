package com.github.andrewhossam.udacitysession2.input

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.github.andrewhossam.udacitysession2.R
import com.github.andrewhossam.udacitysession2.SharedViewModel
import com.github.andrewhossam.udacitysession2.databinding.FragmentInputBinding

class InputFragment : Fragment() {

//    private val viewModel: InputViewModel by lazy {
//        val factory = InputViewModel.Companion.InputViewModelFactory(requireActivity().application,"anyValue")
//        ViewModelProvider(this, factory).get(InputViewModel::class.java)
//    }

    private val sharedViewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentInputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_input, container, false)
        binding.sharedViewModel = sharedViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.editTextTextPersonName.doAfterTextChanged {
            sharedViewModel.updateText(it.toString())
        }
    }
}