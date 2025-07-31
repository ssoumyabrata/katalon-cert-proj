/*
* The following use case is for generating the script that creates CSV test data with StudioAssist
*/

/*
 * - Create a csv file named 'Data Files/data.csv' using java.io, listout libraries need to import
 * - Add into data.csv file with 3 columns: Facility, Visit_Date, Comment with 5 rows that comply with the rules as follows:
 * - 'Facility' must be one of the following values: "Tokyo CURA Healthcare Center", "Hongkong CURA Healthcare Center", "Seoul CURA Healthcare Center"
 * - Visit_Date in dd/mm/yyyy format
 * - Comment is a sentence describing issue regarding making appointment
 * 
*/

// Define the file path for the CSV file
String filePath = 'Data Files/data.csv'

// Define the data rows to write into the CSV file
List<List<String>> dataRows = [
    ['Tokyo CURA Healthcare Center', '15/07/2024', 'Need to reschedule my appointment due to work.'],
    ['Hongkong CURA Healthcare Center', '20/08/2024', 'Requesting a follow-up appointment for test results.'],
    ['Seoul CURA Healthcare Center', '05/09/2024', 'First time appointment, need guidance on procedures.'],
    ['Tokyo CURA Healthcare Center', '12/10/2024', 'Appointment for annual health check-up.'],
    ['Hongkong CURA Healthcare Center', '25/11/2024', 'Need to change appointment time to afternoon.']
]

BufferedWriter writer = null
try {
    // Create BufferedWriter to write to the CSV file
    writer = new BufferedWriter(new FileWriter(filePath))
    // Write the header line
    writer.write('Facility,Visit_Date,Comment')
    writer.newLine()
    // Write each data row
    dataRows.each { row ->
        writer.write(row.join(','))
        writer.newLine()
    }
} catch (IOException e) {
    // Handle any IO exceptions
    e.printStackTrace()
} finally {
    if (writer != null) {
        try {
            // Close the writer to release resources
            writer.close()
        } catch (IOException e) {
            e.printStackTrace()
        }
    }
}