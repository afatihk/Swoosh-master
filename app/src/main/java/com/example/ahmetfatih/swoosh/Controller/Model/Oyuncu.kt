package com.example.ahmetfatih.swoosh.Controller.Model

import android.os.Parcel
import android.os.Parcelable

public class Oyuncu constructor(var lig : String, var skill : String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(lig)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Oyuncu> {
        override fun createFromParcel(parcel: Parcel): Oyuncu {
            return Oyuncu(parcel)
        }

        override fun newArray(size: Int): Array<Oyuncu?> {
            return arrayOfNulls(size)
        }
    }
}