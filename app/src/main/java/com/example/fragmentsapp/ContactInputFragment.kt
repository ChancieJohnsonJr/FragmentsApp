package com.example.fragmentsapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_contact_input.*
import kotlinx.android.synthetic.main.fragment_contact_input.view.*

/**
 * A simple [Fragment] subclass.
 */
class ContactInputFragment : Fragment() {

    lateinit var listener: OnFragmentInteractionListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_input, container, false)
    }

    fun setFragListener(passedListener: OnFragmentInteractionListener) {
        listener = passedListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnSendContactData.setOnClickListener(this)
    }

    fun onClick(view: View?, userInput: CharSequence) {
        val userInput1 = etFirstNameInput.text.toString()
        listener.dataFromContractInputFragment(userInput1)
        tvContactDisplay.text = userInput
    }

    interface OnFragmentInteractionListener {

    }
}