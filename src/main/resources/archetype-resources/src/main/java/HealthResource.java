#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;


@Liveness
@Readiness
@ApplicationScoped
public class HealthResource implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse
                .builder()
                .name("hello-jakarta-ee")
                .up()
                .build();
    }
}