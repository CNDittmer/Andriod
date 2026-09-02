# FlockTrack

## Android Chicken Care Tracker

**Developer:** Christopher Dittmer\
**Platform:** Android\
**Development Environment:** Android Studio\
**Project Type:** Mobile Application

------------------------------------------------------------------------

## Project Description

FlockTrack is an Android mobile application designed to help backyard
chicken owners organize and track information about their flock. The
application will provide a simple location for recording information
about individual chickens, egg production, and routine care activities.

The goal of FlockTrack is to create a practical application that is easy
to use while demonstrating important Android development concepts such
as user-interface design, navigation, local data storage, and data
management.

------------------------------------------------------------------------

## Problem Addressed

Backyard chicken owners have several responsibilities that need to be
monitored regularly. These can include feeding, providing fresh water,
cleaning the coop, collecting eggs, and monitoring individual chickens.

As the size of a flock increases, remembering information about each
chicken can become difficult. Owners may also want to keep records of
egg production or when important care activities were completed.

FlockTrack will address this problem by providing one application where
users can store and review this information instead of relying on paper
records, separate notes, or memory.

------------------------------------------------------------------------

## Platform

FlockTrack will be developed for the **Android operating system** using
**Android Studio**.

The application will initially be designed for Android smartphones and
will use a touch-based interface. Android provides the tools necessary
to design, develop, test, and deploy the application.

------------------------------------------------------------------------

## Front-End Support

The front end will provide the graphical interface that allows users to
interact with FlockTrack.

The interface will include:

-   Home screen
-   Chicken list
-   Add/edit chicken forms
-   Egg tracking screen
-   Care tracking screen
-   Summary screen
-   Buttons and navigation controls
-   Text fields for entering information

The interface will be designed to remain simple and consistent so that
users can easily locate the application's major features.

------------------------------------------------------------------------

## Back-End Support

The back end will be responsible for storing and retrieving application
data.

Local data storage will be used so that the application's basic
functions can operate without requiring a constant Internet connection.

The application will store information related to:

-   Chickens
-   Egg collection
-   Care activities
-   User-entered notes

The back end will allow information to be created, retrieved, updated,
and deleted as necessary.

------------------------------------------------------------------------

## Application Functionality

### Flock Management

Users will be able to:

-   Add a chicken
-   View chickens in the flock
-   Edit chicken information
-   Delete a chicken
-   Record notes about individual chickens

Information recorded for each chicken may include:

-   Name
-   Breed
-   Age
-   Sex
-   Notes

### Egg Tracking

Users will be able to:

-   Enter the number of eggs collected
-   Record the collection date
-   View previous egg records
-   View basic egg-production totals

### Care Tracking

Users will be able to record routine activities such as:

-   Feeding
-   Water checks or changes
-   Coop cleaning
-   Other flock-care activities

------------------------------------------------------------------------

# Design and Wireframes

## Home Screen

``` text
+--------------------------------+
|           FlockTrack           |
|--------------------------------|
|                                |
|       [ My Chickens ]          |
|                                |
|       [ Egg Tracker ]          |
|                                |
|       [ Care Tracker ]         |
|                                |
|       [ View Summary ]         |
|                                |
+--------------------------------+
```

## My Chickens Screen

``` text
+--------------------------------+
|          My Chickens           |
|--------------------------------|
| Henrietta     Rhode Island Red |
| Daisy         Plymouth Rock    |
| Pepper        Australorp       |
|                                |
|       [ + Add Chicken ]        |
+--------------------------------+
```

## Add Chicken Screen

``` text
+--------------------------------+
|          Add Chicken           |
|--------------------------------|
| Name:   [________________]     |
|                                |
| Breed:  [________________]     |
|                                |
| Age:    [________________]     |
|                                |
| Sex:    [________________]     |
|                                |
| Notes:  [________________]     |
|         [________________]     |
|                                |
|          [ SAVE ]              |
+--------------------------------+
```

## Egg Tracker Screen

``` text
+--------------------------------+
|          Egg Tracker           |
|--------------------------------|
| Date:        [____________]    |
|                                |
| Eggs Today:  [____________]    |
|                                |
|          [ SAVE ]              |
|                                |
| This Week:  28 Eggs            |
| This Month: 97 Eggs            |
+--------------------------------+
```

------------------------------------------------------------------------

## Planned Project Structure

``` text
FlockTrack
│
├── Home
├── My Chickens
│   ├── Add Chicken
│   ├── Edit Chicken
│   └── Delete Chicken
├── Egg Tracker
│   ├── Add Egg Record
│   └── View Egg History
├── Care Tracker
│   ├── Feeding
│   ├── Water
│   └── Coop Cleaning
└── Summary
    ├── Flock Information
    └── Egg Production
```

------------------------------------------------------------------------

## Development Goals

1.  Create a functional Android mobile application.
2.  Develop an organized and easy-to-use interface.
3.  Implement navigation between application screens.
4.  Implement persistent local data storage.
5.  Allow users to add, view, edit, and delete information.
6.  Test the application and correct programming or usability problems.
7.  Maintain project files and documentation using GitHub.

------------------------------------------------------------------------

## Possible Future Features

-   Chicken photographs
-   Feeding reminders
-   Coop-cleaning notifications
-   Health and observation history
-   Egg-production charts
-   Individual egg-production tracking
-   Data backup
-   Cloud synchronization

------------------------------------------------------------------------

## GitHub Project Documentation

GitHub will be used throughout the development of FlockTrack for version
control and project documentation.

The repository will contain the Android project files and this README
file. A GitHub Wiki will also be used to publish the project outline and
additional project documentation as required by the course.

------------------------------------------------------------------------

## Project Status

**Current Stage:** Planning and Design

The initial project concept, requirements, functionality, and wireframes
have been established. Development of the Android application will begin
following approval of the project outline.

------------------------------------------------------------------------

## Author

**Christopher Dittmer**

FlockTrack Android Application Project
