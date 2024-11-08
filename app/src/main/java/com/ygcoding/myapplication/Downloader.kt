package com.ygcoding.myapplication

interface Downloader {
    fun downloadFile(url : String) : Long
}