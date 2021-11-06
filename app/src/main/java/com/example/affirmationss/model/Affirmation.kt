package com.example.affirmationss.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// dados sendo solicitado no : res > valuees > string.xml
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int ){

}


