package co.com.pragma.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType


@Configuration
@ComponentScan(
    value = ["co.com.pragma.usecases"],
    useDefaultFilters = false,
    includeFilters = [
        ComponentScan.Filter(
            type = FilterType.REGEX,
            pattern = [".*Usecase"]
        )
    ]
)
open class StadisticsConfig