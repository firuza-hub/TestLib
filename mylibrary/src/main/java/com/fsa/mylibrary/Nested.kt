package com.fsa.mylibrary

public class Nested {
    public companion object {

        public fun returnsSmth(): String {
            fun nestedMeow(): String {
                return "from nested Meow"
            }
            return nestedMeow()
        }
    }
}