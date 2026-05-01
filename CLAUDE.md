# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run Commands

```bash
# Build debug APK
./gradlew assembleDebug

# Run unit tests
./gradlew test

# Run a specific unit test class
./gradlew testDebugUnitTest --tests "com.example.culture_generale.ExampleUnitTest"

# Run instrumented tests (requires connected device or emulator)
./gradlew connectedAndroidTest

# Lint
./gradlew lint

# Clean build
./gradlew clean assembleDebug
```

## Tech Stack

- **Language:** Kotlin 2.2.10
- **UI:** Jetpack Compose with Material3
- **Min SDK:** 28 | **Target/Compile SDK:** 36
- **Build:** Gradle 9.4.1 with Kotlin DSL (`build.gradle.kts`) and version catalog (`gradle/libs.versions.toml`)
- **Compose BOM:** 2026.02.01

## Architecture & Structure

This is a single-module Android app (`app/`) at its initial scaffold stage. Entry point is `MainActivity` (extends `ComponentActivity`), which sets the Compose content with the app theme.

**Package:** `com.example.culture_generale`

- `MainActivity.kt` — app entry point, hosts the root composable
- `ui/theme/` — Material3 theme setup: `Theme.kt` (dynamic color for Android 12+), `Color.kt`, `Type.kt`

Dependencies are declared via version catalog aliases (e.g., `libs.androidx.core.ktx`) — add new deps to `gradle/libs.versions.toml` first, then reference them in `app/build.gradle.kts`.