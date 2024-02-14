package com.mycoachfit.api.infrastructure.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Lógica para obtener el nombre de usuario actual, por ejemplo, desde el contexto de seguridad
        // Retorna un Optional con el nombre de usuario actual
        return Optional.of("NombreDeUsuarioActual");
    }
}
