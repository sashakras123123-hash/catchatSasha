package com.example.catchat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catchat.R
import com.example.catchat.MessageAdapter
import com.example.catchat.Message

class InboxFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inbox, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_messages)

        // Пример статических сообщений
        val messages = listOf(
            Message("САНЕК", "КАК ДЕЛА?"),

        )

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MessageAdapter(messages)
    }
}