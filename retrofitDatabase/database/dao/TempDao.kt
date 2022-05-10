package com.example.retrofittemplate.retrofitDatabase.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.retrofittemplate.retrofitDatabase.database.entity.TempEntity

@Dao
interface TempDao{

//    @Query("select * from temp")
//    fun getAll(): LiveData<List<TempEntity>>
//
//    @Insert
//    fun insert(temp: TempEntity)
//
//    @Delete
//    fun delete(category: TempEntity)
//
//    @Query("delete from income where categoryId = :categoryId")
//    fun deleteIncomesFromACategory(categoryId: Long)
//
//    @Query("delete from category where uid = :categoryId")
//    fun deleteCategoryById(categoryId: Long)
}