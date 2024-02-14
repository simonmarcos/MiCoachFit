package com.mycoachfit.api.infrastructure.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Lógica para obtener el nombre de usuario actual, por ejemplo, desde el contexto de seguridad
        // Retorna un Optional con el nombre de usuario actual
        return Optional.of("NombreDeUsuarioActual");
    }
}
