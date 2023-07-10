package com.fsa.mylibrary.internal

import com.fsa.mylibrary.Api
import com.fsa.mylibrary.internal.InternalService.Companion.returnsMeow

class ApiImpl: Api {
    override fun returnSmth() {
        returnsMeow()
    }
}

