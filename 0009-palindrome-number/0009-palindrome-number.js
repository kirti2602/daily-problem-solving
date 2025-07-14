/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let reverse = 0;
    let xCopy = x;
    while(x > 0){
        let rem = x % 10;
        reverse = (10* reverse) + rem;
        x = Math.floor(x / 10); // removes last digit
    }

    if(reverse === xCopy){
        return true
    }

    return false
};