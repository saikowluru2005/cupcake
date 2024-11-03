package com.example.affirmations

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affermations.R
import com.example.affermations.R.id.recyclerView

class MainActivity : AppCompatActivity() {

    // Sample affirmations
    private val affirmations = listOf(
        "I am confident and capable.",
        "I believe in myself and my abilities.",
        "I am worthy of happiness and love.",
        "I am constantly growing and improving.",
        "I am at peace with myself.",
        "I radiate positivity and attract positive energy.",
        "I am grateful for the present moment.",
        "I trust the journey of my life.",
        "I am surrounded by love and support.",
        "I am proud of what I have achieved."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up RecyclerView with Adapter
        val recyclerView = findViewById<RecyclerView>(recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AffirmationAdapter(affirmations)
    }
}

class AffirmationAdapter(private val affirmations: List<String>) :
    RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    // ViewHolder for each affirmation item
    class AffirmationViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): AffirmationViewHolder {
        val textView = TextView(parent.context)
        textView.textSize = 18f
        textView.setPadding(16, 16, 16, 16)
        return AffirmationViewHolder(textView)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        holder.textView.text = affirmations[position]
    }

    override fun getItemCount() = affirmations.size
}
