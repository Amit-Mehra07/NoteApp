NoteApp is an Android application for creating, managing, and organizing notes.

It is built using the MVVM (Model-View-ViewModel) architecture pattern, Room for local database storage, and LiveData for observing data changes.

## Features:
- Create,
- edit,
and
- delete notes
- Categorize notes with tags
- Search notes
- Persistent storage using Room database
- Reactive UI updates with LiveData
## Technologies Used :
**MVVM Architecture:**  Ensures a clean separation of concerns and facilitates easier testing and maintenance.

**Room Database:** Provides an abstraction layer over SQLite to allow for more robust database access.

**LiveData:** Lifecycle-aware data holder that allows the UI to update automatically when the data changes.

**ViewModel:** Designed to store and manage UI-related data in a lifecycle conscious way.

**Kotlin:** Modern programming language used for developing Android applications.

**XML:** For designing User Interface.


## Getting Started
Prerequisites : 

 ### Android Studio 4.0 or higher
 
 ### Java Development Kit (JDK) 8 or higher
 
 ## Installation
**Clone the repository:**

git clone [https://github.com/Amit-Mehra07/NoteApp.git]

Open the project in **Android Studio:**

- Select File -> Open...
Navigate to the cloned directory and select it

- Build the project:
Click on the Build menu and select Make Project
Run the app:

- Click on the Run menu and select Run 'app'
   
## Project Structure
**data:** Contains the Room database, DAO, and data entities.

**ui:** Contains the UI components such as activities and fragments.

**viewmodel:** Contains the ViewModel classes that interact with the repository.

**repository:** Contains the repository classes that handle data operations.

## Usage
- *Launch the app on your Android device or emulator.*

- *Use the floating action button to create a new note.*

- *Tap on a note to edit or delete it.*

- *Use the search functionality to find specific notes.*

## Contributing
***Contributions are welcome! Please follow these steps to contribute:***

