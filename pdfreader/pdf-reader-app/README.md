# PDF Reader App

## Overview
The PDF Reader App is a Java-based application designed to provide users with a simple and efficient way to view and interact with PDF documents. This application allows users to load, render, and extract text from PDF files seamlessly.

## Features
- Load and display PDF documents.
- Extract text from PDF files.
- User-friendly interface for easy navigation.
- Support for various PDF formats.

## Project Structure
```
pdf-reader-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── pdfreader
│   │   │           ├── App.java
│   │   │           ├── ui
│   │   │           │   └── MainWindow.java
│   │   │           └── utils
│   │   │               └── PdfUtils.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven

### Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd pdf-reader-app
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```

### Running the Application
To run the application, execute the following command:
```
mvn exec:java -Dexec.mainClass="com.pdfreader.App"
```

## Usage
Once the application is running, you can open PDF files through the user interface. Use the menu options to load a PDF document and navigate through its pages.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.