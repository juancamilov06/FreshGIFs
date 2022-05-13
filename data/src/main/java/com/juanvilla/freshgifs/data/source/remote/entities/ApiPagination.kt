package com.juanvilla.freshgifs.data.source.remote.entities

data class ApiPagination(
    val offset: Int,
    val totalCount: Int?,
    val count: Int
)