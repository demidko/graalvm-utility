import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  kotlin("jvm") version "1.7.22"
  id("com.palantir.graal") version "0.12.0"
}
dependencies {
  implementation("com.github.ajalt.clikt:clikt:3.5.0")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("io.mockk:mockk:1.13.2")
}
tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "17"
  kotlinOptions.freeCompilerArgs += listOf("-opt-in=kotlin.time.ExperimentalTime")
}
tasks.test {
  useJUnitPlatform()
}
graal {
  javaVersion("17")
  graalVersion("22.3.0")
  option("--no-fallback")
  mainClass("AppKt")
  outputName(projectDir.name)
  windowsVsVarsPath("C:\\Program Files\\Microsoft Visual Studio\\2022\\Enterprise\\VC\\Auxiliary\\Build\\vcvars64.bat")
}
tasks.build {
  dependsOn(tasks.nativeImage)
}
