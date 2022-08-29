package com.saadahmedsoft.base.utils

sealed class DataState<T>(val data: T? = null, val message: String? = null) {
    class Loading<T> : DataState<T>()
    class Success<T>(data: T? = null) : DataState<T>(data = data)
    class Failed<T>(message: String? = null) : DataState<T>(message = message)
}
