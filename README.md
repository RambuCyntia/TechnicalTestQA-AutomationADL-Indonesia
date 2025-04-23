# Katalon-Weather-API-Test

This project automates testing of weather APIs (specifically Air Quality Index) using Katalon Studio.

## Prerequisites

- Install [Katalon Studio](https://www.katalon.com/download/)
- Ensure you have a valid API key from [OpenWeather](https://openweathermap.org/api) for weather and air pollution APIs.

## Running the Tests

1. Clone this repository:
   ```bash
   git clone https://github.com/username/Katalon-Weather-API-Test.git

## Structure Project 

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
