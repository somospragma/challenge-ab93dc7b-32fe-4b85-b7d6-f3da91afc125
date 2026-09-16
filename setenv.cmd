@echo off
REM ============================================================
REM  Java 17 SOLO para este proyecto (no toca el PATH global).
REM  Uso:  setenv.cmd            -> deja la terminal con JDK 17
REM        setenv.cmd compile    -> ejecuta mvnw compile con JDK 17
REM        setenv.cmd spring-boot:run
REM ============================================================

set "JAVA_HOME=C:\Program Files\Java\jdk-17"
set "PATH=%JAVA_HOME%\bin;%PATH%"

echo [Proyecto] JAVA_HOME = %JAVA_HOME%
for /f "delims=" %%v in ('"%JAVA_HOME%\bin\java.exe" -version 2^>^&1 ^| findstr /i version') do echo [Proyecto] %%v

if not "%~1"=="" (
    call "%~dp0mvnw.cmd" %*
)
