package dev.graczykmateusz.monitoringapp

import io.micrometer.core.instrument.MeterRegistry
import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import org.springframework.stereotype.Component

@Component
class TrafficFilter(
  private val meterRegistry: MeterRegistry,
) : Filter {
  override fun doFilter(
    req: ServletRequest?,
    res: ServletResponse?,
    chain: FilterChain?,
  ) {
    meterRegistry.counter("traffic").increment()
    chain?.doFilter(req, res)
  }
}
