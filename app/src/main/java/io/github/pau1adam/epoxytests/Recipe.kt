package io.github.pau1adam.epoxytests

import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName(value = "publisher") val publisher: String = "",
    @SerializedName(value = "f2f_url") val f2f_url: String = "",
    @SerializedName(value = "title") val title: String = "",
    @SerializedName(value = "source_url") val source_url: String = "",
    @SerializedName(value = "recipeId") val recipe_id: String = "",
    @SerializedName(value = "image_url") val image_url: String = "",
    @SerializedName(value = "social_rank") val social_rank: String = "",
    @SerializedName(value = "publisher_url") val publisher_url: String = "",
    @SerializedName(value = "ingredients") val ingredients: List<String> = ArrayList()
)