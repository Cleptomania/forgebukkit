
plugins {
    id("com.gtnewhorizons.gtnhconvention")
}

tasks.applyJST.configure {
    interfaceInjectionConfigs.setFrom("src/injectedInterfaces/interfaces.json")
}
