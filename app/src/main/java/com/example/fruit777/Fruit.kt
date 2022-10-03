package com.example.fruit777

import android.os.Parcel
import android.os.Parcelable

data class Fruit ( val fruit_name:String?
    ,val fruit_image:Int,
    val fruit_price:Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(fruit_name)
        parcel.writeInt(fruit_image)
        parcel.writeDouble(fruit_price)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fruit> {
        override fun createFromParcel(parcel: Parcel): Fruit {
            return Fruit(parcel)
        }

        override fun newArray(size: Int): Array<Fruit?> {
            return arrayOfNulls(size)
        }
    }


}