# Utility

The cross-platform native Kotlin command line tool template.

## Usage

Make sure you are signed in to your GitHub account, then just [click here](https://github.com/demidko/utility/generate)
to use template.

## Download

GitHub CI automatically generates versions of the application for different operating systems. See the Actions Tab.

* [Windows version]()
* [macOS version]()
* [Linux version]()

## Build

You can build the utility yourself from the source code. We need GCC or LLVM or Visual Studio toolchain, and xmake build
system. If you are using Windows, you need to configure [`windowsVsVarsPath`](build.gradle.kts) property.

```shell
./gradlew clean build
```

After that, we can run the release app:

```shell
./build/graal/utility
```

## Containerization

To build the image, we need Docker installed:

```shell
docker run -v `pwd`:`pwd` -w `pwd` -it --rm -p 80:80 app 
```

After that, we can run the app in the container (if needed):

```shell
docker run -v `pwd`:`pwd` -w `pwd` -it --rm -p 80:80 app 
```

To clean up Docker use `docker system prune -fa`

## Interop with Java

See [JNR project](https://github.com/jnr/jnr-ffi).

