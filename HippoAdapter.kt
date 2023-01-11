package com.example.surprise_eggs.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.surprise_eggs.R
import com.example.surprise_eggs.data.Model.Hippos

class HippoAdapter(
    private val context: Context,
    private val dataset: List<Hippos>
) : RecyclerView.Adapter<HippoAdapter.ViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // TODO Schreibe hier deinen Code
        val hippoImage = view.findViewById<ImageView>(R.id.hippo_image)
        val hippoName = view.findViewById<TextView>(R.id.hippo_name)
        val hippoweight = view.findViewById<TextView>(R.id.hippo_weight)
        val hippoheight = view.findViewById<TextView>(R.id.hippo_height)

        val adoptButton = view.findViewById<Button>(R.id.adopt_Button)

    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // das itemLayout wird gebaut
        // TODO Schreibe hier deinen Code
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.hippo_item, parent, false)

        // und in einem ViewHolder zurückgegeben
        return ViewHolder(adapterLayout)                     //TODO()
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO Schreibe hier deinen Code
        val hippo = dataset[position]

        holder.hippoImage.setImageResource(hippo.imageResource)
        holder.hippoName.text = hippo.name
        holder.hippoweight.text = "${hippo.weight} g"
        holder.hippoheight.text = "${hippo.height} cm"

        holder.adoptButton.setOnClickListener {

            Toast.makeText(
                context,
                "${hippo.name} hat einen neuen Besitzer :)",
                Toast.LENGTH_SHORT)
                .show()
        }
    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size       //TODO()
    }
}
