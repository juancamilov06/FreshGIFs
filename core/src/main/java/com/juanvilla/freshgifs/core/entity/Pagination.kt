package com.juanvilla.freshgifs.core.entity

data class Pagination(
    val offset: Int,
    val totalCount: Int?,
    val count: Int
)