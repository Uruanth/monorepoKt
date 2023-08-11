package co.com.pragma.handle

import co.com.pragma.usecases.FooDoUsecase
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.server.*
import reactor.core.publisher.Mono


@Service
class StadisticsHandlers {


    @Bean
    fun helpy(usecase: FooDoUsecase): RouterFunction<ServerResponse> {
        return RouterFunctions.route(
            RequestPredicates.POST("/helpy").and(RequestPredicates.accept(MediaType.ALL)),
            HandlerFunction { request ->
                usecase
                    .invoke(request.bodyToMono(String::class.java))
                    .flatMap {
                        ServerResponse.ok()
                            .contentType(MediaType.TEXT_PLAIN)
                            .bodyValue(it)
                    }
            }
        )
    }

}