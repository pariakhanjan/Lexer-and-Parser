# Lexer-and-Parser
A compiler for the MiniLang programming language, implemented using ANTLR v3.
# Project Name: **MiniLang Compiler**

## Project Structure

- `Grammer.g`: ANTLR grammar file defining the MiniLang language syntax
- `__Test__.java`: Main test program to run the compiler
- `__Test___input.txt`: Sample MiniLang source code file
- `output.iml`: IntelliJ IDEA module configuration file
- Generated files:
  - `GrammerLexer.java`: Lexer generated from the grammar
  - `GrammerParser.java`: Parser generated from the grammar

## Language Features

MiniLang supports:
- Variable declarations with types (int, float, bool)
- Function declarations
- Control structures (if/else, while, for loops)
- Arrays
- Basic I/O (print)
- Arithmetic and logical operations

## Building and Running

1. Ensure you have ANTLR v3 installed
2. Generate lexer and parser from the grammar:
   ```
   java -jar antlr-3.5.3-complete-no-st3.jar Grammer.g
   ```
3. Compile all Java files:
   ```
   javac *.java
   ```
4. Run the test program:
   ```
   java __Test__
   ```

## Sample Input

See `__Test___input.txt` for an example MiniLang program.


## Notes

- The grammar includes error handling for common syntax mistakes
- The project is configured for IntelliJ IDEA but can be used with other IDEs
```
