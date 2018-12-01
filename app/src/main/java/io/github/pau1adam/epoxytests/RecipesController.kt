package io.github.pau1adam.epoxytests

import com.airbnb.epoxy.EpoxyController

class RecipesController : EpoxyController(){

    var recipes : List<Recipe> = RecipesRepository.getData()

    override fun buildModels() = recipes.forEachIndexed { index, recipe ->
        RecipeModel_()
            .id(index)
            .imageUrl(recipe.image_url)
            .title(recipe.title)
            .publisher(recipe.publisher)
            .addTo(this)
    }

}