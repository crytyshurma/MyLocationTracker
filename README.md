# LocationSender App

LocationSender is a Java application designed for Android devices that **sends the user's phone location to a specified website (in JSON)** every 5000 milliseconds (5 seconds), provided the user has moved at least 5 meters since the last update.

## Features

- Sends the user's current location to a designated server.
- Converts *POJO* to *JSON* using ***Gson library***
- Uses **LocationManager**
- Updates the server every 5000 milliseconds (5 seconds).
- Only sends updates if the user has moved at least 5 meters since the last location update.

## Prerequisites

- Android Studio
- Android device or emulator with location services enabled
- Internet access for sending data to the server

