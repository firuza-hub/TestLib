package com.fsa.mylibrary

import com.fsa.mylibrary.internal.ApiImpl

public interface Api {
    public fun returnSmth()
}

public object ApiFactory {
    public fun createApi(): Api {
        return ApiImpl()
    }
}