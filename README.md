# cryptography-program
Simple program for encryption text data. Done as a part of Java Developer track on Hyperskill
**Table of Contents**

[TOCM]

[TOC]

# About
Simple project  done on Hyperskill platform as a part of JetBrains Academy course. It tought the basics about cryptography and intrduce me to OOP.  It was my first solo project since graduading from Java bootcamp in 2019. 

Program implementation consisted of 6 stages. Each stage added some new funcionality and thus complexity.

**Learning outcomes according to Hyperskill**
Gradually get familiar with Java, paying special attention to working with files and the command line.

# Used Java Tools
- Scanner 
- Arrays
- Loops
- Casting types
- Command line
- OOP
- Basic Exception handling
- Inheritance
- Files
- Polimorphism
- Interfaces
- Strategy Design Pattern

# How to use the program

The program work with command-line arguments instead of the standard input and parse given arguments (arguments may be in different order):

- **key ()** If there is no -key, the program should consider that key = 0.
- **mode ()** If there is no -mode, the program should work in enc mode.
- **data()** If there is no -data, the program should assume that the data is an empty string.
- **in() **specify the full name of a file to read data.
- **out()** specify the full name of a file to write the result.

**Extra rules in different argument cases:**
- If there is no -mode, the program should work in enc mode.
- If there is no -key, the program should consider that key = 0.
- If there is no -data, and there is no -in the program should assume that the data is an empty string.
- If there is no -out argument, the program must print data to the standard output.
- If there are both -data and -in arguments, your program should prefer -data over -in.
- If there is a non-standard situation (an input file does not exist or an argument doesn’t have a value), the program should not fail. Instead, it must display a clear message about the problem and stop successfully. The message should contain the word "Error" in any case.

**Examples of arguments: **

` java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5`

` java Main -mode enc -key 5 -data "Welcome to hyperskill!"`

`java Main -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec`

Please note that you must** create -in file !**

# Plans for future improvement
- code refactoring
- documentation
