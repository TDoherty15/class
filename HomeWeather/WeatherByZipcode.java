// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

WeatherByZipcode weatherByZipcodeChoreo = new WeatherByZipcode(session);

// Get an InputSet object for the choreo
WeatherByZipcodeInputSet weatherByZipcodeInputs = weatherByZipcodeChoreo.newInputSet();

// Set credential to use for execution
weatherByZipcodeInputs.setCredential("HomeWeather");

// Set inputs

// Execute Choreo
WeatherByZipcodeResultSet weatherByZipcodeResults = weatherByZipcodeChoreo.execute(weatherByZipcodeInputs);