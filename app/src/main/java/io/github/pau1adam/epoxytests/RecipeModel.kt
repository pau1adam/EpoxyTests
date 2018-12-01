package io.github.pau1adam.epoxytests

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

@EpoxyModelClass(layout = R.layout.list_item)
abstract class RecipeModel : EpoxyModelWithHolder<RecipeModel.RecipeHolder>() {

    @EpoxyAttribute
    var imageUrl: String = ""

    @EpoxyAttribute
    var title: String = ""

    @EpoxyAttribute
    var publisher: String = ""


    override fun bind(holder: RecipeHolder) {
        Picasso.get().load(imageUrl).fit().into(holder.imageView)
        holder.titleView.text = title
        holder.publisherView.text = publisher
    }

    inner class RecipeHolder : EpoxyHolder() {

        lateinit var imageView: ImageView
        lateinit var titleView: TextView
        lateinit var publisherView: TextView

        override fun bindView(itemView: View) {
            imageView = itemView.findViewById(R.id.image)
            titleView = itemView.findViewById(R.id.title)
            publisherView = itemView.findViewById(R.id.publisher)
        }
    }
}