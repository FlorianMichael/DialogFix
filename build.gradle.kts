import de.florianreuth.baseproject.*

plugins {
    id("net.fabricmc.fabric-loom-remap")
    id("de.florianreuth.baseproject")
}

setupProject()
setupFabricRemap()
setupPublishing()

repositories {
    maven("https://maven.terraformersmc.com/releases")
}

dependencies {
    modCompileOnly("com.terraformersmc:modmenu:15.0.0")
}
