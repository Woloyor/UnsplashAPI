package com.example.unsplashapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplashapi.data.local.dao.UnsplashRemoteKeysDao
import com.example.unsplashapi.model.UnsplashImage
import com.example.unsplashapi.model.UnsplashRemoteKeys
import com.example.upsplashapi.data.local.dao.UnsplashImageDao

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}