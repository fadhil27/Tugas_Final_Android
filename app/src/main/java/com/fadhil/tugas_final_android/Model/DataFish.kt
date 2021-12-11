package com.fadhil.tugas_final_android.Model

import com.google.gson.annotations.SerializedName

class DataFish : ArrayList<DataFishItem>()


data class DataFishItem(
    @field:SerializedName("Animal Health")
    val Animal_Health: String,
    val Availability: String,
    val Biology: String,
    val Bycatch: String,
    val Calories: String,
    val Carbohydrate: String,
    val Cholesterol: String,
    val color: String,

    @field:SerializedName("Disease Treatment and Prevention")
    val Disease_Treatment_and_Prevention: Any,

    @field:SerializedName("Diseases in Salmon")
    val Diseases_in_Salmon: String,

    @field:SerializedName("Displayed Seafood Profile Illustration")
    val Displayed_Seafood_Profile_Illustration: Any,

    @field:SerializedName("Ecosystem Services")
    val Ecosystem_Services: String,

    @field:SerializedName("Environmental Considerations")
    val Environmental_Considerations: String,

    @field:SerializedName("Environmental Effects")
    val Environmental_Effects: String,

    @field:SerializedName("Farming Methods")
    val Farming_Methods: String,

    @field:SerializedName("Farming Methods_")
    val Farming_Methods_: String,

    @field:SerializedName("Fat, Total")
    val Fat_Total: String,
    val Feeds: String,
    val Feeds_: String,

    @field:SerializedName("Fiber, Total Dietary")
    val Fiber_total_Dietary: String,

    @field:SerializedName("Fishery Management")
    val Fishery_Management: String,

    val Habitat: String,

    @field:SerializedName("Health Benefits")
    val Health_Benefits: String,

//    @field:SerializedName("Image Gallery")
//    val Image_Gallery: List<ImageGallery>,
    val Location: String,
    val Management: String,

    val Path: String,

    @field:SerializedName("Physical Description")
    val Physical_Description: String,
    val Population: String,

    @field:SerializedName("Population Status")
    val Population_Status: String,
    val Production: String,
    val Protein: String,

    @field:SerializedName("Species Illustration Photo")
    val Species_Illustration_Photo: SpeciesIllustrationPhoto,

    @field:SerializedName("Species Name")
    val Species_Name: String,

    @field:SerializedName("Sugars, Total")
    val Sugars_Total: String,
    val Taste: String,
    val Texture: String,
    val last_update: String
)

data class ImageGallery(
    val alt: String,
    val src: String,
    val title: String
)

data class SpeciesIllustrationPhoto(
    val alt: String,
    val src: String,
    val title: String
)