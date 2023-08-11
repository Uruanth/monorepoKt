package co.com.pragma.adapter

import co.com.pragma.ISer
import co.com.pragma.domain.User
import org.springframework.stereotype.Service

@Service
class Ser : ISer {
    override fun getName(us: User): String {
        return us.name
    }
}