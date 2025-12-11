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
2. Install the Android SDK (via Android Studio or commandline tools) and point Gradle to it by either exporting `ANDROID_HOME`/`ANDROID_SDK_ROOT` or adding a `sdk.dir=/path/to/Android/Sdk` entry in `android/local.properties`. For the commandline tools route:
   ```bash
   mkdir -p "$HOME/android-sdk/cmdline-tools"
   cd "$HOME/android-sdk/cmdline-tools"
   wget https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip
   unzip commandlinetools-linux-11076708_latest.zip -d latest
   yes | "${HOME}/android-sdk/cmdline-tools/latest/bin/sdkmanager" "platform-tools" "platforms;android-34" "build-tools;34.0.0"
   export ANDROID_HOME="$HOME/android-sdk"
   export ANDROID_SDK_ROOT="$HOME/android-sdk"
   ```
3. Make sure the Gradle wrapper is executable:
   ```bash
   chmod +x android/gradlew
   ```
4. Build the debug APK from the repository root using your installed JDK 17 and SDK:
   ```bash
   cd android
   JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64 ./gradlew assembleDebug --no-daemon --console=plain
   ```

When the build completes, the APK is located at `android/app/build/outputs/apk/debug/app-debug.apk`.

### GitHub Actions build

The repository includes a workflow at `.github/workflows/android-debug.yml` that prepares JDK 17 and the Android SDK, builds the debug APK, and publishes `app-debug.apk` as a workflow artifact. The workflow relies on the in-repo `:kompakt` stub module so that the open-source build does not require private Mudita UI dependencies.
