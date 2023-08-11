package co.com.pragma

import co.com.pragma.domain.User

interface ISer {
    fun getName(us: User): String;
}