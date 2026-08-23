Core Study Resources to Provide Trainees
Before starting, ensure trainees bookmark these core resources, as daily tasks map directly to them:

Google’s "Android Basics with Compose" Course: The definitive, self-paced interactive course for modern Android.

Kotlin Koans: Browser-based exercises by JetBrains for mastering Kotlin syntax.

The Official Android Developer Documentation: For deep dives into specific components (developer.android.com).

Week 1: Kotlin Fundamentals & The Environment
Day 1: Android Studio & Tooling Setup
Topics: Understanding the JVM, Android Studio, the Emulator, and the Gradle build system as a package manager. Reviewing the app/src/main structure and AndroidManifest.xml.

Task: Install Android Studio, create a new project, configure a virtual device, and run the default "Hello World" template.

Reference: Android Basics with Compose -> Unit 1: Your first Android app.

Day 2: Core Kotlin Syntax & Null Safety
Topics: val vs var, data types, string templates, control flow (if, when, for), and null safety concepts (?, ?:, !!).

Task: Write basic Kotlin scripts (using the Kotlin Playground or a local console program) that calculate inputs and print categorized messages while handling nulls gracefully.

Reference: Kotlin Docs -> Basics (Basic Syntax, Idioms, Null Safety).

Day 3: Object-Oriented Kotlin
Topics: Custom classes, constructors, initialization blocks (init), interfaces, and inheritance. Understanding data classes, singleton objects, and extension functions.

Task: Build a console-based "Bank Account" system utilizing a Transaction data class and an Account class that processes logic.

Reference: Kotlin Koans -> "Classes" section.

Day 4: Collections & Advanced Kotlin Concepts
Topics: Lists vs. MutableLists, lambda expressions, scope functions (let, apply, also, run), and standard collection operators (map, filter, forEach).

Task: Given a hardcoded list of data classes, write a script that filters specific items and maps them into a list of formatted strings.

Reference: Kotlin Koans -> "Collections" section.

Day 5: First Run & The Android Sandbox
Topics: Bridging Kotlin into Android. Understanding MainActivity and utilizing Logcat for debugging.

Task: Intentionally write code that throws an exception to practice filtering Logcat and reading crash traces, then fix the error to prove language comprehension.

Week 2: Declarative UI (Jetpack Compose)
Day 6: Compose Layout Basics
Topics: Shifting to declarative UI with @Composable functions. Building static screens using Column, Row, and Box. Applying standard styling using Modifier.

Task: Build a static "User Profile Card" containing an image, text fields, and a row of icons.

Reference: Android Basics with Compose -> Unit 2: Building app UI.

Day 7: State & Recomposition
Topics: How Compose tracks changes using remember and mutableStateOf. State hoisting and triggering UI redraws.

Task: Add interactive components (like toggle buttons or text fields) to the profile card that dynamically mutate local state variables when clicked.

Reference: Android Developer Docs -> State and Jetpack Compose.

Day 8: Dynamic Lists
Topics: Replacing standard loops with LazyColumn and LazyRow for memory-efficient scrolling.

Task: Render a dynamic, scrolling list of 50 dummy user data classes into the UI, adding click listeners to specific list items.

Reference: Android Developer Docs -> Lists and grids in Compose.

Day 9: Navigation
Topics: Implementing NavHost and NavController to move between multiple screens. Passing arguments and handling the system back-button stack.

Task: Create a "Feed" screen and a "Details" screen. Connect the list from Day 8 so clicking an item navigates to its specific details page.

Reference: Android Developer Docs -> Navigating with Compose.

Day 10: App 1 Delivery (Stateful Task Tracker)
Task: Combine UI layouts, state management, and navigation to build an in-memory task tracker where users can add, toggle, and delete items across multiple screens. (State will reset on app close).

Week 3: Architecture & The Internet
Day 11: The Android Lifecycle & ViewModels
Topics: Mobile environment constraints (process death, screen rotation). The ViewModel component for separating business logic from the UI.

Task: Refactor the Day 10 Task Tracker by moving all state variables out of the UI and into a ViewModel to survive configuration changes.

Reference: Android Basics with Compose -> Unit 4: Architecture Components.

Day 12: Background Work & Coroutines
Topics: The Main Thread vs. Background Threads. Launching Kotlin Coroutines using viewModelScope.launch and Dispatchers.IO.

Task: Build a UI button that triggers a simulated background delay before updating the UI, ensuring the screen does not freeze.

Reference: Kotlin Docs -> Coroutines basics.

Day 13: Networking APIs (Retrofit Setup)
Topics: Configuring Retrofit and the OkHttp client. Creating data classes that match public JSON API structures and defining API interfaces with suspended requests.

Task: Set up Retrofit dependencies and map a public API (e.g., Rick and Morty API) to Kotlin data classes.

Reference: Android Basics with Compose -> Unit 5: Get data from the internet.

Day 14: Connecting Network to UI
Topics: Exposing data to the UI using StateFlow. Handling network states (Loading, Success, Error).

Task: Fetch real data from the API and broadcast it to the UI, handling missing internet connections gracefully with error screens and loading spinners.

Day 15: App 2 Delivery (Network Explorer)
Task: Build a master-detail application displaying a scrollable feed of remote items, navigating to a detailed view on click, relying entirely on remote data.

Week 4: Persistence & The Capstone
Day 16: Local Database (Room SQLite)
Topics: Offline-first architecture concepts. Defining Room @Entity data classes, @Dao interfaces, and configuring the Room Database builder.

Task: Set up the Room database and write a DAO to insert a list of data and retrieve it as a reactive Flow.

Reference: Android Basics with Compose -> Unit 6: Data persistence.

Day 17: The Repository Pattern
Topics: Decoupling data sources. Creating a Repository class to mediate between Retrofit (Network) and Room (Database).

Task: Write logic to fetch from the network, insert into the database, and emit only the database records to the ViewModel (Single Source of Truth).

Day 18: Capstone Kickoff & Architecture
Topics: Project planning and architectural mapping.

Task: Assign the final project (e.g., an offline-first News Reader or E-commerce catalog). Trainees map out data models, API endpoints, and screen navigation graphs for review before coding.

Day 19: Capstone Execution & Polish
Topics: Independent coding and UI refinement.

Task: Trainees wire up the UI, ViewModel, Repository, and Data Sources. Implement UI polish such as swipe-to-refresh modifiers and custom styling.

Day 20: Capstone Delivery & Review
Topics: Release preparation and code quality.

Task: Generate a signed Release APK. Conduct structured code reviews focusing on clean architecture, coroutine management, and true offline behavior when tested on devices in airplane mode.
