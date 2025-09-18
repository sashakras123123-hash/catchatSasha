package com.example.catchat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catchat.R
import com.example.catchat.Message

class MessageAdapter(private val messages: List<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    // ViewHolder — это класс, который хранит ссылки на элементы разметки item_message.xml
    class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvSender: TextView = view.findViewById(R.id.tvSender)
        val tvMessage: TextView = view.findViewById(R.id.tvMessage)
    }

    // Создание ViewHolder'а (создает новый элемент списка)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }

    // Заполнение ViewHolder'а данными из списка
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.tvSender.text = message.sender
        holder.tvMessage.text = message.content
    }

    // Количество элементов списка
    override fun getItemCount(): Int = messages.size
}
