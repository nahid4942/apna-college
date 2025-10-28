# Java 21 Project Configuration

## Java Version Information
- **Target Java Version**: 21 (LTS)
- **Minimum Java Version**: 21
- **Language Level**: Java 21 with preview features enabled

## Key Java 21 Features Used

### 1. **Pattern Matching for Switch (Preview)**
- Enhanced switch expressions with pattern matching
- Guard conditions using `when` clauses
- Used in `LinkedListDemo.getListStatus()` and `ModernCollectionsDemo.analyzeList()`

### 2. **Text Blocks (Standard since Java 15)**
- Multi-line string literals with proper formatting
- Used throughout for console output formatting

### 3. **Records (Standard since Java 16)**
- Immutable data carriers with automatic methods
- Example: `Point` record in `ModernCollectionsDemo`

### 4. **Sealed Classes (Standard since Java 17)**
- Restricted class hierarchies for better type safety
- Can be implemented for more complex data structures

### 5. **var Keyword (Standard since Java 10)**
- Local variable type inference
- Used extensively for cleaner code

### 6. **Enhanced Switch Expressions (Standard since Java 14)**
- Expression-based switches with yield
- Arrow syntax for cleaner code

### 7. **Stream API Enhancements**
- `toList()` collector (Java 16+)
- Improved stream operations

## Build Configuration

### Maven Configuration
- Uses Maven 3.9+ for build management
- Compiler plugin configured for Java 21
- Preview features enabled for experimental features

### Dependencies
- JUnit 5.10.0 for modern testing
- No external dependencies for core functionality

## Modern Java Best Practices Applied

1. **Immutability**: Using records and defensive copying
2. **Type Safety**: Leveraging sealed classes and pattern matching
3. **Readability**: Text blocks and var for cleaner code
4. **Performance**: Stream API for functional programming
5. **Testing**: Comprehensive JUnit 5 tests with nested test classes

## Migration Notes

### From Original Code
- Converted basic classes to use modern Java features
- Added proper error handling and validation
- Implemented defensive programming practices
- Enhanced readability with modern syntax
- Added comprehensive test coverage

### Compile and Run Commands
```bash
# Compile with preview features
mvn clean compile -Dargs="--enable-preview"

# Run tests
mvn test

# Run specific main class
mvn exec:java -Dexec.mainClass="sorting.ModernSorting"
mvn exec:java -Dexec.mainClass="LinkedListDemo"
mvn exec:java -Dexec.mainClass="week1.ModernCollectionsDemo"
```

## IDE Configuration

### VS Code Settings
- Ensure Java extension pack is installed
- Configure Java home to point to Java 21 installation
- Enable preview features in VS Code Java settings

### IntelliJ IDEA Settings
- Set project SDK to Java 21
- Enable preview features in compiler settings
- Configure language level to "21 (Preview)"

## Future Enhancements

### Potential Java 21+ Features to Explore
1. **Virtual Threads (Project Loom)** - For concurrent programming
2. **Foreign Function & Memory API** - For native interop
3. **Vector API** - For SIMD operations
4. **Pattern Matching for instanceof** - Enhanced type checking

This project demonstrates a modern approach to Java development using the latest LTS version with contemporary best practices and language features.