public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //Input: a string word to add
    //Output: adds the word to the end of letters and prints new letters is...
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //Input: none
    //Output: prints one random character from letters
    public char randomLetter(){
        int randomNumber = (int)(Math.random() * letters.length());
        char randomLetter = letters.charAt(randomNumber);
        return randomLetter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //Input: none
    //Output: returns a string with the company name inserted in the center
    public String companyCentered(){
        //use substring to cut the "letters" in half (length is involved!) return __ + ____+ ____
        int middle = letters.length() / 2;
        String left = letters.substring(0, middle);
        String right = letters.substring(middle);
        return left + company + right;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //Input: none
    //Output: removes the first vower from letters and prints new letters is...
    public void removeFirstVowel(){
                    letters = letters.replaceFirst("[aeiouAEIOU]", "");
            }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //Input: an integer num
    //Output: removes num letters from a random spot in letters and prints new letters is...
    public void removeSome(int num){
        //use substring + Math.random() to get a random spot in the word "letters" such that there are at least "num" characters left
        int index = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0, index) + letters.substring(index + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //Input: a string word to remove
    //Output: removes that word from letters and says new letters is...
    public void removeWord(String word){
        int index = letters.indexOf(word);
        letters = letters.replace(word, "");
    }
}
