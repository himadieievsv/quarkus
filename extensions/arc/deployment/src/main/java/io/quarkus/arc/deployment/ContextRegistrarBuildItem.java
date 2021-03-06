package io.quarkus.arc.deployment;

import io.quarkus.arc.processor.ContextRegistrar;
import io.quarkus.builder.item.MultiBuildItem;

public final class ContextRegistrarBuildItem extends MultiBuildItem {

    private final ContextRegistrar contextRegistrar;

    public ContextRegistrarBuildItem(ContextRegistrar contextRegistrar) {
        this.contextRegistrar = contextRegistrar;
    }

    public ContextRegistrar getContextRegistrar() {
        return contextRegistrar;
    }
}
