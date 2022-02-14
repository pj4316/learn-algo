class Solution {
    fun isValid(s: String): Boolean {
        val chars = s.toCharArray();

        val stack = mutableListOf<Char>()
        for(c in chars) {
            if (c == '(' || c == '[' || c== '{') {
                stack.add(c);
            } else {
                if(stack.isEmpty()) return false
                else if(stack.last() == '(' && c == ')') {
                    stack.removeAt(stack.lastIndex);
                } else if(stack.last() == '{' && c == '}') {
                    stack.removeAt(stack.lastIndex);
                } else if (stack.last() == '[' && c== ']') {
                    stack.removeAt(stack.lastIndex);
                } else return false
            }
        }

        return stack.isEmpty();
    }
}
