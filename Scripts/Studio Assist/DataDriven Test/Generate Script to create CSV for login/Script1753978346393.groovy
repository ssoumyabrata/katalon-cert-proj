/*
* The following use case is for generating the script that creates CSV test data with StudioAssist
*/

/*
 * - Create a csv file named 'Data Files/logindata.csv' using java.io, listout libraries need to import
 * - Add into logindata.csv file with 2 columns: Username, Password with 10 rows that fills random username and password for test
 * 
*/

import java.io.FileWriter
import java.io.BufferedWriter
import java.util.UUID

// Create FileWriter and BufferedWriter for 'Data Files/logindata.csv'
FileWriter fileWriter = new FileWriter('Data Files/logindata.csv')
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)

// Write CSV header
bufferedWriter.write('Username,Password')
bufferedWriter.newLine()

// Write 10 rows with random username and password
for (int i = 0; i < 10; i++) {
    // Generate random username using UUID
    String username = 'user_' + UUID.randomUUID().toString().substring(0, 8)
    // Generate random password using UUID
    String password = 'pass_' + UUID.randomUUID().toString().substring(0, 8)
    // Write username and password to CSV
    bufferedWriter.write(username + ',' + password)
    bufferedWriter.newLine()
}

// Close BufferedWriter and FileWriter
bufferedWriter.close()
fileWriter.close()
