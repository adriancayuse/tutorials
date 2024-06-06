package com.baeldung.opentelemetry;

import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceApplication {
    public static void main(String[] args) {
        AutoConfiguredOpenTelemetrySdk.initialize();
        SpringApplication.run(PriceApplication.class, args);
    }
}
