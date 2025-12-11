# KompaktOS-Maps

#### Local configuration:

To build debug and release versions of the app, add the following entries to `local.properties`:
```properties
mudita_repo_username={your.nexus.username}
mudita_repo_password={your.nexus.password}
mudita_nexus_repo_url={your.nexus.url}
```

For the release build, additional Sentry configuration is required:
```properties
sentry_url={sentry.url}
sentry_project={sentry.project}
sentry_org={sentry.org}
sentry_auth_token={sentry.auth.token}
```

### Building a debug APK without private credentials

You can produce a debug APK using only public repositories. The private `local.properties` entries above are **not** required for this path.

1. Install JDK 17 (example for Debian/Ubuntu):
   ```bash
   sudo apt-get update
   sudo apt-get install -y openjdk-17-jdk
   ```
2. Make sure the Gradle wrapper is executable:
   ```bash
   chmod +x android/gradlew
   ```
3. Build the debug APK from the repository root (Gradle will honor `org.gradle.java.home` set to the installed JDK 17):
   ```bash
   cd android
   JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64 ./gradlew assembleDebug --no-daemon --console=plain
   ```

When the build completes, the APK is located at `android/app/build/outputs/apk/debug/app-debug.apk`.
