package com.fsa.mylibrary

public class Main {
    public companion object {
        internal fun returnsMeow(): String = "Meow"
        public fun returnsSmth(): String = returnsMeow()
    }
}

