# Calculator Operations Module

This module provides additional operations for the calculator application.

## Features

- Square Root operation: Calculates the square root of a number

## How to Use

1. Add this module as a Git submodule to your calculator project
2. Load the module in your application:

```java
ModuleManager.getInstance().loadModule(new SquareRootModule());
```

3. Use the operation in your calculator:

```java
double result = calculator.performOperation("sqrt", 16.0);
// result = 4.0
```

## How to Extend

You can add more operations to this module by:

1. Creating a new operation class that implements the `Operation` interface
2. Creating a new module class that implements the `CalculatorModule` interface
3. Registering the operation in the module's `initialize` method

## License

This project is licensed under the MIT License - see the LICENSE file for details.