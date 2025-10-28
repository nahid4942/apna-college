@echo off
echo Java 21 Project Compilation Script
echo ===================================

set JAVA_HOME=
set PROJECT_ROOT=%~dp0
set SRC_DIR=%PROJECT_ROOT%src\main\java
set TEST_SRC_DIR=%PROJECT_ROOT%src\test\java
set BUILD_DIR=%PROJECT_ROOT%build
set CLASSES_DIR=%BUILD_DIR%\classes
set TEST_CLASSES_DIR=%BUILD_DIR%\test-classes

echo Creating build directories...
if not exist "%BUILD_DIR%" mkdir "%BUILD_DIR%"
if not exist "%CLASSES_DIR%" mkdir "%CLASSES_DIR%"
if not exist "%TEST_CLASSES_DIR%" mkdir "%TEST_CLASSES_DIR%"

echo.
echo Compiling Java 21 source files...
javac --enable-preview --release 21 ^
      -d "%CLASSES_DIR%" ^
      -sourcepath "%SRC_DIR%" ^
      "%SRC_DIR%\*.java" ^
      "%SRC_DIR%\sorting\*.java" ^
      "%SRC_DIR%\week1\*.java"

if %ERRORLEVEL% EQU 0 (
    echo ✓ Compilation successful!
    echo.
    echo Available main classes:
    echo   1. LinkedListDemo
    echo   2. sorting.ModernSorting  
    echo   3. week1.ModernCollectionsDemo
    echo.
    echo To run a class, use:
    echo   java --enable-preview -cp "%CLASSES_DIR%" [ClassName]
    echo.
    echo Example:
    echo   java --enable-preview -cp "%CLASSES_DIR%" LinkedListDemo
) else (
    echo ✗ Compilation failed!
    echo Please check the error messages above.
)

echo.
echo Press any key to continue...
pause > nul