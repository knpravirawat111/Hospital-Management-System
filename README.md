# Hospital-Management-System

This is a simple console-based Java application that simulates a hospital management system. The application allows users to add doctors and patients, and also to assign doctors to patients. It's designed to provide basic functionality for hospital management tasks.

## Features

- Add doctors with their names and specializations.
- Add patients with their names, ages, and contact numbers.
- Assign doctors to patients.
- Simple console interface for interacting with the application.
- Basic error handling for invalid inputs.

## How to Use


1. **Application Menu**

   The application presents a simple menu:

   ```
   1. Add Doctor
   2. Add Patient
   3. Assign Doctor to Patient
   4. Exit
   ```

4. **Add Doctor**

   Choose option 1 from the menu. Enter the doctor's name and specialization.

   Example:
   ```
   Enter doctor's name: Dr. Rajiv
   Enter doctor's specialization: Cardiology
   Doctor added successfully.
   ```

5. **Add Patient**

   Choose option 2 from the menu. Enter the patient's name, age, and contact number.

   Example:
   ```
   Enter patient's name: Mahesh
   Enter patient's age: 30
   Enter patient's contact number: 9856893456
   Patient added successfully.
   ```

6. **Assign Doctor to Patient**

   Choose option 3 from the menu. Select a patient and a doctor to assign them.

   Example:
   ```
   Select a patient:
   1. Mahesh

   Select a doctor:
   1. Dr. Rajiv

   Doctor assigned to patient successfully.
   ```

7. **Exit**

   Choose option 4 to exit the application.

## Note

This application is a basic demonstration of hospital management functionality and does not include persistent data storage. In a real-world scenario, you would use a database to store and manage the data.

