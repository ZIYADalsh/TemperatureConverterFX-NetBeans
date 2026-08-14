# TemperatureConverterFX

A JavaFX desktop application for converting temperature values between **Celsius, Fahrenheit, and Kelvin**.

## 📋 Overview

**TemperatureConverterFX** is a simple and user-friendly desktop application built with **JavaFX** and **Maven**. It allows users to enter a temperature value and convert it between different temperature units through a clean graphical interface.

The project also includes automated unit tests for the temperature conversion logic.

## ✨ Features

- Convert temperatures between **Celsius (°C)**, **Fahrenheit (°F)**, and **Kelvin (K)**.
- Real-time conversion as the user enters a value.
- Clean and responsive JavaFX graphical user interface.
- Separation of UI and conversion logic.
- Unit-tested conversion functionality using JUnit 5.
- Maven-based dependency and build management.
- Suitable for learning JavaFX, Maven, and basic software testing.

## 🛠️ Technologies Used

| Technology | Version / Purpose |
|---|---|
| **Java** | 17 |
| **JavaFX** | 21 |
| **Maven** | Build and dependency management |
| **JUnit** | 5 — Unit testing |
| **NetBeans** | Recommended IDE |

## 📁 Project Structure

```text
TemperatureConverterFX-NetBeans/
│
├── TemperatureConverterFX/
│   └── Main JavaFX project files
│
├── src/
│   ├── main/
│   │   ├── java/          # Java source code
│   │   └── resources/     # FXML, CSS, and image assets
│   │
│   └── test/
│       └── java/          # JUnit 5 unit tests
│
├── Documentation/         # Project reports and documents
│
├── pom.xml                # Maven configuration
└── README.md              # Project documentation
```

## ⚙️ Requirements

Before running the project, make sure the following are installed:

- **JDK 17 or later**
- **Maven 3.8+**
- A Java IDE such as **NetBeans**, IntelliJ IDEA, or Eclipse
- JavaFX 21 dependencies configured through Maven

Verify Java and Maven installations:

```bash
java -version
mvn -version
```

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/ZIYADalsh/TemperatureConverterFX-NetBeans.git
cd TemperatureConverterFX-NetBeans
```

### 2. Build the Project

Download dependencies and build the project using Maven:

```bash
mvn clean install
```

### 3. Run the Application

Start the JavaFX application with:

```bash
mvn javafx:run
```

Alternatively, open the project in **NetBeans** and run it from the IDE.

## 🧪 Running Tests

The project includes unit tests for the temperature conversion logic.

Run all tests with:

```bash
mvn test
```

To perform a clean build and run the tests:

```bash
mvn clean test
```

## 🌡️ Temperature Conversions

The application supports the following standard conversions:

### Celsius → Fahrenheit

```text
°F = (°C × 9/5) + 32
```

### Fahrenheit → Celsius

```text
°C = (°F − 32) × 5/9
```

### Celsius → Kelvin

```text
K = °C + 273.15
```

### Kelvin → Celsius

```text
°C = K − 273.15
```

The application uses these formulas to perform the conversions through its Java conversion logic.

## 🖥️ Application Workflow

```text
Enter Temperature
        │
        ▼
Select Source Unit
        │
        ▼
Select Target Unit
        │
        ▼
Perform Conversion
        │
        ▼
Display Result
```

## 📚 Learning Objectives

This project demonstrates practical usage of:

- Java programming
- JavaFX GUI development
- Maven project management
- FXML-based user interfaces
- CSS styling for JavaFX
- Event-driven programming
- Mathematical conversion logic
- Unit testing with JUnit 5
- Basic separation of application logic and presentation

## 📄 Documentation

Additional project reports and documents are available in:

```text
Documentation/
```

## 👨‍💻 Author

**ZIYADalsh**

Software Developer / Programmer

## 🔗 Repository

The source code is available on GitHub:

https://github.com/ZIYADalsh/TemperatureConverterFX-NetBeans

## 📌 Project Status

**Status:** Completed / Educational Project

The project can be extended in the future with additional features such as conversion history, input validation, more measurement units, themes, and improved accessibility.

---

If you find this project useful for learning JavaFX or Maven, consider giving the repository a ⭐ on GitHub.
