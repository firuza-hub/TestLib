package com.fsa.mylibrary


public interface Api {
    public fun returnSmth()
}

public object ApiFactory {
    public fun createApi(): Api {
        return ApiImpl()
    }
}