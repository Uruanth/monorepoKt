package co.com.pragma.usecases

import co.com.pragma.ISer
import co.com.pragma.domain.User
import reactor.core.publisher.Mono
import java.util.function.Function


class FooDoUsecase(private val ser: ISer) : (Mono<String>) -> Mono<String> {
    override fun invoke(t: Mono<String>): Mono<String> {
        return t.map {
            ser.getName(User(12, it))
        }
    }

}