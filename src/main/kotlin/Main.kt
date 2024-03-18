import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("Distroizm 1.0.0")
    val processBuilder = ProcessBuilder()
    processBuilder.command("neofetch")
    val process = processBuilder.start()
    val reader = BufferedReader(InputStreamReader(process.inputStream))
    var line: String?
    while (reader.readLine().also { line = it } != null)
    {
        println(line)
        if (line?.startsWith("OS:") == true)
        {
            val OsInfo = line?.substringAfter(":")?.trim()
        }
        if (line?.startsWith("DE:") == true)
        {
            val DeInfo = line?.substringAfter(":")?.trim()
        }
        if (line?.startsWith("WM:") == true)
        {
            val WmInfo = line?.substringAfter(":")?.trim()
        }
    }
    val exitCode = process.waitFor()
    println("\nExit code: $exitCode")
}