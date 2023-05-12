# Multithreaded-Calculator

A threaded calculator is a Java application that performs arithmetic calculations concurrently using multiple threads. It includes a graphical user interface (GUI) for user input and displaying the results.
 
 ![ezgif com-video-to-gif (1)](https://github.com/Taijasi-Kaveri/Multithreaded-Calculator/assets/52359546/10a6424f-f0ae-47ad-8563-c93cb25d7454)
 
## Flowchart

![image](https://github.com/Taijasi-Kaveri/Multithreaded-Calculator/assets/52359546/2c24733b-b4b1-4f1c-99af-919d8764f016)

The flowchart above illustrates the main steps involved in the threaded calculator application. 

1. The user enters two numbers and selects an operation.
2. When the "Calculate" button is clicked, the application creates three instances of the `ThreadedCalculator` class, each representing a separate calculation.
3. The calculations are executed concurrently in separate threads.
4. Once all calculations are complete, the results are displayed in the GUI.

## Class Diagram

+------------------+              +-----------------+              +----------------------+
|   Calculator     |              | ThreadedCalculator |              | ThreadedCalculatorGUI |
+------------------+              +-----------------+              +----------------------+
|                  |              |                 |              |                      |
| - add(int, int)  |              | - number1: int  |              |                      |
| - subtract(int,  |              | - number2: int  |              |                      |
|   int)           |              | - operator:     |              |                      |
| - multiply(int,  |              |                 |              |                      |
|   int)           |              | - result: int   |              |                      |
|                  |              |                 |              |                      |
+------------------+              +-----------------+              +----------------------+
|                  |              |                 |              |                      |
|                  |              | + run(): void   |              |                      |
|                  |              | + getResult():  |              |                      |
|                  |              |   int           |              |                      |
|                  |              |                 |              |                      |
+------------------+              +-----------------+              +----------------------+
       ^                                    |                                |
       |                                    |                                |
       |                                    |                                |
       |                                    |                                |
       |                                    v                                |
       |                          +----------------+                          |
       |                          |     Thread     |                          |
       |                          +----------------+                          |
       |                                    |                                |
       |                                    |                                |
       |                                    v                                |
       |                          +----------------+                          |
       |                          |   JFrame       |                          |
       |                          +----------------+                          |
       |                                    |                                |
       +------------------------------------+--------------------------------+
In the class diagram above, there are three classes:

Calculator: Represents the calculator logic and contains methods for performing arithmetic calculations (add, subtract, and multiply).

ThreadedCalculator: Extends Thread and represents a thread responsible for executing calculations. It has instance variables for number1, number2, operator, and result. The run() method performs the actual calculation, and the getResult() method returns the result.

ThreadedCalculatorGUI: Extends JFrame and creates the GUI for the threaded calculator. It contains the main method and handles the user interface and interactions. It includes components like text fields and buttons for user input and result display.

Please note that the class diagram is a simplified representation of the classes and their relationships in the threaded calculator project. It shows the basic structure and dependencies between the classes.








The class diagram above shows the class structure of the threaded calculator project.

- `Main ` : prompt the user for input values and the desired operation.
- `Calculator`: Contains methods for performing arithmetic calculations.
- `ThreadedCalculator`: Extends `Thread` and represents a thread responsible for executing calculations.
- `ThreadedCalculatorGUI`: Extends `JFrame` and creates the GUI for the threaded calculator.

## Usage

1. Clone the repository
2. Open the project in your preferred Java IDE.
3. Compile and run the ThreadedCalculatorGUI class.
4. Enter two numbers and select an operation.
5. Click the "Calculate" button to perform the calculations.

The results will be displayed in the respective text fields in the GUI.

## Contributing
Contributions to the threaded calculator project are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

