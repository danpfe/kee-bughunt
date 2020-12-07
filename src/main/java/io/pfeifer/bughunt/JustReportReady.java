package io.pfeifer.bughunt;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Readiness
public class JustReportReady implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("hello");
    }
}
