import de.florianmichael.baseproject.*

plugins {
    id("fabric-loom")
    id("de.florianmichael.baseproject.BaseProject")
}

setupProject()
setupFabric()

repositories {
    maven("https://maven.terraformersmc.com/releases")
}

dependencies {
    modCompileOnly("com.terraformersmc:modmenu:15.0.0")
}
