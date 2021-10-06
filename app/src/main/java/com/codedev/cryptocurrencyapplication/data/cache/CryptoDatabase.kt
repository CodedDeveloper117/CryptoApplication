package com.codedev.cryptocurrencyapplication.data.cache

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class CryptoDatabase: RoomDatabase() {

    abstract val cryptoDao: CryptoDao

    companion object {
        private var instance: CryptoDatabase? = null

        operator fun invoke(application: Application) = instance?: synchronized(this){
            instance?: createDatabase(application)
        }

        private fun createDatabase(application: Application) : RoomDatabase {
            return Room.databaseBuilder(
                application,
                CryptoDatabase::class.java,
                "crypto_db"
            ).build()
        }
    }
}