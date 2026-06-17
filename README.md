# Appium Mobile Automation Framework

A minimal Appium + Java + TestNG mobile automation framework for Android application testing.

## Tech Stack

* Java 17
* Maven
* Appium
* TestNG
* Android Emulator / Real Device

## Project Structure

```text
appium-mobile-automation2
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── drivers
│   │   │   ├── pages
│   │   │   └── utils
│   │   │
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   ├── base
│       │   └── tests
│       │
│       └── resources
│           └── apps
│               └── ApiDemos-debug.apk
│
├── pom.xml
├── testng.xml
└── README.md
```

## Prerequisites

Before running the tests, ensure the following are installed:

* Java JDK 17
* Maven
* Android Studio
* Android SDK
* Appium Server
* UiAutomator2 Driver

Verify installation:

```bash
java -version
mvn -version
adb version
appium -v
```

## Start Android Emulator

List available emulators:

```bash
emulator -list-avds
```

Start emulator:

```bash
emulator -avd Pixel_6
```

Verify device connection:

```bash
adb devices
```

Expected:

```text
List of devices attached
emulator-5554    device
```

## Start Appium Server

```bash
appium
```

Expected:

```text
Appium REST http interface listener started on
http://127.0.0.1:4723
```

## Execute Tests

Navigate to project root:

```bash
cd appium-mobile-automation2
```

Run tests:

```bash
mvn clean test
```

## Test Scenario

* Launch ApiDemos application
* Verify application launches successfully
* Validate home page elements
* Close application

## Reporting

TestNG default reports:

```text
test-output/
```

## Author

Hasan Tanjeer

## License

This project is intended for learning and demonstration purposes.
