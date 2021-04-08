package blurgle

import scala.io.StdIn
import scala.util.matching.Regex
import java.io._
import scala.io.Source

class Blurgling {
    def run(): Unit = {
        //prompt user for text input
        println("Please enter a word to be blurgled")
        var inputWord = StdIn.readLine()

        //make new blurgled txt file 
        val coe = "comedyoferrors.txt"
        val words = Source.fromFile(coe).getLines.mkString
        val bunchOfWords = words.split("\\s+").toArray

        val pw = new PrintWriter(new File("comedyofblurgle.txt"))
        
        for (i <- 0 to (bunchOfWords.length-1)) {
            if ((bunchOfWords(i).toUpperCase()).equals(inputWord.toUpperCase())){
                pw.write("blurgle ")
            } else{
                pw.write(bunchOfWords(i)+ " ")
            }
            
        }
        
        pw.close
    }
  
}
