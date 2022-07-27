function solution(n, l, r){

    let out = [];

    for (let i = 0; i < n.length; i++) {

    }
    
}
// Prob 1

//You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c (s = a + b + c) in such a way that a + b, b + c and c + a are all different strings.
//
// NOTE: + refers to string concatenation.
//
// Example
//
// For s = "xzxzx", the output should be solution(s) = 5.
//
// Consider all the ways to split s into three non-empty parts:

// Prob 2

// You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c (s = a + b + c) in such a way that a + b, b + c and c + a are all different strings.
//
// NOTE: + refers to string concatenation.
//
// Example
//
// For s = "xzxzx", the output should be solution(s) = 5.
//
// Consider all the ways to split s into three non-empty parts:

// prob 3
// You are given an array of arrays a. Your task is to group the arrays a[i] by their mean values, so that arrays with equal mean values are in the same group, and arrays with different mean values are in different groups.
//
// Each group should contain a set of indices (i, j, etc), such that the corresponding arrays (a[i], a[j], etc) all have the same mean. Return the set of groups as an array of arrays, where the indices within each group are sorted in ascending order, and the groups are sorted in ascending order of their minimum element.

// Prob 4
// Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j], where a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.
//
// Example
//
// For a = [10, 2], the output should be solution(a) = 1344.
//
// a[0] ∘ a[0] = 10 ∘ 10 = 1010,
// a[0] ∘ a[1] = 10 ∘ 2 = 102,
// a[1] ∘ a[0] = 2 ∘ 10 = 210,
// a[1] ∘ a[1] = 2 ∘ 2 = 22.
// So the sum is equal to 1010 + 102 + 210 + 22 = 1344.
//
// For a = [8], the output should be solution(a) = 88.
//
// There is only one number in a, and a[0] ∘ a[0] = 8 ∘ 8 = 88, so the answer is 88.
//



// For a = [1, 2, 3], the output should be solution(a) = 198.
//
// a[0] ∘ a[0] = 1 ∘ 1 = 11,
// a[0] ∘ a[1] = 1 ∘ 2 = 12,
// a[0] ∘ a[2] = 1 ∘ 3 = 13,
// a[1] ∘ a[0] = 2 ∘ 1 = 21,
// a[1] ∘ a[1] = 2 ∘ 2 = 22,
// a[1] ∘ a[2] = 2 ∘ 3 = 23,
// a[2] ∘ a[0] = 3 ∘ 1 = 31,
// a[2] ∘ a[1] = 3 ∘ 2 = 32,
// a[2] ∘ a[2] = 3 ∘ 3 = 33.
// The total result is 11 + 12 + 13 + 21 + 22 + 23 + 31 + 32 + 33 = 198.
//
// Input/Output
//
// [execution time limit] 4 seconds (js)
//
// [input] array.integer a
//
// A non-empty array of positive integers.
//
// Guaranteed constraints:
// 1 ≤ a.length ≤ 105,
// 1 ≤ a[i] ≤ 106.
//
// [output] integer64
//
// The sum of all a[i] ∘ a[j]s. It's guaranteed that the answer is less than 253.


function solution(a) {

    let placeholder = [];
    let outNum = 0;

    for(let i = 0; a.length; i++){
        let n1 = a[i];

        for(let j = 0; a.length; j++)

            placeholder.push(n1 + "" + a[j]);
            console.log(n1 + "" + a[j])

    }

    for(let k = 0; placeholder.length; k++){

        outNum = outNum + k[0];

    }

    return outNum;

}
