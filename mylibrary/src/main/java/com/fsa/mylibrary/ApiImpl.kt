package com.fsa.mylibrary

import com.fsa.hidden.InternalService.Companion.returnsMeow


public class ApiImpl: Api {
    override fun returnSmth() {
        returnsMeow()
    }
}

