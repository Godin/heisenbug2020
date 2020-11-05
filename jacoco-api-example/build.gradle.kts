plugins {
    java
    jacoco
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.platform:junit-platform-launcher")

    testImplementation("org.jacoco:org.jacoco.agent:0.8.6:runtime")
    testImplementation("org.jacoco:org.jacoco.report:0.8.6")
}

tasks.test {
    useJUnitPlatform()
}

configure<JacocoPluginExtension> {
    toolVersion = "0.8.6"
}
