# Flock Tracker
### Android Application Development Project

**Developer:** Christopher Dittmer  
**Development Platform:** Android Studio  
**Programming Language:** Kotlin  
**User Interface:** XML  
**Data Storage:** SharedPreferences and JSON  
**Repository:** https://github.com/CNDittmer/Andriod

## 1. Project Description

Flock Tracker is an Android application designed to help chicken owners organize and manage their flocks. The application provides a simple interface where users can enter each chicken's name and breed and view their flock information.

The application was developed using Android Studio, Kotlin, and XML.

## 2. Problem Addressed

Managing a flock of chickens can become difficult as the number of birds increases. Owners may have trouble remembering individual chicken names, breeds, and other important information.

Flock Tracker addresses this problem by providing a centralized digital record of the chickens in a flock.

## 3. Platform

Flock Tracker is designed for Android devices.

- **IDE:** Android Studio
- **Language:** Kotlin
- **Interface:** XML
- **Operating System:** Android
- **Version Control:** Git and GitHub

## 4. Front-End and Back-End Support

### Front-End

The application uses an XML-based interface containing:

- Application title and description
- Chicken name input field
- Chicken breed input field
- Add to Flock button
- My Flock display section
- Scrollable screen layout

### Back-End

Kotlin handles the application's functionality, including:

- Processing user input
- Validating required fields
- Creating chicken records
- Updating the flock display
- Displaying confirmation messages
- Managing locally stored flock information

SharedPreferences and JSON provide persistent local storage, allowing flock records to remain available after the application is closed and reopened.

## 5. Application Functionality

The application allows users to:

1. Enter a chicken's name.
2. Enter the chicken's breed.
3. Add the chicken to the flock.
4. View a numbered list of chickens.
5. Receive confirmation messages.
6. Receive warnings when required fields are empty.
7. Automatically save flock information.
8. Reload saved flock records when reopening the application.

The application works offline and does not require a user account.

## 6. Application Design

Flock Tracker uses a simple vertical layout intended to make flock management easy.

The main screen includes two input fields, an Add to Flock button, and a section displaying registered chickens.

The interface uses Android XML components, while Kotlin manages button events and application behavior.

### Main Screen Wireframe

```text
+----------------------------+
|        Flock Tracker       |
|                            |
| Keep track of the chickens |
|       in your flock.       |
|                            |
| Chicken Name               |
| [Enter chicken name      ] |
|                            |
| Breed                      |
| [Enter chicken breed     ] |
|                            |
| [      Add to Flock      ] |
|                            |
| My Flock                   |
|                            |
| 1. Henrietta - Rhode       |
|    Island Red              |
|                            |
+----------------------------+
```

*Example data shown for illustration.*

## 7. Testing and Validation

The application includes validation to prevent users from adding chickens without entering both a name and a breed.

Permanent storage was tested by adding a chicken, closing the application, and reopening it. The saved chicken remained visible.

## 8. Project Development and Changelog

### Initial Development
- Created the Android Studio project.
- Developed the XML layout.
- Added chicken name and breed input fields.
- Created the Add to Flock button.

### Functionality Development
- Implemented Kotlin event handling.
- Added input validation.
- Created the flock display list.
- Added confirmation messages.

### Storage and Final Improvements
- Implemented persistent local storage.
- Updated the displayed application name to Flock Tracker.
- Tested saved records after restarting the application.
- Updated project documentation.

## 9.Future Enhancements

Potential improvements include:

Editing and deleting chicken records

Recording egg production

Tracking feeding schedules

Recording health information

Adding chicken photographs

Exporting flock records

Cloud backup and synchronization

These are planned enhancements and are not part of the currently implemented functionality.

10. Conclusion

Flock Tracker demonstrates the development of a functional Android application using Kotlin, XML, event handling, data validation, and persistent local storage.

The project provides a foundation for future improvements that could make managing backyard chicken flocks more efficient and organized.
