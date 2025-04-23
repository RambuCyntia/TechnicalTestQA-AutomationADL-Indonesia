# Katalon-Weather-API-Test

This project automates testing of weather APIs and Air Quality Index using Katalon Studio.

## Prerequisites

- Install [Katalon Studio](https://www.katalon.com/download/)
- Ensure you have a valid API key from [OpenWeather](https://openweathermap.org/api) for weather and air pollution APIs.

## Running the Tests

1. Clone this repository:
   ```bash
   git clone https://github.com/username/Katalon-Weather-API-Test.git](https://github.com/RambuCyntia/TechnicalTestQA-AutomationADL-Indonesia.git

2. Run test via A Test Suite

## How To Get Report PDF
Once the test suite is finished, you can go to Tab Result -> Export Report -> PDF

## Project Structure
```text
APITesting - Weather Forecast/
│
├── Test Cases/
│   └── TC - 5 Day Weather Forecast - Cilandak.tc
│	└── TC - 5 Day Weather Forecast - Jagakarsa.tc
│	└── TC - 5 Day Weather Forecast - Pancoran.tc
│	└── TC - Current Air Pollution - Cilandak.tc
│	└── TC - Current Air Pollution - Jagakarsa.tc
│	└── TC - Current Air Pollution - Pancoran.tc
│
├── Object Repository/
│   └── 5 Day Weather Forecast - Cilandak.rs
│   └── 5 Day Weather Forecast - Jagakarsa.rs
│   └── 5 Day Weather Forecast - Pancoran.rs
│   └── Current Air Pollution - Cilandak.rs
│   └── Current Air Pollution - Jagakarsa.rs
│   └── Current Air Pollution - Pancoran.rs
│
├── Test Suite/
│   └── TS - 5 Day Weather Forecast - Jakarta Selatan.groovy
│   └── TS - 5 Day Weather Forecast - Jakarta Selatan.ts
│   └── TS - Current Air Pollution - Jakarta Selatan.groovy
│   └── TS - Current Air Pollution - Jakarta Selatan.ts
```
