public class StringSplit {
    public static String[] solution(String s) {
     
      String[] result = new String[(int)Math.ceil(((double)s.length()) / 2)]; // Create an array with half the length of the string, rounded up
      String[] line   = s.split(""); // split the string into an array
      
      if(s.length() == 0) return result; // if the string is empty return the array with an empty element
      
      for(int i = 0, j = 0; i != line.length; i++){ //move through the array. i - a variable for accessing an element of the array line. j - a variable to refer to an element of the array result
        if(result[j] != null){    // 2) the second action action. the empty array is filled with null. if the element is not null, then the character from action 1 is placed there.
          result[j] += line[i];   // add a symbol to an element
          j++;
            continue;
        }
        result[j] = line[i];      // 1) the first action. we assign a symbol to the element
      }
      if(result[result.length-1].length() == 1){ // if the element consists of a single character, add "_"
        result[result.length-1] += "_";
      }
      return result;
    }
}
