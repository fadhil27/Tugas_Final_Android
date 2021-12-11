package com.fadhil.tugas_final_android.Model

class DataFish : ArrayList<DataFishItem>()

data class DataFishItem(
    val Animal_Health: String,
    val Availability: String,
    val Biology: String,
    val Bycatch: String,
    val Calories: String,
    val Carbohydrate: String,
    val Cholesterol: String,
    val color: String,
    val Disease_Treatment_and_Prevention: Any,
    val Diseases_in_Salmon: String,
    val Displayed_Seafood_Profile_Illustration: Any,
    val Ecosystem_Services: String,
    val Environmental_Considerations: String,
    val Environmental_Effects: String,
    val Farming_Methods: String,
    val Farming_Methods_: String,
    val Fat_Total: String,
    val Feeds: String,
    val Feeds_: String,
    val Fiber_Total_Dietary: String,
    val Fishery_Management: String,
    val Fishing_Rate: String,
    val Habitat: String,
    val Habitat_Impacts: String,
    val Harvest: String,
    val Harvest_Type: String,
    val Health_Benefits: String,
    val Human_Health: String,
    val Human_Health_: String,
    val Image_Gallery: List<ImageGallery>,
    val Location: String,
    val Management: String,
    val NOAA_Fisheries_Region: String,
    val Path: String,
    val Physical_Description: String,
    val Population: String,
    val Population_Status: String,
    val Production: String,
    val Protein: String,
    val Quote: String,
    val Quote_Background_Color: String,
    val Research: String,
    val Saturated_Fatty_Acids_Total: String,
    val Scientific_Name: String,
    val Selenium: String,
    val Serving_Weight: String,
    val Servings: String,
    val Sodium: String,
    val Source: String,
    val Species_Aliases: String,
    val Species_Illustration_Photo: SpeciesIllustrationPhoto,
    val Species_Name: String,
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