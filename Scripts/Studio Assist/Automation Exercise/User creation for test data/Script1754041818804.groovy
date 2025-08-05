/*
 * - Create a csv file named 'Data Files/signup.csv' using java.io, listout libraries need to import
 * - Add into logindata.csv file with 2 columns: name, email with 10 rows that fills random name and email for test
 *
*/
import java.io.File
import java.io.FileWriter
import java.io.BufferedWriter
import java.util.Random

// Create File object for 'Data Files/signup.csv'
File csvFile = new File('Data Files/signup.csv')

// Create parent directories if they do not exist
csvFile.getParentFile().mkdirs()

// Create BufferedWriter to write to the CSV file
BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))

// Write CSV header
writer.write('name,email')
writer.newLine()

// Initialize Random instance for generating random data
Random random = new Random()

// Define helper method to generate random alphabetic string of given length
def randomString = { int length ->
    def chars = ('a'..'z') + ('A'..'Z')
    (1..length).collect { chars[random.nextInt(chars.size())] }.join()
}

// Write 10 rows of random name and email data
(1..10).each {
    String name = randomString(8)
    String email = name.toLowerCase() + '@example.com'
    writer.write("${name},${email}")
    writer.newLine()
}

// Close the writer to save the file
writer.close()