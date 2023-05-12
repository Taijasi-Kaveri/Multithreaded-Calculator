# Multithreaded-Calculator

A threaded calculator is a Java application that performs arithmetic calculations concurrently using multiple threads. It includes a graphical user interface (GUI) for user input and displaying the results.
 
 ![ezgif com-video-to-gif](https://github.com/Taijasi-Kaveri/Multithreaded-Calculator/assets/52359546/c821b385-2601-4071-b0db-9c4cdf74b8d1) 
 
## Flowchart

![Flowchart](./images/flowchart.png)

The flowchart above illustrates the main steps involved in the threaded calculator application. 

1. The user enters two numbers and selects an operation.
2. When the "Calculate" button is clicked, the application creates three instances of the `ThreadedCalculator` class, each representing a separate calculation.
3. The calculations are executed concurrently in separate threads.
4. Once all calculations are complete, the results are displayed in the GUI.

## Class Diagram

![Class Diagram](./images/class-diagram.png)

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

