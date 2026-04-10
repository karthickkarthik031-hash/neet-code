class Solution {
    public boolean backspaceCompare(String s, String t) {
        // time: O(n), n = number of characters to loop through
        // space:O(n), n = number of characters store in a Stack

        // s = ab#c, t = ad#c
        // s = ac    t = ac

        // equals method checks content 
        return buildStack(s).equals(buildStack(t));
    }

    public Stack<Character> buildStack(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '#' && !stack.isEmpty()) {
                stack.pop();
                continue;  
            }

            if(c != '#') {
            stack.push(c);
            }
        }

        return stack;
    }
}