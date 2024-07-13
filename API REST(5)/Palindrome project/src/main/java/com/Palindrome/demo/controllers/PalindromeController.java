package com.Palindrome.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to verify palindromes
 */
@RestController
public class PalindromeController {

    /**
     * Endpoint to verify if a word is a Palindrome.
     * @param word The word to verify.
     * @return A message pointing if a wor is a palindrome or not.
     */

    @GetMapping("/validate-palindrome/{word}")
    public String Palindrome(@PathVariable String word) {
        if(isPalindrome(word)) {
            return "The word " + word + " is a Palindrome";
        } else {
            return "The word " + word + " is not a Palindrome";

        }
    }

    /**
     * Method to verify if a word is a Palindrome.
     * @param word The word to verify.
     * @return true if the word is a Palindrome, false if not.
     */
    private boolean isPalindrome(String word) {

        int length = word.length();
        for(int i = 0; i < length / 2; i++) {
            if(word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}