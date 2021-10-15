package com.example.myapplication

/**
 * Copyright 2021, White Cloak Technologies, Inc., All rights reserved.
 *
 * @author alenbrubio
 * @since 10/15/2021
 */

data class Flower(
    val image: String?,
    val title: String,
    val root: String = "ugat",
    val desc: String,
    val petals: String = "Rose"
)
