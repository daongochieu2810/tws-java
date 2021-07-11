plugins {
    id("twsjava.app")
}

dependencies {
    implementation(project(":lib"))
}

application {
    // Define the main class for the application.
    mainClass.set("twsjava.samples.testclient.Main")
}
