package com.example.retrofittemplate.retrofitDatabase.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.retrofittemplate.retrofitDatabase.database.dao.TempDao
import com.example.retrofittemplate.retrofitDatabase.database.entity.TempEntity

@Database(entities = arrayOf(TempEntity::class), version = 1)
abstract class AppDatabaseDB: RoomDatabase() {

    abstract fun getTempDao(): TempDao


    companion object {
        var INSTANCE: AppDatabaseDB? = null

        fun getAppDataBase(context: Context): AppDatabaseDB? {
            if (INSTANCE == null){
                synchronized(AppDatabaseDB::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDatabaseDB::class.java, "AppDatabase-db").build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }
}