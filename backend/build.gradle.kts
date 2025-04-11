plugins {
    id("java")
}

group = "org.kasikornline.assignment"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    // Spring Boot Starter
    implementation("org.springframework.boot:spring-boot-starter-web")

    // MySQL Connector
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("mysql:mysql-connector-java")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // JUnit 5
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootJar {
    archiveFileName.set("app.jar")
}